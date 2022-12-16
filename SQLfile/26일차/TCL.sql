/*
	TCL (Transaction Control Language)
    1. COMMIT		- 트랜잭션 확정
    2. ROLLBACK		- 트랜잭션 취소
    3. SAVEPOINT	- 중간지점 저장
*/
set autocommit = 0;
select @@autocommit;	/*TCL 실습을 위해 autocommit을 비활성화 한 상태*/
/* autocommit
장점 : 트랜잭션에 대한 코드를 줄일 수 있다.
단점 : 한번실행하면 되돌리는것이 불가능하다.
*/
create database `transaction_study`;
use transaction_study;

create table `transaction_study`.`emp_mst`(
	`id` INT not null auto_increment,
    `name` varchar(15) default null,
    primary key(`id`)
);

start transaction;
savepoint p1;

insert into
	emp_mst
values
	(0, '강동욱'),
    (0, '신경수'),
    (0, '고희주'),
    (0, '장건녕');
select * from emp_mst;

savepoint p2;

update emp_mst
set
	`name` = '문승주'
where
	id = 5;
    
rollback to p2;
select * from emp_mst;
Rollback to p1;	/* Commit 할 시 savepoint는 사라지고 insert한 데이터도 모두 사라진다.*/
select * from emp_mst;	/* savepoint가 없이 rollback을 사용하면 트랜잭션의 시작점으로 돌아간다.*/

commit;