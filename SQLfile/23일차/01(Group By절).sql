SELECT
	product_name,
	COUNT(order_id), /*Group By로 묶여진 행의 갯수를 나타냄*/
	SUM(stock),	/*Group By로 묶여진 행에서의 stock의 합계*/
	MIN(stock),	/*Group By로 묶여진 행에서의 stock의 최소값*/
	MAX(stock),	/*Group By로 묶여진 행에서의 stock의 최대값*/
	SUM(stock) / COUNT(1),
	AVG(stock)
FROM
	order_mst
GROUP BY
	product_name;
	
/*-----------------------------------------------------------------------------*/

SELECT
	product_name,
	SUM(price * stock) AS total_price
FROM
	order_mst
GROUP BY
	product_name;
	
/*-----------------------------------------------------------------------------*/

SELECT
	product_name,
	COUNT(order_id) AS order_count,
	SUM(stock) AS stock_sum,
	MIN(stock),
	MAX(stock) AS max_stock,
	SUM(stock) / COUNT(1),
	AVG(stock)
FROM
	order_mst
WHERE
	stock > 50	/* Group By 로 그룹화 하기 전 조건을 걸어 먼저 필터링한다*/
GROUP BY
	product_name
HAVING
	max_stock > 49	/* Group By 결과를 만들어 출력했을 때 HAVING절로 결과를 */ 
ORDER BY
	order_count desc,
	stock_sum desc
LIMIT 0, 2; /*limit 1 : 제일 위의 행 하나를 가져온다*/
/* 0번 Index에서 2개 */ 

/*-----------------------------------------------------------------------------*/

SELECT
	*
FROM
	order_mst
LIMIT 3, 3; /*인덱스 3번부터 3개의인덱스를 가져온다*/



