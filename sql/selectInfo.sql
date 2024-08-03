-- select 조건
-- 1. WHERE 조건

-- 기본 WHERE 조건
-- 특정 조건에 맞는 행을 조회합니다.
SELECT * FROM employees
WHERE salary > 50000;

-- 여러 조건 결합 (AND, OR)
-- 여러 조건을 결합하여 조회합니다.
SELECT * FROM employees
WHERE salary > 50000 AND job_title = 'Engineer';

SELECT * FROM employees
WHERE job_title = 'Engineer' OR job_title = 'Manager';

-- IN 조건
-- 여러 값 중 하나와 일치하는 행을 조회합니다.
SELECT * FROM employees
WHERE job_title IN ('Engineer', 'Manager');

-- BETWEEN 조건
-- 특정 범위 내의 값을 조회합니다.
SELECT * FROM employees
WHERE salary BETWEEN 50000 AND 70000;

-- LIKE 조건
-- 패턴 일치 조건을 사용하여 조회합니다. 와일드카드 %와 _를 사용합니다.
SELECT * FROM employees
WHERE name LIKE 'J%';  -- 'J'로 시작하는 이름

SELECT * FROM employees
WHERE name LIKE '_a%';  -- 두 번째 글자가 'a'인 이름

-- IS NULL 조건
-- NULL 값을 조회합니다.
SELECT * FROM employees
WHERE email IS NULL;

/* ---------------------------------------------------------------------------------------------- */

-- 2. ORDER BY 정렬 조건
-- 데이터를 특정 열을 기준으로 정렬합니다.
SELECT * FROM employees
ORDER BY salary ASC;  -- 급여 기준 오름차순 정렬

SELECT * FROM employees
ORDER BY hire_date DESC;  -- 고용일 기준 내림차순 정렬

/* ---------------------------------------------------------------------------------------------- */

-- 3. LIMIT (또는 TOP) 행 수 제한
-- 조회할 행 수를 제한합니다.

SELECT * FROM employees
LIMIT 10;  -- 상위 10개 행만 조회

/* ---------------------------------------------------------------------------------------------- */

-- 4. GROUP BY 및 HAVING 그룹화 및 그룹 조건
-- GROUP BY
-- 특정 열을 기준으로 데이터를 그룹화합니다.

SELECT job_title, COUNT(*) AS employee_count
FROM employees
GROUP BY job_title;

-- HAVING
-- 그룹화된 데이터에 조건을 적용합니다.
SELECT job_title, AVG(salary) AS average_salary
FROM employees
GROUP BY job_title
HAVING AVG(salary) > 50000;

/* ---------------------------------------------------------------------------------------------- */

-- 5. JOIN 조인 조건
-- INNER JOIN
-- 여러 테이블에서 일치하는 행을 조회합니다.

SELECT employees.name, departments.department_name
FROM employees
INNER JOIN departments ON employees.department_id = departments.id;

-- LEFT JOIN (또는 LEFT OUTER JOIN)
-- 왼쪽 테이블의 모든 행과 오른쪽 테이블에서 일치하는 행을 조회합니다.
SELECT employees.name, departments.department_name
FROM employees
LEFT JOIN departments ON employees.department_id = departments.id;

-- RIGHT JOIN (또는 RIGHT OUTER JOIN)
-- 오른쪽 테이블의 모든 행과 왼쪽 테이블에서 일치하는 행을 조회합니다.
SELECT employees.name, departments.department_name
FROM employees
RIGHT JOIN departments ON employees.department_id = departments.id;

-- 6. UNION 연산자
-- 여러 SELECT 문의 결과를 합칩니다.
-- 중복 제거
SELECT name FROM employees
WHERE department_id = 1
UNION
SELECT name FROM employees
WHERE department_id = 2;

-- 중복 미제거
SELECT name FROM employees
WHERE department_id = 1
UNION ALL
SELECT name FROM employees
WHERE department_id = 2;

SELECT e.name, e.salary, d.department_name
FROM employees e
INNER JOIN departments d ON e.department_id = d.id
WHERE e.salary > 50000 AND e.job_title IN ('Engineer', 'Manager')
ORDER BY e.salary DESC
LIMIT 10;

-- CASE 문은 SQL 쿼리에서 조건에 따라 서로 다른 값을 반환할 수 있도록 합니다.
SELECT 
    CASE 
        WHEN condition1 THEN result1
        WHEN condition2 THEN result2
        ...
        ELSE default_result
    END AS column_name
FROM table_name;
SELECT name, salary,
    CASE 
        WHEN salary >= 5000 THEN 'High'
        WHEN salary >= 3000 THEN 'Medium'
        ELSE 'Low'
    END AS salary_grade
FROM employees;


-- IF 함수는 단일 조건을 평가하여 두 개의 결과 중 하나를 반환합니다. 이는 MySQL에서 사용됩니다.
SELECT IF(condition, true_value, false_value) AS column_name;
SELECT name, salary,
    IF(salary >= 3000, 'High', 'Low') AS salary_grade
FROM employees;

-- IFNULL 함수는 첫 번째 인수가 NULL인 경우, 두 번째 인수를 반환합니다.
SELECT IFNULL(column, default_value) AS column_name;
SELECT name, IFNULL(email, 'No Email') AS email_status
FROM employees;

-- CASE 문과 집계 함수 함께 사용
-- CASE 문은 집계 함수와 함께 사용되어 특정 조건에 따라 값을 집계할 수 있습니다.
-- 부서별로 고액 연봉자(급여 5000 이상)의 수를 계산하는 예제입니다.
SELECT department,
    SUM(CASE WHEN salary >= 5000 THEN 1 ELSE 0 END) AS high_salary_count
FROM employees
GROUP BY department;

SELECT department,
    SUM(IF(salary >= 5000, 1, 0)) AS high_salary_count
FROM employees
GROUP BY department;

