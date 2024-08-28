-- drop table guestbook13;

use springjpa;
describe web5_member;
describe web5_board;
describe web5_reply;
show tables;
select * from web5_member;
select * from web5_board;
select * from web5_reply;
insert into web5_member (member_id, member_password, member_name, email, phone, address) value ("abcde", "11111111", "가나다", "kyo2301@naver.com", "01012345678", "인천");
select * from web5_member;


create table web5_member (
	 member_id varchar(30) primary key,          -- 회원을 구분하는 아이디
	 member_password varchar(100) not null,      -- 비밀번호(암호화)
	 member_name varchar(30) not null,           -- 회원 이름
	 email varchar(50),                          -- 이메일
	 phone varchar(30),                          -- 전화번호
	 address varchar(200),                       -- 주소
	 enabled tinyint(1) default 1 check(enabled in (0, 1)),    -- 계정상태. 1:사용가능, 0:사용불가능
	 rolename varchar(30) default 'role_user' check (rolename in ('ROLE_USER', 'ROLE_ADMIN'))    -- 사용자 구분. 'role_user', 'role_admin' 중 하나
);

create table web5_board (
    board_num int auto_increment primary key,    -- 게시글 일련번호
    member_id varchar(30),                       -- 작성자 id (외래 키)
    title varchar(1000) not null,                -- 글제목
    contents text not null,                      -- 글내용
    view_count int default 0,                    -- 조회수
    like_count int default 0,                    -- 추천수
    original_name varchar(300),                  -- 첨부파일 원래 이름
    file_name varchar(100),                      -- 첨부파일 저장된 이름
    create_date timestamp default current_timestamp,  -- 작성 시간
    update_date timestamp default current_timestamp 
    			on update current_timestamp,  -- 수정 시간
    constraint foreign key (member_id) 
    			references web5_member (member_id) on delete set null
);
select * from web5_board;
-- 게시판 리플 테이블 (web5_reply)
create table web5_reply (
                            reply_num int auto_increment primary key,    -- 리플 일련번호
                            board_num int,                               -- 게시글 번호 (외래 키)
                            member_id varchar(30),                       -- 작성자 id (외래 키)
                            contents varchar(2000) not null,             -- 리플 내용
                            create_date timestamp default current_timestamp,  -- 작성 시간
                            constraint foreign key (board_num) references web5_board (board_num) on delete cascade,
                            constraint foreign key (member_id) references web5_member (member_id) on delete set null
);
select * from web5_reply;

create table ajax_member (
id varchar(30) primary key,
name varchar(30) not null
);

select * from ajax_member;
describe ajax_member;
drop table ajax_member;

create table ajax_comment(
num int primary key auto_increment,
name varchar(30) not null,
comment varchar(1000) not null);

insert into ajax_comment (name, comment) values ("박", "가나다");
insert into ajax_comment (name, comment) values ("김", "1");
insert into ajax_comment (name, comment) values ("나", "12");
insert into ajax_comment (name, comment) values ("이", "123");
insert into ajax_comment (name, comment) values ("임", "1234");

describe ajax_comment;
select * from ajax_comment;