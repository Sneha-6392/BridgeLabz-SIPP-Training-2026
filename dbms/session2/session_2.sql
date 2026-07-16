-- Select the database
USE covid_db;

-- Add NOT NULL constraints to important columns
ALTER TABLE covid_cases
MODIFY Country VARCHAR(50) NOT NULL;

ALTER TABLE covid_cases
MODIFY Date DATE NOT NULL;

ALTER TABLE covid_cases
MODIFY Confirmed_Cases INT NOT NULL;

-- Add composite primary key
ALTER TABLE covid_cases
ADD PRIMARY KEY (Country, Date);

-- Create countries reference table
CREATE TABLE countries (
    Country VARCHAR(50) PRIMARY KEY,
    Population BIGINT
);

-- Insert sample countries
INSERT INTO countries (Country, Population)
VALUES
('India',1380004385),
('USA',331000000),
('UK',67800000);

-- Add foreign key relationship
ALTER TABLE covid_cases
ADD CONSTRAINT fk_country
FOREIGN KEY (Country)
REFERENCES countries(Country);

-- Add CHECK constraint for valid deaths count
ALTER TABLE covid_cases
ADD CONSTRAINT chk_deaths
CHECK (Deaths <= Confirmed_Cases);

-- Set default value for Recoveries
ALTER TABLE covid_cases
MODIFY Recoveries INT DEFAULT 0;

-- Add Last_Updated column with current timestamp
ALTER TABLE covid_cases
ADD Last_Updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP;

-- Add UNIQUE constraint on Country and Date
ALTER TABLE covid_cases
ADD CONSTRAINT unique_country_date
UNIQUE (Country, Date);

-- Display table structure
DESC covid_cases;

-- Display all records
SELECT * FROM covid_cases;