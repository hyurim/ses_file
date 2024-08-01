-- 1. 데이터베이스와 테이블 관리 명령어 DDL (Data Definition Language)

-- CREATE DATABASE
-- 데이터베이스를 생성합니다.
CREATE DATABASE my_database;

-- USE
-- 특정 데이터베이스를 사용합니다.
USE my_database;

-- CREATE TABLE
-- 테이블을 생성합니다.
CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    position VARCHAR(50),
    salary DECIMAL(10, 2),
    hire_date DATE
);
-- DROP TABLE
-- 테이블을 삭제합니다.
DROP TABLE employees;

-- TRUNCATE TABLE
-- 테이블의 모든 데이터를 삭제합니다(구조는 유지).
TRUNCATE TABLE employees;

-- 2. 데이터 조작 명령어 DML (Data Manipulation Language)

-- INSERT
-- 테이블에 데이터를 삽입합니다.
INSERT INTO employees (name, position, salary, hire_date)
VALUES ('John Doe', 'Software Engineer', 60000, '2023-01-15');

-- SELECT
-- 테이블에서 데이터를 조회합니다.
SELECT * FROM employees;
SELECT name, salary FROM employees WHERE position = 'Software Engineer';

-- UPDATE
-- 테이블의 데이터를 수정합니다.
UPDATE employees
SET salary = 65000
WHERE name = 'John Doe';

-- DELETE
-- 테이블의 데이터를 삭제합니다.
DELETE FROM employees
WHERE name = 'John Doe';

-- 3. 테이블 구조 변경 명령어

-- ALTER TABLE
-- 테이블의 구조를 변경합니다.
-- 컬럼 추가
ALTER TABLE employees ADD COLUMN email VARCHAR(100);
-- 컬럼 이름 변경
ALTER TABLE employees RENAME COLUMN position TO job_title;
-- 컬럼 삭제
ALTER TABLE employees DROP COLUMN email;

-- 4. 인덱스 관리 명령어

-- CREATE INDEX
-- 인덱스를 생성합니다.

CREATE INDEX idx_salary ON employees (salary);

-- DROP INDEX
-- 인덱스를 삭제합니다.
DROP INDEX idx_salary ON employees;

-- 5. 고급 SQL 명령어

-- JOIN
-- 여러 테이블의 데이터를 결합하여 조회합니다.
SELECT employees.name, departments.department_name
FROM employees
JOIN departments ON employees.department_id = departments.id;

-- GROUP BY
-- 데이터를 그룹화하여 집계합니다.
SELECT job_title, AVG(salary) AS average_salary
FROM employees
GROUP BY job_title;

-- ORDER BY
-- 데이터를 정렬합니다.
SELECT * FROM employees
ORDER BY hire_date DESC;

-- HAVING
-- GROUP BY와 함께 조건을 지정합니다.
SELECT job_title, AVG(salary) AS average_salary
FROM employees
GROUP BY job_title
HAVING AVG(salary) > 50000;

CREATE DATABASE company_db;
USE company_db;

CREATE TABLE departments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    department_name VARCHAR(100) NOT NULL
);

-- 4. 권한 관리 DCL
-- GRANT: 사용자에게 특정 권한을 부여합니다
GRANT SELECT, INSERT ON my_database.* TO 'username'@'localhost';

-- REVOKE: 사용자로부터 특정 권한을 취소합니다
REVOKE INSERT ON my_database.* FROM 'username'@'localhost';

-- DDL (Data Definition Language): 데이터베이스 구조 정의
-- CREATE, ALTER, DROP, TRUNCATE
-- DML (Data Manipulation Language): 데이터 조작
-- INSERT, SELECT, UPDATE, DELETE
-- DCL (Data Control Language): 권한 관리
-- GRANT, REVOKE

-- 1. 데이터베이스 및 테이블 생성
CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    job_title VARCHAR(50),
    salary DECIMAL(10, 2),
    hire_date DATE,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(id)
);

-- 2. 데이터 삽입
INSERT INTO departments (department_name) VALUES ('Engineering'), ('HR'), ('Marketing');

INSERT INTO employees (name, job_title, salary, hire_date, department_id)
VALUES 
('Alice Smith', 'Engineer', 70000, '2022-06-01', 1),
('Bob Johnson', 'HR Manager', 60000, '2021-03-15', 2),
('Carol Williams', 'Marketing Specialist', 55000, '2020-09-23', 3);

-- 3. 데이터 조회 및 집계
SELECT e.name, d.department_name, e.salary
FROM employees e
JOIN departments d ON e.department_id = d.id;

SELECT department_name, AVG(salary) AS average_salary
FROM employees e
JOIN departments d ON e.department_id = d.id
GROUP BY department_name;







