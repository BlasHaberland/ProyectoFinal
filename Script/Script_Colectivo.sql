CREATE TABLE `pasajero` (
  `id_pasajero` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apeliido` varchar(50) NOT NULL,
  `dni` varchar(9) UNIQUE NOT NULL,
  `correo` varchar(50) NOT NULL,
  `telefono` varchar(13) NOT NULL,
  `estado` tinyint(1) DEFAULT 1
);

CREATE TABLE `pasaje` (
  `id_pasaje` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `id_pasajero` int NOT NULL,
  `id_colectivo` int NOT NULL,
  `id_ruta` int NOT NULL,
  `fecha_viaje` date NOT NULL,
  `hora_viaje` time NOT NULL,
  `asiento` int(2) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `estado` tinyint(1) DEFAULT 1
);

CREATE TABLE `colectivo` (
  `id_colectivo` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `matricula` varchar(7) UNIQUE NOT NULL,
  `marca` varchar(50) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `capacidad` int(2) NOT NULL,
  `estado` tinyint(1) DEFAULT 1
);

CREATE TABLE `ruta` (
  `id_ruta` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `id_origen` int NOT NULL,
  `id_destino` int NOT NULL,
  `duracion_estimada` time NOT NULL,
  `estado` tinyint(1) DEFAULT 1
);

CREATE TABLE `horario` (
  `id_horario` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `id_ruta` int NOT NULL,
  `hora_salida` time NOT NULL,
  `hora_llegada` time NOT NULL,
  `estado` tinyint(1) DEFAULT 1
);

CREATE TABLE `ciudad` (
  `id_ciudad` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50),
  `provincia` varchar(50),
  `estado` tinyint(1) DEFAULT 1
);

ALTER TABLE `horario` ADD FOREIGN KEY (`id_ruta`) REFERENCES `ruta` (`id_ruta`);

ALTER TABLE `pasaje` ADD FOREIGN KEY (`id_pasajero`) REFERENCES `pasajero` (`id_pasajero`);

ALTER TABLE `pasaje` ADD FOREIGN KEY (`id_colectivo`) REFERENCES `colectivo` (`id_colectivo`);

ALTER TABLE `pasaje` ADD FOREIGN KEY (`id_ruta`) REFERENCES `ruta` (`id_ruta`);

ALTER TABLE `ruta` ADD FOREIGN KEY (`id_origen`) REFERENCES `ciudad` (`id_ciudad`);

ALTER TABLE `ruta` ADD FOREIGN KEY (`id_destino`) REFERENCES `ciudad` (`id_ciudad`);
