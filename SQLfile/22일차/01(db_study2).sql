SELECT
	cm.id AS '순번',
	cd.course_name AS '수강명',
	sm.`name` AS '성명',
	em.`name` AS '담당자',
	stm.`status` AS '상태'
FROM
	course_mst cm
	LEFT OUTER JOIN course_dtl cd ON(cd.id = cm.course_id)
	LEFT OUTER JOIN student_mst sm ON(sm.id = cm.student_id)
	LEFT OUTER JOIN emp_mst em ON (em.id = sm.emp_id)
	LEFT OUTER JOIN status_mst stm ON(stm.id = cm.status_id);

/*============================================================================================================*/

INSERT INTO
	student_mst
VALUES
	(0, '신경수', 1),
	(0, '고희주', 2),
	(0, '장건녕', 3),
	(0, '문승주', 4);

INSERT INTO
	emp_mst
VALUES
	(0, '문성현'),
	(0, '윤대휘'),
	(0, '문자영'),
	(0, '정규민');
		
INSERT INTO
	course_dtl
VALUES
	(0, 'java'),
	(0, 'python'),
	(0, 'c');

INSERT INTO
	status_mst
VALUES
	(0, '수강'),
	(0, '수료');
	
INSERT INTO
	course_mst
VALUES
	(0, 1, 1, 1),
	(0, 2, 1, 2),
	(0, 3, 1, 2),
	(0, 1, 2, 2),
	(0, 3, 2, 1),
	(0, 1, 3, 1),
	(0, 1, 4, 2);

/*============================================================================================================*/

SELECT
	cm.id AS '순번',
	sm.`name` AS '수강생명',
	cd.course_name AS '수강명',
	em.`name` AS '담당자명',
	stm.`status` AS '상태'	
FROM
	student_mst sm
	LEFT OUTER JOIN course_mst cm ON(cm.student_id = sm.id)
	LEFT OUTER JOIN course_dtl cd ON(cd.id = cm.course_id)
	LEFT OUTER JOIN emp_mst em ON(em.id = sm.emp_id)
	LEFT OUTER JOIN status_mst stm ON(stm.id = cm.status_id)
ORDER BY
	cm.id;
	
/*============================================================================================================*/

SELECT
	cm.id AS '순번',
	sm.`name` AS '수강생명',
	cd.course_name AS '수강명',
	em.`name` AS '담당자명',
	stm.`status` AS '상태'	
FROM
	course_dtl cd
	LEFT OUTER JOIN course_mst cm ON(cm.course_id = cd.id)
	LEFT OUTER JOIN student_mst sm ON(sm.id = cm.student_id)
	LEFT OUTER JOIN status_mst stm ON(stm.id = cm.status_id)
	LEFT OUTER JOIN emp_mst em ON(em.id = sm.emp_id)
ORDER BY
	cm.id;
	
/*============================================================================================================*/

SELECT
	sm.id AS '순번',
	sm.`name` AS '수강생명',
	cd.course_name AS '수강명',
	em.`name` AS '담당자명',
	stm.`status` AS '상태'	
FROM
	student_mst sm
	LEFT OUTER JOIN course_mst cm ON(cm.student_id = sm.id)
	LEFT OUTER JOIN course_dtl cd ON(cd.id = cm.course_id)
	LEFT OUTER JOIN emp_mst em ON(em.id = sm.emp_id)
	LEFT OUTER JOIN status_mst stm ON(stm.id = cm.status_id)
ORDER BY
	sm.id,
	cd.id;