
/*use hr;
show tables;
select * from employees;
select * from departments;
*/

-- 1번 --
/*
from, where, group by, having, select, order by
*/
-- 2번 --

/*
join
*/

-- 3번 --

/* 
PRIMARY KEY 제약 조건, 
FOREIGN KEY 제약 조건 , 
UNIQUE 제약 조건, 
CHECK 제약 조건,
DEFAULT 정의, 
NULL 값 허용
*/

-- 4번 --

select e.employee_id as '사원번호',
concat(e.first_name, ' ', e.last_name) as '사원이름',
d.department_name as '부서명' from employees e
join departments d on e.department_id = d.department_id
order by e.employee_id;

-- 5번 --

select employee_id as '사원번호',
concat(first_name, ' ', last_name) as '사원이름',
format(salary,0) as '기존 급여',
format(salary*1.1,0) as '인상된 급여' from employees
order by salary desc;

-- 6번 --

create table GIRL_GROUP (
GROUP_NO int primary key,
GROUP_NAME varchar(30) unique,
DEBUT_DATE timestamp default current_timestamp,
AGENCY varchar(30) not null
);

-- 7번 -- 

create table group_members (
member_no int primary key,
member_name varchar(30) not null,
group_no int,
foreign key (group_no) references girl_group(group_no)
);

-- 8번 -- 

select group_name as '그룹명',
date_format(DEBUT_DATE, '%y-%m-%d') as '데뷔날짜',
agency as '기획사' from girl_group
order by debut_date desc;

-- 9번 -- 

select g.group_name as '그룹명',
 count(m.group_no) as '멤버수' from girl_group g
join group_members m on g.group_no = m.group_no
group by m.group_no;

-- 10번 --

select g.group_name as '그룹명',
count(m.group_no) as '멤버수' from girl_group g
join group_members m on g.group_no = m.group_no
group by m.group_no
having count(m.group_no) >= 5;