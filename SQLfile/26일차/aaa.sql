CREATE DATABASE  IF NOT EXISTS `delivery_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `delivery_db`;
-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: delivery_db
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `delivery_mst`
--

DROP TABLE IF EXISTS `delivery_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `delivery_mst` (
  `delivery_id` int NOT NULL AUTO_INCREMENT,
  `delivery_company` varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
  `delivery_man` varchar(15) COLLATE utf8mb4_general_ci NOT NULL,
  `delivery_address` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `consignee_name` varchar(15) COLLATE utf8mb4_general_ci NOT NULL,
  `consignee_phone` varchar(14) COLLATE utf8mb4_general_ci NOT NULL,
  `consignee_message` text COLLATE utf8mb4_general_ci,
  PRIMARY KEY (`delivery_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery_mst`
--

LOCK TABLES `delivery_mst` WRITE;
/*!40000 ALTER TABLE `delivery_mst` DISABLE KEYS */;
INSERT INTO `delivery_mst` VALUES (1,'대한통운','김준일','부산광역시 연제구 중앙대로 1001 부산광역시청','김춘식','010-8282-5353','안전하게 배송해 주세요');
/*!40000 ALTER TABLE `delivery_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_mst`
--

DROP TABLE IF EXISTS `user_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_mst` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `PASSWORD` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `NAME` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `EMAIL` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_mst`
--

LOCK TABLES `user_mst` WRITE;
/*!40000 ALTER TABLE `user_mst` DISABLE KEYS */;
INSERT INTO `user_mst` VALUES (1,'a','1111','qwe','222'),(2,'ab','2222','wer','3'),(3,'bc','3333','ert','3'),(4,'de','4444','rty','4'),(5,'s','5555','tyu','5'),(6,'ase','6666','yui','6');
/*!40000 ALTER TABLE `user_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `user_view`
--

DROP TABLE IF EXISTS `user_view`;
/*!50001 DROP VIEW IF EXISTS `user_view`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `user_view` AS SELECT 
 1 AS `ID`,
 1 AS `USERNAME`,
 1 AS `PASSWORD`,
 1 AS `NAME`,
 1 AS `EMAIL`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `user_view2`
--

DROP TABLE IF EXISTS `user_view2`;
/*!50001 DROP VIEW IF EXISTS `user_view2`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `user_view2` AS SELECT 
 1 AS `ID`,
 1 AS `USERNAME`,
 1 AS `PASSWORD`,
 1 AS `NAME`,
 1 AS `EMAIL`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `user_view3`
--

DROP TABLE IF EXISTS `user_view3`;
/*!50001 DROP VIEW IF EXISTS `user_view3`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `user_view3` AS SELECT 
 1 AS `ID`,
 1 AS `USERNAME`,
 1 AS `PASSWORD`,
 1 AS `NAME`,
 1 AS `EMAIL`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `user_view4`
--

DROP TABLE IF EXISTS `user_view4`;
/*!50001 DROP VIEW IF EXISTS `user_view4`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `user_view4` AS SELECT 
 1 AS `ID`,
 1 AS `USERNAME`,
 1 AS `PASSWORD`,
 1 AS `NAME`,
 1 AS `EMAIL`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `과목`
--

DROP TABLE IF EXISTS `과목`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `과목` (
  `과목번호` int NOT NULL AUTO_INCREMENT,
  `과목이름` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`과목번호`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `과목`
--

LOCK TABLES `과목` WRITE;
/*!40000 ALTER TABLE `과목` DISABLE KEYS */;
INSERT INTO `과목` VALUES (1,'컴퓨터 구조'),(2,'데이터베이스'),(3,'인공지능');
/*!40000 ALTER TABLE `과목` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `상품`
--

DROP TABLE IF EXISTS `상품`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `상품` (
  `상품코드` int NOT NULL AUTO_INCREMENT,
  `상품명` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `수량` int NOT NULL,
  PRIMARY KEY (`상품코드`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `상품`
--

LOCK TABLES `상품` WRITE;
/*!40000 ALTER TABLE `상품` DISABLE KEYS */;
INSERT INTO `상품` VALUES (1,'딸기사탕',200),(3,'오렌지사탕',20);
/*!40000 ALTER TABLE `상품` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `성적`
--

DROP TABLE IF EXISTS `성적`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `성적` (
  `순번` int NOT NULL AUTO_INCREMENT,
  `학번` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `과목번호` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `점수` int DEFAULT NULL,
  PRIMARY KEY (`순번`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `성적`
--

LOCK TABLES `성적` WRITE;
/*!40000 ALTER TABLE `성적` DISABLE KEYS */;
INSERT INTO `성적` VALUES (1,'1','1',95),(2,'2','1',84),(3,'1','2',89),(4,'2','2',92),(5,'1','3',100),(6,'2','3',88);
/*!40000 ALTER TABLE `성적` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `학생`
--

DROP TABLE IF EXISTS `학생`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `학생` (
  `학번` int NOT NULL AUTO_INCREMENT,
  `이름` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`학번`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `학생`
--

LOCK TABLES `학생` WRITE;
/*!40000 ALTER TABLE `학생` DISABLE KEYS */;
INSERT INTO `학생` VALUES (1,'김춘식'),(2,'손흥민');
/*!40000 ALTER TABLE `학생` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `학생2`
--

DROP TABLE IF EXISTS `학생2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `학생2` (
  `학번` int NOT NULL,
  `이름` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `전공` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`학번`),
  KEY `STUDENT_CODE_INDEX` (`학번`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `학생2`
--

LOCK TABLES `학생2` WRITE;
/*!40000 ALTER TABLE `학생2` DISABLE KEYS */;
INSERT INTO `학생2` VALUES (20013001,'홍길동','컴퓨터공학과'),(20013002,'김철수','전자공학과');
/*!40000 ALTER TABLE `학생2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'delivery_db'
--

--
-- Final view structure for view `user_view`
--

/*!50001 DROP VIEW IF EXISTS `user_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `user_view` AS select `user_mst`.`ID` AS `ID`,`user_mst`.`USERNAME` AS `USERNAME`,`user_mst`.`PASSWORD` AS `PASSWORD`,`user_mst`.`NAME` AS `NAME`,`user_mst`.`EMAIL` AS `EMAIL` from `user_mst` where (`user_mst`.`ID` between 1 and 200) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `user_view2`
--

/*!50001 DROP VIEW IF EXISTS `user_view2`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `user_view2` AS select `user_mst`.`ID` AS `ID`,`user_mst`.`USERNAME` AS `USERNAME`,`user_mst`.`PASSWORD` AS `PASSWORD`,`user_mst`.`NAME` AS `NAME`,`user_mst`.`EMAIL` AS `EMAIL` from `user_mst` where (`user_mst`.`ID` between 1 and 200) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `user_view3`
--

/*!50001 DROP VIEW IF EXISTS `user_view3`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `user_view3` AS select `user_mst`.`ID` AS `ID`,`user_mst`.`USERNAME` AS `USERNAME`,`user_mst`.`PASSWORD` AS `PASSWORD`,`user_mst`.`NAME` AS `NAME`,`user_mst`.`EMAIL` AS `EMAIL` from `user_mst` where (`user_mst`.`ID` between 1 and 200) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `user_view4`
--

/*!50001 DROP VIEW IF EXISTS `user_view4`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `user_view4` AS select `user_mst`.`ID` AS `ID`,`user_mst`.`USERNAME` AS `USERNAME`,`user_mst`.`PASSWORD` AS `PASSWORD`,`user_mst`.`NAME` AS `NAME`,`user_mst`.`EMAIL` AS `EMAIL` from `user_mst` where (`user_mst`.`ID` between 1 and 200) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-19 10:41:02
