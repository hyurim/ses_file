
use springjpa;

show tables;
drop table guestbook13;
select * from guestbook13;

describe guestbook13;
create table guestbook13 (
    num int auto_increment primary key,
    name varchar(100) not null,
    password varchar(100) not null,
    message text not null,
    inputdate timestamp default current_timestamp
);
delete from guestbook13 where num = "3";
insert into guestbook13 (name, password, message) value ("kyo1001", 111, "1111111111111111");
insert into guestbook13 (name, password, message) value ("kyo1002", 222, "2222222222222222");
insert into guestbook13 (name, password, message) value ("kyo1003", 333, "3333333333333333");
insert into guestbook13 (name, password, message) value ("kyo1004", 444, "4444444444444444");
insert into guestbook13 (name, password, message) value ("kyo1005", 555, "5555555555555555");
insert into guestbook13 (name, password, message) value ("kyo1006", 666, "6666666666666666");
insert into guestbook13 (name, password, message) value ("kyo1007", 777, "7777777777777777");
insert into guestbook13 (name, password, message) value ("kyo1008", 888, "8888888888888888");
insert into guestbook13 (name, password, message) value ("kyo1009", 999, "9999999999999999");
insert into guestbook13 (name, password, message) value ("kyo1010", 000, "0000000000000000");