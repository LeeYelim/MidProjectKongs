select * from member;
insert into member values('kwon','123','±ÇÇª¸§','Çª¸§','kongs');
insert into member values('kim','111','±è¸íÈ¯','¸íÈ¯','kongs');

drop table member;

create table member(
id varchar2(20) primary key,
pwd varchar2(20),
name varchar2(20),
nick varchar2(20),
teamid varchar2(20));

select * from board;

insert into board values('writer',sysdate,'ftitle','contents',0,'filename',seq_freeBoard.nextval,'category');
insert into board values('find-writer',sysdate,'find-ftitle','find-contents',0,'find-filename',seq_findBoard.nextval,'find-category');
insert into board values('free-writer',sysdate,'free-ftitle','free-contents',0,'free-filename',seq_freeBoard.nextval,'free-category');
insert into board values('find-writer',sysdate,'find-ftitle','find-contents',0,'find-filename',seq_findBoard.nextval,'find-category');

CREATE SEQUENCE seq_freeBoard
start with 1
increment by 1;

CREATE SEQUENCE seq_findBoard
start with 1
increment by 1;

drop sequence seq_freeBoard;
drop sequence seq_findBoard;

select * from contest;

insert into contest values('title','sponser',to_date('10/17/16','MM/DD//YY'),to_date('16/12/01','YY/MM/DD'),'phtoname',0,'category',sysdate,seq_contestBorad.nextval);
insert into contest values('title','sponser',to_date('10/10/16','MM/DD/YY'),to_date('16/12/24','YY/MM/DD'),'phtoname',0,'category',sysdate,seq_contestBorad.nextval);

CREATE SEQUENCE seq_contestBorad
start with 1
increment by 1;

select * from teamboard;


insert into teamboard values('kongs','notice-writer','notice-title','notice-contents',0,'notice-filename',seq_noticeBoard.nextval,'notice-category');
insert into teamboard values('kongs','file-writer','file-title','file-contents',0,'file-filename',seq_fileBoard.nextval,'file-category');

delete from teamboard where clickcount=0;

drop sequence seq_noticeBoard;
drop sequence seq_fileBoard;

CREATE SEQUENCE seq_noticeBoard
start with 1
increment by 1;

CREATE SEQUENCE seq_fileBoard
start with 1
increment by 1;
