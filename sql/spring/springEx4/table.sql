
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

