SELECT
	om.id AS '주문번호',
	od.product_id AS '제품번호',
	pm.product_name,
	pm.product_price,
	od.order_stock,
	om.user_id,
	um.`name`
FROM
	order_mst om
	LEFT OUTER JOIN order_dtl od ON(od.order_id = om.id)
	LEFT OUTER JOIN product_mst pm ON(pm.id = od.product_id)
	LEFT OUTER JOIN user_mst um ON(om.user_id = um.id)
ORDER BY
	od.id;
	
	
SELECT
	nm.title,
	nm.content,
	wm.`name`,
	ni.img_name
FROM
	study_notice_mst nm
	LEFT OUTER JOIN study_writer_mst wm ON(wm.id = nm.writer_id)
	LEFT OUTER JOIN study_notice_img ni ON(ni.notice_id = nm.id);
	
/*============================================================================================================*/
/*2022-12-12*/
/*OUTER_JOIN 실습*/

SELECT
	*
FROM
	user_mst
	LEFT OUTER JOIN user_dtl ON (1 = 1);	/* CROSS JOIN 과 같이 모든 경우의 수가 나온다*//*(1 = 1) 참이라는 뜻 */

SELECT
	*
FROM
	user_mst AS um
	LEFT OUTER JOIN user_dtl AS ud ON (ud.id = um.id);
	
/*============================================================================================================*/

SELECT
	*
FROM
	order_mst om
	LEFT OUTER JOIN order_dtl od ON(od.order_id = om.id) /*대상이 앞에 오고 조건이 뒤로 온다[붙이는 테이블 od가 ~인 순서로 조건 붙이기]*/
	LEFT OUTER JOIN user_mst um ON(um.id = om.user_id);

SELECT
	*
FROM
	user_mst um
	LEFT OUTER JOIN order_mst om ON(om.user_id = um.id)
	LEFT OUTER JOIN order_dtl od ON(od.order_id = om.id);