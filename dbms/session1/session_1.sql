-- Create the database
CREATE DATABASE covid_db;

-- Select the database
USE covid_db;

-- Create covid_cases table
CREATE TABLE covid_cases (
    Country VARCHAR(50),
    Date DATE,
    Confirmed_Cases INT,
    Deaths INT,
    Recoveries INT,
    Population BIGINT
);

-- Create covid_deaths table
CREATE TABLE covid_deaths (
    Country VARCHAR(50),
    Date DATE,
    Deaths INT
);

-- Create covid_vaccines table
CREATE TABLE covid_vaccines (
    Country VARCHAR(50),
    Date DATE,
    Vaccinated BIGINT,
    Fully_Vaccinated BIGINT
);

-- Insert sample records into covid_cases
INSERT INTO covid_cases
(Country, Date, Confirmed_Cases, Deaths, Recoveries, Population)
VALUES
('India','2021-01-01',10200000,148000,9800000,1380004385),
('India','2021-01-02',10250000,148500,9850000,1380004385),
('USA','2021-01-01',20000000,350000,12000000,331000000),
('USA','2021-01-02',20100000,351500,12100000,331000000),
('UK','2021-01-01',2500000,74000,1800000,67800000),
('UK','2021-01-02',2520000,74500,1815000,67800000);

-- Display all records
SELECT * FROM covid_cases;

-- Update confirmed cases for India
UPDATE covid_cases
SET Confirmed_Cases = 10300000
WHERE Country = 'India'
AND Date = '2021-01-02';

-- Display updated records
SELECT * FROM covid_cases
WHERE Country = 'India';

-- Insert an incorrect record
INSERT INTO covid_cases
VALUES
('IN','2021-01-03',10400000,149000,9900000,1380004385);

-- Delete the incorrect record
DELETE FROM covid_cases
WHERE Country = 'IN';

-- Display records after deletion
SELECT * FROM covid_cases;

-- Add vaccination_rate column
ALTER TABLE covid_cases
ADD vaccination_rate DECIMAL(5,2);

-- Display table structure
DESC covid_cases;

-- Update vaccination rate for India
UPDATE covid_cases
SET vaccination_rate = 65.40
WHERE Country = 'India';

-- Update vaccination rate for USA
UPDATE covid_cases
SET vaccination_rate = 58.75
WHERE Country = 'USA';

-- Update vaccination rate for UK
UPDATE covid_cases
SET vaccination_rate = 72.30
WHERE Country = 'UK';

-- Display updated vaccination rates
SELECT * FROM covid_cases;

-- Add Active_Cases column
ALTER TABLE covid_cases
ADD Active_Cases INT;

-- Calculate active cases
UPDATE covid_cases
SET Active_Cases = Confirmed_Cases - Deaths - Recoveries;

-- Display final table
SELECT * FROM covid_cases;

-- Drop covid_deaths table
DROP TABLE covid_deaths;

-- Display remaining tables
SHOW TABLES;