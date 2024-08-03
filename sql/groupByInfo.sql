-- 1. COUNT()
-- 행의 개수를 계산합니다.
-- 테이블의 전체 행 수를 계산합니다.
SELECT COUNT(*) FROM employees;

-- 특정 조건을 만족하는 행 수를 계산합니다.
SELECT COUNT(*) FROM employees WHERE job_title = 'Engineer';

-- 2. SUM()
-- 숫자 열의 합계를 계산합니다.
-- 모든 직원의 급여 합계를 계산합니다.
SELECT SUM(salary) FROM employees;

-- 특정 부서의 급여 합계를 계산합니다.
SELECT SUM(salary) FROM employees WHERE department_id = 1;

-- 3. AVG()
-- 숫자 열의 평균을 계산합니다.
-- 모든 직원의 평균 급여를 계산합니다.
SELECT AVG(salary) FROM employees;

-- 특정 직책의 평균 급여를 계산합니다.
SELECT AVG(salary) FROM employees WHERE job_title = 'Engineer';

-- 4. MAX()
-- 숫자 열의 최대값을 찾습니다.
-- 모든 직원의 최고 급여를 찾습니다.
SELECT MAX(salary) FROM employees;

-- 특정 부서에서 가장 높은 급여를 찾습니다.
SELECT MAX(salary) FROM employees WHERE department_id = 1;

-- 5. MIN()
-- 숫자 열의 최소값을 찾습니다.
-- 모든 직원의 최저 급여를 찾습니다.
SELECT MIN(salary) FROM employees;

-- 특정 직책의 최저 급여를 찾습니다.
SELECT MIN(salary) FROM employees WHERE job_title = 'Engineer';

-- 예시: 각 부서별 직원 수 계산
SELECT department_id, COUNT(*) AS employee_count
FROM employees
GROUP BY department_id;

-- 예시: 각 직책별 평균 급여 계산
SELECT job_title, AVG(salary) AS average_salary
FROM employees
GROUP BY job_title;

-- 예시: 각 부서별 최대 급여 계산
SELECT department_id, MAX(salary) AS highest_salary
FROM employees
GROUP BY department_id;

-- 예시: 각 직책별 최소 급여 계산
SELECT job_title, MIN(salary) AS lowest_salary
FROM employees
GROUP BY job_title;

-- 예시: 각 부서별 총 급여 계산
SELECT department_id, SUM(salary) AS total_salary
FROM employees
GROUP BY department_id;

-- HAVING 절과 함께 사용
-- 예시: 직원 수가 5명 이상인 부서의 ID와 직원 수 계산

SELECT department_id, COUNT(*) AS employee_count
FROM employees
GROUP BY department_id
HAVING COUNT(*) >= 5;

-- 예시: 평균 급여가 60000 이상인 직책과 평균 급여 계산
SELECT job_title, AVG(salary) AS average_salary
FROM employees
GROUP BY job_title
HAVING AVG(salary) >= 60000;

-- 총 계가 null 값이 아닌 '총계'
use youDB;
desc box_office;

select * from box_office;
select if(GROUPING(movie_type) = 1, '총계', movie_type) as '영화 유형', 
concat(format(round(sum(sale_amt) div pow(10, 8)), 0), '억') as '매출'
from box_office
group by movie_type with rollup
order by sum(sale_amt) desc;

CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY, -- 기본 키는 테이블의 각 행을 고유하게 식별합니다. 행이 삽입될 때마다 자동으로 고유한 숫자 값을 생성합니다.
    name VARCHAR(100) NOT NULL, -- 해당 열이 NULL 값을 가질 수 없음을 보장
    email VARCHAR(100) UNIQUE, -- 유일 제약 조건은 열의 모든 값이 고유해야 함을 보장합니다.
    salary DECIMAL(10, 2) CHECK (salary > 0), -- 열의 값이 특정 조건을 만족해야 함을 보장
    hire_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- 열의 기본값을 설정
    department_id INT, --  데이터베이스 검색 속도를 높이기 위해 사용
    FOREIGN KEY (department_id) REFERENCES departments(id) -- 다른 테이블의 기본 키를 참조하여 관계를 설정합니다.
) ENGINE=InnoDB CHARSET=utf8mb4 COMMENT='직원 정보를 저장하는 테이블';














