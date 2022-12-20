/*1번*/
CREATE DATABASE
    `delivery_db`
DEFAULT CHARACTER
    SET utf8mb4
COLLATE utf8mb4_general_ci;

CREATE TABLE `delivery_db`.`delivery_mst`(
    `delivery_id` INT NOT NULL AUTO_INCREMENT,
    `delivery_company` VARCHAR(20) NOT NULL,
    `delivery_man` VARCHAR(15) NOT NULL,
    `delivery_address` VARCHAR(100) NOT NULL,
    `consignee_name` VARCHAR(15) NOT NULL,
    `consignee_phone` VARCHAR(14) NOT NULL,
    `consignee_message` TEXT ,
    PRIMARY KEY(`delivery_id`)
);

INSERT INTO
    delivery_db.delivery_mst
VALUES
    (0, '대한통운', '김준일', '부산광역시 연제구 중앙대로 1001 부산광역시청', '김춘식', '010-8282-5353', '안전하게 배송해 주세요');

/*2번*/
show databases;
use delivery_db;
show tables;
desc delivery_mst;

/*3번*/
select
    sc.`순번`,
    sc.`학번`,
    stu.`이름`,
    sc.`과목번호`,
    sub.`과목이름`,
    sc.`점수`
from
    `성적` as sc
    left outer join `학생` as stu on(stu.`학번` = sc.`학번`)
    left outer join `과목` as sub on(sub.`과목번호` = sc.`과목번호`)
where
    sub.`과목이름` = '컴퓨터 구조' or sub.`과목이름` = '데이터베이스';
    
/*4번*/
START TRANSACTION;

INSERT INTO
    `상품`
VALUES
    (0, '오렌지사탕', 20);

savepoint s1;

/* ROLLBACK 전 실행 */
UPDATE
    `상품`
SET
    `수량` = 200
WHERE
    `상품코드` = 2;

/* ROLLBACK 후 실행 */
UPDATE
    `상품`
SET
    `수량` = 200
WHERE
    `상품코드` = 1;
    
DELETE
FROM
    `상품`
WHERE
    `상품코드` = 2;

rollback to s1;

COMMIT;

/* 5번 */
create index STUDENT_CODE_INDEX2 on delivery_db.`학생2`(`학번`);

/* 6번 */
create view USER_VIEW5
AS
    SELECT
        `ID`,
        `USERNAME`,
        `PASSWORD`,
        `NAME`,
        `EMAIL`
    FROM
        `USER_MST`
    WHERE
        `ID` BETWEEN 1 AND 200;

select * from USER_VIEW5 where USERNAME like 'a%';

/* 7번 */
SHOW INDEX FROM `학생`;
SHOW FULL TABLES IN delivery_db WHERE TABLE_TYPE LIKE 'VIEW';