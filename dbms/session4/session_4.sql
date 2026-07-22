-- Select the database
USE covid_db;

-- Add State column for state-wise analysis
ALTER TABLE covid_cases
ADD State VARCHAR(50);

-- Update sample state data
UPDATE covid_cases
SET State = 'Mumbai'
WHERE Country = 'India';

UPDATE covid_cases
SET State = 'New York'
WHERE Country = 'USA';

UPDATE covid_cases
SET State = 'London'
WHERE Country = 'UK';

-- Find countries with above-average death counts
SELECT Country, Deaths
FROM covid_cases
WHERE Deaths >
(
    SELECT AVG(Deaths)
    FROM covid_cases
);

-- Find countries with confirmed cases above 1 million
SELECT DISTINCT Country
FROM covid_cases
WHERE Country IN
(
    SELECT Country
    FROM covid_cases
    WHERE Confirmed_Cases > 1000000
);

-- Identify peak case days for Mumbai
SELECT c1.Date, c1.Confirmed_Cases
FROM covid_cases c1
WHERE c1.State = 'Mumbai'
AND c1.Confirmed_Cases =
(
    SELECT MAX(c2.Confirmed_Cases)
    FROM covid_cases c2
    WHERE c2.State = c1.State
);

-- Show vaccinated population
SELECT Country,
       Vaccinated AS Population,
       'Vaccinated' AS Status
FROM covid_vaccines

UNION

-- Show unvaccinated population
SELECT c.Country,
       (c.Population - v.Vaccinated) AS Population,
       'Unvaccinated' AS Status
FROM covid_cases c
INNER JOIN covid_vaccines v
ON c.Country = v.Country
AND c.Date = v.Date;

-- Find countries present in deaths table but not in cases table
SELECT Country
FROM covid_deaths
WHERE Country NOT IN
(
    SELECT Country
    FROM covid_cases
);