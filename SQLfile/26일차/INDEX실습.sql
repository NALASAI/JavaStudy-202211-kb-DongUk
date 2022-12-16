insert into delivery_mst
values
	('202212160001', '부산 동래구 교대역점'),
	('202212160002', '부산 동래구 교대역점'),
	('202212160003', '부산 동래구 교대역점'),
	('202212160004', '부산 동래구 교대역점');
    
select * from delivery_mst;
create index orderId on delivery_mst(`주문번호`);
/* 소괄호 속은 필드이름, 두개의 컬럼을 하나의 인덱스에 종속시킬 수도 있다.*/
show index from delivery_mst;