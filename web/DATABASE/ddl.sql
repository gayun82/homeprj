drop table reply;
create table reply(
	no     number primary key,
	writer varchar2(20),
	wdate  date,
	content varchar(200),
	notice_id number
	);
	
insert into reply values(1,'kim',sysdate, '댓글1',1);
insert into reply values(2,'kang',sysdate, '댓글2',2);