INSERT INTO
	board_mst
VALUES
	(0, '제목1', '게시글 내용1', 0, 1),
	(0, '제목2', '게시글 내용2', 0, 1),
	(0, '제목3', '게시글 내용3', 0, 1),
	(0, '제목1', '게시글 내용1', 0, 2),
	(0, '제목2', '게시글 내용2', 0, 2),
	(0, '제목3', '게시글 내용3', 0, 2),
	(0, '제목4', '게시글 내용4', 0, 1),
	(0, '제목5', '게시글 내용5', 0, 1),
	(0, '제목6', '게시글 내용6', 0, 1),
	(0, '제목4', '게시글 내용4', 0, 2),
	(0, '제목5', '게시글 내용5', 0, 2),

/*==============================================================================================*/	
SELECT
	COUNT(1)
FROM
	board_mst bm2
GROUP BY
	bm2.writer_id = 1;
/*==============================================================================================*/
/* SELECT절 서브쿼리*/
SELECT
	*,
	(SELECT COUNT(1) FROM board_mst bm2 WHERE bm2.writer_id = bm.writer_id)
FROM
	board_mst bm;
/* 같은 테이블에서 특정 열이 다른 값만 찾아 출력하고자 할때 사용*/
/*==============================================================================================*/
/* FROM절 서브쿼리*/
SELECT
	bm.id,
	bm.title,
	bm.content,
	bm.read_count,
	bm.writer_id,
	wc.writer_count
FROM
	board_mst bm
	LEFT OUTER JOIN(SELECT
		writer_id,
		COUNT(1) writer_count
	FROM
		board_mst
	GROUP BY
		writer_id) wc ON(wc.writer_id = bm.writer_id);
/* 서브쿼리인 wc를 board_mst에 외부조인하여 writer_id가 같은 내용만 찾아 출력*/

SET profiling = 1;
SHOW PROFILES;