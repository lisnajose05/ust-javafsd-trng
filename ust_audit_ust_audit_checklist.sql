-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: ust_audit
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Dumping data for table `ust_audit_checklist`
--

LOCK TABLES `ust_audit_checklist` WRITE;
/*!40000 ALTER TABLE `ust_audit_checklist` DISABLE KEYS */;
INSERT INTO `ust_audit_checklist` VALUES (1,'Internal','2022-11-24 10:27:35.797000','2022-11-24 10:27:35.797000','Have all Change requests followed SDLC before PROD move?',_binary ''),(2,'Internal','2022-11-24 10:28:04.000000','2022-11-24 10:28:04.000000','Have all Change requests been approved by the application owner?',_binary ''),(3,'Internal','2022-11-24 10:28:22.727000','2022-11-24 10:28:22.727000','Are all artifacts like CR document, Unit test cases available?',_binary ''),(4,'Internal','2022-11-24 10:28:48.551000','2022-11-24 10:28:48.551000','Is the SIT and UAT sign-off available?',_binary ''),(5,'Internal','2022-11-24 10:29:48.041000','2022-11-24 10:29:48.041000','Is data deletion from the system done with application owner approval?',_binary ''),(6,'SOX','2022-11-24 10:30:38.402000','2022-11-24 10:30:38.402000','Have all Change requests followed SDLC before PROD move?',_binary ''),(7,'SOX','2022-11-24 10:31:01.350000','2022-11-24 10:31:01.350000','Have all Change requests been approved by the application owner?',_binary ''),(8,'SOX','2022-11-24 10:31:32.029000','2022-11-24 10:31:32.029000','For a major change, was there a database backup taken before and after PROD move?',_binary ''),(9,'SOX','2022-11-24 10:32:00.341000','2022-11-24 10:32:00.341000','For a major change, was there a database backup taken before and after PROD move?',_binary ''),(10,'SOX','2022-11-24 10:32:34.887000','2022-11-24 10:32:34.887000','Is data deletion from the system done with application owner approval?',_binary '');
/*!40000 ALTER TABLE `ust_audit_checklist` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-29 17:19:15
