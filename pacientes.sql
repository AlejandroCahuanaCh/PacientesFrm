-- MySQL dump 10.13  Distrib 8.0.30, for Linux (x86_64)
--
-- Host: localhost    Database: clinicaDental_mysql
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Cita`
--

DROP TABLE IF EXISTS `Cita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Cita` (
  `idCita` int NOT NULL AUTO_INCREMENT,
  `fechaCita` datetime DEFAULT NULL,
  `fechaCreacion` datetime DEFAULT NULL,
  `descripcion` text,
  `fk_Paciente` int NOT NULL,
  `fk_HistoriaClinica` int NOT NULL,
  PRIMARY KEY (`idCita`),
  KEY `fk_Pacientes` (`fk_Paciente`),
  KEY `fk_HistoriaClinica` (`fk_HistoriaClinica`),
  CONSTRAINT `Cita_ibfk_1` FOREIGN KEY (`fk_Paciente`) REFERENCES `Pacientes` (`idPaciente`),
  CONSTRAINT `Cita_ibfk_2` FOREIGN KEY (`fk_HistoriaClinica`) REFERENCES `HistoriaClinica` (`idHistoriaClinica`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cita`
--

LOCK TABLES `Cita` WRITE;
/*!40000 ALTER TABLE `Cita` DISABLE KEYS */;
/*!40000 ALTER TABLE `Cita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CitaDoctor`
--

DROP TABLE IF EXISTS `CitaDoctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `CitaDoctor` (
  `fk_Cita` int NOT NULL,
  `fk_Doctor` int NOT NULL,
  PRIMARY KEY (`fk_Cita`,`fk_Doctor`),
  KEY `fk_Doctor` (`fk_Doctor`),
  CONSTRAINT `CitaDoctor_ibfk_1` FOREIGN KEY (`fk_Cita`) REFERENCES `Cita` (`idCita`),
  CONSTRAINT `CitaDoctor_ibfk_2` FOREIGN KEY (`fk_Doctor`) REFERENCES `Doctor` (`idDoctor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CitaDoctor`
--

LOCK TABLES `CitaDoctor` WRITE;
/*!40000 ALTER TABLE `CitaDoctor` DISABLE KEYS */;
/*!40000 ALTER TABLE `CitaDoctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CitaTratamiento`
--

DROP TABLE IF EXISTS `CitaTratamiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `CitaTratamiento` (
  `fk_Cita` int NOT NULL,
  `fk_Tratamiento` int NOT NULL,
  PRIMARY KEY (`fk_Cita`,`fk_Tratamiento`),
  KEY `fk_Tratamiento` (`fk_Tratamiento`),
  CONSTRAINT `CitaTratamiento_ibfk_1` FOREIGN KEY (`fk_Cita`) REFERENCES `Cita` (`idCita`),
  CONSTRAINT `CitaTratamiento_ibfk_2` FOREIGN KEY (`fk_Tratamiento`) REFERENCES `Tratamiento` (`idTratamiento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CitaTratamiento`
--

LOCK TABLES `CitaTratamiento` WRITE;
/*!40000 ALTER TABLE `CitaTratamiento` DISABLE KEYS */;
/*!40000 ALTER TABLE `CitaTratamiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Doctor`
--

DROP TABLE IF EXISTS `Doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Doctor` (
  `idDoctor` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `email` varchar(60) DEFAULT NULL,
  `dni` varchar(20) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `especialidad` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idDoctor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Doctor`
--

LOCK TABLES `Doctor` WRITE;
/*!40000 ALTER TABLE `Doctor` DISABLE KEYS */;
/*!40000 ALTER TABLE `Doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DoctorTratamiento`
--

DROP TABLE IF EXISTS `DoctorTratamiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `DoctorTratamiento` (
  `fk_Doctor` int NOT NULL,
  `fk_Tratamiento` int NOT NULL,
  PRIMARY KEY (`fk_Doctor`,`fk_Tratamiento`),
  KEY `fk_Tratamiento` (`fk_Tratamiento`),
  CONSTRAINT `DoctorTratamiento_ibfk_1` FOREIGN KEY (`fk_Doctor`) REFERENCES `Doctor` (`idDoctor`),
  CONSTRAINT `DoctorTratamiento_ibfk_2` FOREIGN KEY (`fk_Tratamiento`) REFERENCES `Tratamiento` (`idTratamiento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DoctorTratamiento`
--

LOCK TABLES `DoctorTratamiento` WRITE;
/*!40000 ALTER TABLE `DoctorTratamiento` DISABLE KEYS */;
/*!40000 ALTER TABLE `DoctorTratamiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `HistoriaClinica`
--

DROP TABLE IF EXISTS `HistoriaClinica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `HistoriaClinica` (
  `idHistoriaClinica` int NOT NULL AUTO_INCREMENT,
  `fechaCreacion` datetime NOT NULL,
  `descripcion` text,
  `observaciones` text,
  `alergias` text,
  `antecedentes` text,
  PRIMARY KEY (`idHistoriaClinica`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `HistoriaClinica`
--

LOCK TABLES `HistoriaClinica` WRITE;
/*!40000 ALTER TABLE `HistoriaClinica` DISABLE KEYS */;
/*!40000 ALTER TABLE `HistoriaClinica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Odontograma`
--

DROP TABLE IF EXISTS `Odontograma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Odontograma` (
  `idOdontograma` int NOT NULL AUTO_INCREMENT,
  `descripcion` text,
  `fk_HistoriaClinica` int NOT NULL,
  PRIMARY KEY (`idOdontograma`),
  KEY `fk_HistoriaClinica` (`fk_HistoriaClinica`),
  CONSTRAINT `Odontograma_ibfk_1` FOREIGN KEY (`fk_HistoriaClinica`) REFERENCES `HistoriaClinica` (`idHistoriaClinica`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Odontograma`
--

LOCK TABLES `Odontograma` WRITE;
/*!40000 ALTER TABLE `Odontograma` DISABLE KEYS */;
/*!40000 ALTER TABLE `Odontograma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PacienteHC`
--

DROP TABLE IF EXISTS `PacienteHC`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PacienteHC` (
  `fk_Paciente` int NOT NULL,
  `fk_HistoriaClinica` int NOT NULL,
  PRIMARY KEY (`fk_Paciente`),
  UNIQUE KEY `fk_HistoriaClinica` (`fk_HistoriaClinica`),
  CONSTRAINT `PacienteHC_ibfk_1` FOREIGN KEY (`fk_Paciente`) REFERENCES `Pacientes` (`idPaciente`),
  CONSTRAINT `PacienteHC_ibfk_2` FOREIGN KEY (`fk_HistoriaClinica`) REFERENCES `HistoriaClinica` (`idHistoriaClinica`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PacienteHC`
--

LOCK TABLES `PacienteHC` WRITE;
/*!40000 ALTER TABLE `PacienteHC` DISABLE KEYS */;
/*!40000 ALTER TABLE `PacienteHC` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Pacientes`
--

DROP TABLE IF EXISTS `Pacientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Pacientes` (
  `idPaciente` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(30) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `email` varchar(60) DEFAULT NULL,
  `dni` varchar(20) DEFAULT NULL,
  `profesion` varchar(30) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `fechaIngreso` date DEFAULT NULL,
  PRIMARY KEY (`idPaciente`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Pacientes`
--

LOCK TABLES `Pacientes` WRITE;
/*!40000 ALTER TABLE `Pacientes` DISABLE KEYS */;
INSERT INTO `Pacientes` VALUES (2,'Eulogia','Chavez Gonzales','madre@gmail.com','29264560','sastre','1950-03-11','2023-04-13'),(3,'Hipolito Moises','Cahuana Sanchez','hipo@gmail.com','29288776','Gestor de Cobranzas','1950-08-22','2023-04-13'),(5,'Cesar','Pipa','gnaik@sdf.com','11111111','queso','2013-06-11','2023-04-13'),(11,'Juan','Mamani','eso@eso.com','56894521','Loco','1950-04-30','2023-04-19'),(12,'Alejandro Anibal','Cahuana Chavez','acahuana@gmail.com','43790473','Nada','1986-07-09','2023-04-19'),(13,'Gregori','House','asad@sdfs','11223344','doctor','1944-12-03','2023-04-19'),(14,'Marco','Cahuana Postigo','a@c.com','11111111111','minero','1979-08-14','2023-04-19'),(15,'asd','asd','asd@hotmail.com','asd','asd','2002-04-07','2023-04-19'),(16,'Nelly','Ccasa','bebecita@gmail.com','28982354','Dentista','1984-02-22','2023-04-19'),(19,'sdfsdjf','sdfsdfsd','sdfsdfd@gmail.com','324245348','sdjfnsjd','1983-04-23','2023-04-19');
/*!40000 ALTER TABLE `Pacientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Tratamiento`
--

DROP TABLE IF EXISTS `Tratamiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Tratamiento` (
  `idTratamiento` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `costo` decimal(8,2) DEFAULT NULL,
  `descripcion` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idTratamiento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Tratamiento`
--

LOCK TABLES `Tratamiento` WRITE;
/*!40000 ALTER TABLE `Tratamiento` DISABLE KEYS */;
/*!40000 ALTER TABLE `Tratamiento` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-21 13:03:17
