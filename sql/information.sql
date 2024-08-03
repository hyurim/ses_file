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

-- 개념(단답형) : 3문제
-- hr 테이블 활용 select : 2문제
-- 테이블 생성 : 2문제
-- 생성한 테이블 활용 : select 3문제
use hr;
show tables;

select * from countries;

/*
SQL(Structured Query Language)은 관계형 데이터베이스를 관리하고 조작하는 데 사용되는 표준 언어입니다. SQL은 데이터베이스의 구조를 정의하고 데이터를 질의하며, 업데이트하고 삭제하는 등의 작업을 수행할 수 있게 해줍니다. SQL의 기본 개념과 주요 기능을 살펴보겠습니다.

### 1. **기본 개념**

- **테이블(Table)**: 데이터가 저장되는 구조화된 데이터의 집합. 테이블은 행(Row)과 열(Column)로 구성됩니다.
  
- **행(Row)**: 테이블의 개별 레코드. 각 행은 하나의 엔터티를 나타냅니다.
  
- **열(Column)**: 테이블의 속성. 각 열은 데이터의 특정 속성(예: 이름, 나이)을 나타냅니다.

- **스키마(Schema)**: 데이터베이스의 구조를 정의하는 데이터베이스 객체(테이블, 뷰, 인덱스 등)의 집합.

### 2. **SQL 명령어**

SQL은 크게 세 가지 범주로 나눌 수 있습니다:

#### 데이터 정의 언어(DDL, Data Definition Language)
DDL 명령어는 데이터베이스 구조를 정의하거나 수정하는 데 사용됩니다.
- **`CREATE`**: 데이터베이스, 테이블, 뷰, 인덱스 등을 생성합니다.
  - 예: `CREATE TABLE employees (id INT PRIMARY KEY, name VARCHAR(100));`
  
- **`ALTER`**: 기존 데이터베이스 객체의 구조를 수정합니다.
  - 예: `ALTER TABLE employees ADD COLUMN email VARCHAR(100);`
  
- **`DROP`**: 데이터베이스 객체를 삭제합니다.
  - 예: `DROP TABLE employees;`

#### 데이터 조작 언어(DML, Data Manipulation Language)
DML 명령어는 데이터베이스의 데이터를 조작하는 데 사용됩니다.
- **`SELECT`**: 데이터베이스에서 데이터를 조회합니다.
  - 예: `SELECT * FROM employees;`
  
- **`INSERT`**: 데이터베이스에 새 데이터를 삽입합니다.
  - 예: `INSERT INTO employees (id, name) VALUES (1, 'Alice');`
  
- **`UPDATE`**: 기존 데이터를 수정합니다.
  - 예: `UPDATE employees SET name = 'Bob' WHERE id = 1;`
  
- **`DELETE`**: 데이터를 삭제합니다.
  - 예: `DELETE FROM employees WHERE id = 1;`

#### 데이터 제어 언어(DCL, Data Control Language)
DCL 명령어는 데이터베이스의 접근 권한을 제어하는 데 사용됩니다.
- **`GRANT`**: 사용자에게 특정 권한을 부여합니다.
  - 예: `GRANT SELECT ON employees TO user1;`
  
- **`REVOKE`**: 사용자로부터 특정 권한을 회수합니다.
  - 예: `REVOKE SELECT ON employees FROM user1;`

### 3. **SQL 쿼리 구성 요소**

- **`SELECT`**: 조회할 열을 지정합니다.
  - 예: `SELECT name, email FROM employees;`
  
- **`FROM`**: 데이터가 조회될 테이블을 지정합니다.
  - 예: `FROM employees`
  
- **`WHERE`**: 조건을 지정하여 조회할 데이터의 범위를 제한합니다.
  - 예: `WHERE age > 30`
  
- **`JOIN`**: 두 개 이상의 테이블을 결합하여 데이터를 조회합니다.
  - 예: `SELECT employees.name, departments.dept_name FROM employees JOIN departments ON employees.dept_id = departments.dept_id;`
  
- **`GROUP BY`**: 데이터를 그룹화하여 집계 함수와 함께 사용합니다.
  - 예: `SELECT department, COUNT(*) FROM employees GROUP BY department;`
  
- **`HAVING`**: `GROUP BY`로 그룹화된 데이터에 조건을 추가합니다.
  - 예: `HAVING COUNT(*) > 10`
  
- **`ORDER BY`**: 결과를 정렬합니다.
  - 예: `ORDER BY name ASC;`

### 4. **집계 함수**

집계 함수는 그룹화된 데이터를 계산하는 데 사용됩니다.
- **`COUNT()`**: 행의 수를 계산합니다.
  - 예: `SELECT COUNT(*) FROM employees;`
  
- **`SUM()`**: 열의 합계를 계산합니다.
  - 예: `SELECT SUM(salary) FROM employees;`
  
- **`AVG()`**: 열의 평균값을 계산합니다.
  - 예: `SELECT AVG(salary) FROM employees;`
  
- **`MIN()`**: 열의 최소값을 찾습니다.
  - 예: `SELECT MIN(salary) FROM employees;`
  
- **`MAX()`**: 열의 최대값을 찾습니다.
  - 예: `SELECT MAX(salary) FROM employees;`

### 5. **서브쿼리**

서브쿼리는 다른 쿼리 내에 포함된 쿼리입니다.
- **단일 값 서브쿼리**: 단일 값을 반환하는 서브쿼리.
  - 예: `SELECT * FROM employees WHERE salary = (SELECT MAX(salary) FROM employees);`
  
- **다중 값 서브쿼리**: 여러 값을 반환하는 서브쿼리.
  - 예: `SELECT * FROM employees WHERE department IN (SELECT department FROM departments WHERE location = 'NYC');`
  
- **상관 서브쿼리**: 외부 쿼리와 연관된 서브쿼리.
  - 예: `SELECT name FROM employees e1 WHERE salary > (SELECT AVG(salary) FROM employees e2 WHERE e1.department = e2.department);`

### 6. **트랜잭션**

트랜잭션은 데이터베이스의 일련의 작업을 하나의 단위로 묶는 개념입니다. 트랜잭션은 ACID 속성을 따릅니다:
- **Atomicity(원자성)**: 트랜잭션의 모든 작업이 성공적으로 완료되거나 전혀 완료되지 않아야 합니다.
- **Consistency(일관성)**: 트랜잭션이 완료된 후 데이터베이스는 일관된 상태를 유지해야 합니다.
- **Isolation(격리성)**: 트랜잭션은 서로 독립적으로 실행되어야 합니다.
- **Durability(지속성)**: 트랜잭션이 완료된 후에는 그 결과가 영구적으로 저장됩니다.

트랜잭션 관련 명령어:
- **`BEGIN TRANSACTION`**: 트랜잭션을 시작합니다.
- **`COMMIT`**: 트랜잭션을 완료하고 변경사항을 저장합니다.
- **`ROLLBACK`**: 트랜잭션을 취소하고 변경사항을 원래 상태로 되돌립니다.

### 7. **인덱스**

인덱스는 데이터베이스 테이블의 검색 성능을 향상시키는 데이터 구조입니다.
- **`CREATE INDEX`**: 테이블의 열에 인덱스를 생성합니다.
  - 예: `CREATE INDEX idx_name ON employees(name);`
  
- **`DROP INDEX`**: 테이블의 인덱스를 삭제합니다.
  - 예: `DROP INDEX idx_name ON employees;`

### 8. **뷰(View)**

뷰는 하나 이상의 테이블을 기반으로 한 가상의 테이블입니다.
- **`CREATE VIEW`**: 새로운 뷰를 생성합니다.
  - 예: `CREATE VIEW employee_summary AS SELECT name, SUM(salary) AS total_salary FROM employees GROUP BY name;`
  
- **`DROP VIEW`**: 뷰를 삭제합니다.
  - 예: `DROP VIEW employee_summary;`

이러한 개념들을 이해하고 사용함으로써 SQL을 통해 데이터를 효율적으로 관리하고 분석할 수 있습니다. SQL은 강력하고 유연한 데이터베이스 관리 언어로, 복잡한 데이터 처리 및 분석 작업을 수행할 수 있습니다.
*/



