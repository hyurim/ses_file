-- create schema springtest;
use springtest;
create table info (
	no INT AUTO_INCREMENT PRIMARY KEY,
    id VARCHAR(10) NOT NULL UNIQUE,
    pw VARCHAR(20) NOT NULL,
    address VARCHAR(10) NOT NULL,
    phone VARCHAR(11) NOT NULL,
    email VARCHAR(50) NOT NULL
);

create table info_search (
no int auto_increment primary key,
id varchar(10) not null unique,
search varchar(100) not null);

select * from info;
drop table info;

select * from info_search;

SELECT DATABASE();
USE hr;
SHOW TABLES;
SELECT 'countries' AS table_name, COUNT(*) AS row_count FROM countries
UNION ALL
SELECT 'departments' AS table_name, COUNT(*) AS row_count FROM departments
UNION ALL
SELECT 'emp_details_view' AS table_name, COUNT(*) AS row_count FROM emp_details_view
UNION ALL
SELECT 'employees' AS table_name, COUNT(*) AS row_count FROM employees
UNION ALL
SELECT 'job_history' AS table_name, COUNT(*) AS row_count FROM job_history
UNION ALL
SELECT 'jobs' AS table_name, COUNT(*) AS row_count FROM jobs
UNION ALL
SELECT 'locations' AS table_name, COUNT(*) AS row_count FROM locations
UNION ALL
SELECT 'regions' AS table_name, COUNT(*) AS row_count FROM regions;

select * from employees;
select * from departments;
