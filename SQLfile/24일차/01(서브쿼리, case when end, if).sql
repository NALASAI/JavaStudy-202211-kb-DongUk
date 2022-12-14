/* 주어진 데이터 : username만 가지고 있을때(test, test2)*/
select * from user_mst;
select * from user_dtl;

select
	*
from
	user_dtl
where
	id = (select id from user_mst where username = 'test');
/* user_dtl 에서 username 이 test인 컬럼에 대한 데이터를 찾고자 할때 username은 user_dtl 에 없고
	user_mst에 있는 상황일 때 user_dtl과 user_mst가 가지고있는 공통항목인 id를 이용하여 user_mst에서
	username 이 test인 id를 찾아 id가 가지고 있는 데이터를 출력
*/

select
	*
from
	user_dtl
where
	id in (select id from user_mst where username like '%test%');
    
select
	*
from
	user_dtl ud
    left outer join user_mst um on(um.id = ud.id)
where
	um.username = 'test';
    
/* 원하는 컬럼을 만들어 조회하는 방법 */
select
	'아이디' as username,
    12 as `month`,
    14 as `day`;
    
select
	*,
	'테스트' as test
from
	user_dtl;
    
insert into
	user_mst
values
	(0, 'aaa'),
	(0, 'bbb'),
	(0, 'ccc'),
	(0, 'ddd'),
	(0, 'eee');

select
	*,
    ifnull(name, 1) as flag, /* ifnull(x , y) : x의 값이 null일 경우 y를 삽입 */
    nullif(name, null) as flag2, /* nullif(x , y) : x 와 y 가 같으면 y을 반환, 같지 않으면  x를 반환 */
    case
		when ifnull(name, 1) = 1 then 1	/* when 부분이 조건 then부분이 실행부*/
        when ifnull(name, 1) = 2 then 2
        when ifnull(name, 1) = 3 then 3
        when ifnull(name, 1) = 4 then 4
		else 0 
	end as flag3,
    if(name is null, 1, 0) as flag4 /* if(조건부, X, Y) : 조건부에서 참일때 X, 거짓일때 Y를 반환*/
from
	user_dtl;