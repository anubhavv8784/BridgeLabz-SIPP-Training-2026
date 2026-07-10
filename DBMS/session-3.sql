USE coviddb;

-- Foreign key checks OFF
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS covid_vaccines;
DROP TABLE IF EXISTS covid_deaths;
DROP TABLE IF EXISTS covid_cases;
DROP TABLE IF EXISTS countries;

SET FOREIGN_KEY_CHECKS = 1;

-- Countries Table
CREATE TABLE countries(
    country_id INT PRIMARY KEY,
    country_name VARCHAR(50),
    continent VARCHAR(50)
);

INSERT INTO countries VALUES
(1,'India','Asia'),
(2,'USA','North America'),
(3,'Brazil','South America'),
(4,'Germany','Europe'),
(5,'Japan','Asia');

-- Covid Cases Table
CREATE TABLE covid_cases(
    country_id INT,
    report_date DATE,
    confirmed_cases INT,
    deaths INT,
    recoveries INT,
    population BIGINT,
    FOREIGN KEY(country_id) REFERENCES countries(country_id)
);

INSERT INTO covid_cases VALUES
(1,'2024-01-01',45000000,533000,44400000,1400000000),
(2,'2024-01-01',103000000,1120000,100000000,331000000),
(3,'2024-01-01',38000000,700000,37000000,214000000),
(4,'2024-01-01',39000000,175000,38500000,83000000),
(5,'2024-01-01',34000000,75000,33800000,126000000);

-- Covid Deaths Table
CREATE TABLE covid_deaths(
    country_id INT,
    report_date DATE,
    new_deaths INT,
    FOREIGN KEY(country_id) REFERENCES countries(country_id)
);

INSERT INTO covid_deaths VALUES
(1,'2024-01-01',120),
(2,'2024-01-01',150),
(3,'2024-01-01',95),
(4,'2024-01-01',40),
(5,'2024-01-01',15);

-- Covid Vaccines Table
CREATE TABLE covid_vaccines(
    country_id INT,
    report_date DATE,
    vaccination_status VARCHAR(50),
    FOREIGN KEY(country_id) REFERENCES countries(country_id)
);

INSERT INTO covid_vaccines VALUES
(1,'2024-01-01','Fully Vaccinated'),
(2,'2024-01-01','Fully Vaccinated'),
(3,'2024-01-01','Partially Vaccinated'),
(4,'2024-01-01','Fully Vaccinated'),
(5,'2024-01-01','Booster Dose');

-- =========================
-- SESSION 3 ANSWERS
-- =========================

-- Use Case 1
SELECT c.country_name,
       cc.report_date,
       cc.confirmed_cases
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
ORDER BY confirmed_cases DESC
LIMIT 1;

-- Use Case 2
SELECT c.country_name,
       d.new_deaths,
       v.vaccination_status
FROM covid_deaths d
LEFT JOIN covid_vaccines v
ON d.country_id = v.country_id
AND d.report_date = v.report_date
INNER JOIN countries c
ON d.country_id = c.country_id;

-- Use Case 3
SELECT c.continent,
       SUM(cc.deaths) AS total_deaths
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
GROUP BY c.continent;

-- Use Case 4
SELECT report_date,
       AVG(new_deaths) AS average_daily_deaths
FROM covid_deaths
GROUP BY report_date
ORDER BY report_date;

-- Use Case 5
SELECT c.country_name,
       confirmed_cases,
       population,
       ROUND((confirmed_cases * 100.0 / population),2) AS infection_rate
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
ORDER BY infection_rate DESC;