SELECT * FROM anubhavdbms.covid_cases;
INSERT INTO covid_cases
(country, report_date, confirmed_cases, deaths, recoveries, population)
VALUES
('India', '2024-01-01', 45000000, 533000, 44400000, 1400000000),
('India', '2024-02-01', 45100000, 533500, 44500000, 1400000000),

('USA', '2024-01-01', 103000000, 1120000, 100000000, 331000000),
('USA', '2024-02-01', 104000000, 1115000, 101000000, 331000000),

('UK', '2024-01-01', 25000000, 230000, 24700000, 67000000),
('UK', '2024-02-01', 25100000, 231000, 24800000, 67000000);

SELECT * FROM covid_cases;
ALTER TABLE covid_cases
ADD vaccination_rate DECIMAL(5,2);

UPDATE covid_cases
SET vaccination_rate = 70.50
WHERE country = 'India';

DESC covid_cases;
SET SQL_SAFE_UPDATES = 0;

DELETE FROM covid_cases
WHERE country = '???';

DELETE FROM covid_cases
WHERE country = 'India'
AND report_date = '2024-01-01'
LIMIT 1;

SELECT * FROM covid_cases;