-- Select the database
USE covid_db;

-- Insert sample data into covid_deaths
INSERT INTO covid_deaths (Country, Date, Deaths)
VALUES
('India','2021-01-01',148000),
('USA','2021-01-01',350000),
('UK','2021-01-01',74000);

-- Insert sample data into covid_vaccines
INSERT INTO covid_vaccines (Country, Date, Vaccinated, Fully_Vaccinated)
VALUES
('India','2021-01-01',1000000,500000),
('USA','2021-01-01',2000000,1200000);

-- Create continents table
CREATE TABLE continents (
    Country VARCHAR(50) PRIMARY KEY,
    Continent VARCHAR(50)
);

-- Insert sample continent data
INSERT INTO continents
VALUES
('India','Asia'),
('USA','North America'),
('UK','Europe');

-- Find country with highest confirmed cases on a specific date
SELECT c.Country, cc.Confirmed_Cases
FROM covid_cases cc
INNER JOIN countries c
ON cc.Country = c.Country
WHERE cc.Date = '2021-01-01'
ORDER BY cc.Confirmed_Cases DESC
LIMIT 1;

-- Show deaths and vaccination data for all countries
SELECT d.Country, d.Date, d.Deaths, v.Vaccinated, v.Fully_Vaccinated
FROM covid_deaths d
LEFT JOIN covid_vaccines v
ON d.Country = v.Country
AND d.Date = v.Date;

-- Calculate total deaths by continent
SELECT ct.Continent, SUM(cc.Deaths) AS Total_Deaths
FROM covid_cases cc
INNER JOIN continents ct
ON cc.Country = ct.Country
GROUP BY ct.Continent;

-- Calculate average deaths per day
SELECT Date, AVG(Deaths) AS Average_Deaths
FROM covid_cases
GROUP BY Date
ORDER BY Date;

-- Find countries with highest infection rate
SELECT Country,
       Confirmed_Cases,
       Population,
       (Confirmed_Cases * 100.0 / Population) AS Infection_Rate
FROM covid_cases
ORDER BY Infection_Rate DESC;