
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
delete from teamboard where clickcount=0;

insert into teamboard values('kongs','notice-writer','notice-title','notice-contents',0,'notice-filename',seq_noticeBoard.nextval,'notice-category');
insert into teamboard values('kongs','file-writer','file-title','file-contents',0,'file-filename',seq_fileBoard.nextval,'file-category');
insert into teamboard values('kongs','notice-writer2','notice-title2','notice-contents2',0,'notice-filename2',seq_noticeBoard.nextval,'notice-category');
insert into teamboard values('kongs','file-writer2','file-title2','file-contents2',0,'file-filename2',seq_fileBoard.nextval,'file-category');


drop sequence seq_noticeBoard;
drop sequence seq_fileBoard;

CREATE SEQUENCE seq_noticeBoard
start with 1
increment by 1;

CREATE SEQUENCE seq_fileBoard
start with 1
increment by 1;

CREATE SEQUENCE seq_contestBoard
start with 1
increment by 1;

update contest set photoname='photo1' where contestnum=1;
update contest set photoname='photo2' where contestnum=2;