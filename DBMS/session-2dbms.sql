-- Create Database
CREATE DATABASE CovidDB;
USE CovidDB;

-- Create Countries Reference Table
CREATE TABLE countries (
    Country VARCHAR(100) PRIMARY KEY,
    Continent VARCHAR(50)
);

-- Create COVID Cases Table
CREATE TABLE covid_cases (
    Country VARCHAR(100) NOT NULL,
    Date DATE NOT NULL,
    Confirmed_Cases INT NOT NULL,
    Deaths INT,
    Recoveries INT DEFAULT 0,
    Last_Updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    -- Composite Primary Key
    PRIMARY KEY (Country, Date),

    -- Foreign Key
    CONSTRAINT fk_country
    FOREIGN KEY (Country)
    REFERENCES countries(Country),

    -- Check Constraint
    CONSTRAINT chk_deaths
    CHECK (Deaths <= Confirmed_Cases)

    -- UNIQUE (Country, Date) is NOT required because
    -- PRIMARY KEY already makes (Country, Date) unique.
);

-- Insert Data into Countries Table
INSERT INTO countries VALUES
('India', 'Asia'),
('USA', 'North America'),
('Japan', 'Asia'),
('China', 'Asia');

-- Insert Data into COVID Cases Table
INSERT INTO covid_cases
(Country, Date, Confirmed_Cases, Deaths)
VALUES
('India', '2024-01-01', 1000, 20),
('USA', '2024-01-01', 2000, 50),
('Japan', '2024-01-01', 800, 10);

-- Display Data
SELECT * FROM countries;
SELECT * FROM covid_cases;