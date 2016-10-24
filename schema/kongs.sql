create user kongs identified by kongs;
alter user kongs account unlock;
grant connect, resource to kongs;

create table member(
id varchar2(20) primary key,
pwd varchar2(20),
name varchar2(20),
nick varchar2(20));

create table team(
teamid varchar2(20) primary key,
id varchar2(20));

create table contest(
title varchar2(30),
sponser varchar2(30),
startday date,
endday date,
photoname varchar2(30),
clickcount number,
category varchar2(30),
regdate date,
contestnum varchar2(30));

create table board(
writer varchar2(20),
regdate date,
ftitle varchar2(20),
contents varchar2(20),
clickcount number,
filename varchar2(20),
boardnum varchar2(20),
category varchar2(20));

create table teamboard(
teamid varchar2(20),
writer varchar2(20),
title varchar2(20),
contents varchar2(20),
clickcount number,
filename varchar2(20),
boardnum varchar2(20),
category varchar2(20));

select * from member;
select * from team;
select * from contest;
select * from board;
select * from teamboard;

commit;

CREATE SEQUENCE seq_contestBoard
start with 1
increment by 1;

CREATE SEQUENCE seq_freeBoard
start with 1
increment by 1;

CREATE SEQUENCE seq_findBoard
start with 1
increment by 1;

CREATE SEQUENCE seq_noticeBoard
start with 1
increment by 1;

CREATE SEQUENCE seq_fileBoard
start with 1
increment by 1;

commit;