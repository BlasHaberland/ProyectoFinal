-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-06-2024 a las 21:35:18
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto_final`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `id_ciudad` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `provincia` varchar(50) DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`id_ciudad`, `nombre`, `provincia`, `estado`) VALUES
(1, 'San Luis', 'San Luis', 1),
(2, 'Mendoza', 'Mendoza', 1),
(3, 'Merlo', 'San Luis', 1),
(4, 'San Rafael', 'Mendoza', 1),
(5, 'Córdoba', 'Córdoba', 1),
(6, 'Mar del Plata', 'Buenos Aires', 1),
(7, 'Rosario', 'Santa Fe', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `colectivo`
--

CREATE TABLE `colectivo` (
  `id_colectivo` int(11) NOT NULL,
  `matricula` varchar(7) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `capacidad` int(2) NOT NULL,
  `estado` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `colectivo`
--

INSERT INTO `colectivo` (`id_colectivo`, `matricula`, `marca`, `modelo`, `capacidad`, `estado`) VALUES
(1, 'BNM551', 'Scania', 'Paradiso DD 1800 New G7', 3, 1),
(2, 'BNM557', 'Mercedes-Benz', 'O 500 RS', 5, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horario`
--

CREATE TABLE `horario` (
  `id_horario` int(11) NOT NULL,
  `id_ruta` int(11) NOT NULL,
  `hora_salida` time NOT NULL,
  `hora_llegada` time NOT NULL,
  `estado` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `horario`
--

INSERT INTO `horario` (`id_horario`, `id_ruta`, `hora_salida`, `hora_llegada`, `estado`) VALUES
(1, 1, '15:00:00', '18:05:00', 1),
(2, 1, '20:00:00', '23:05:00', 1),
(3, 2, '20:00:00', '23:00:00', 1),
(4, 4, '02:30:00', '07:50:00', 1),
(5, 3, '12:15:00', '17:35:00', 1),
(6, 5, '18:45:00', '22:10:00', 1),
(7, 6, '08:10:00', '11:26:00', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasaje`
--

CREATE TABLE `pasaje` (
  `id_pasaje` int(11) NOT NULL,
  `id_pasajero` int(11) NOT NULL,
  `id_colectivo` int(11) NOT NULL,
  `id_ruta` int(11) NOT NULL,
  `fecha_viaje` date NOT NULL,
  `hora_viaje` time NOT NULL,
  `asiento` int(2) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `estado` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pasaje`
--

INSERT INTO `pasaje` (`id_pasaje`, `id_pasajero`, `id_colectivo`, `id_ruta`, `fecha_viaje`, `hora_viaje`, `asiento`, `precio`, `estado`) VALUES
(1, 1, 1, 1, '2024-06-15', '15:00:00', 1, 15000.00, 1),
(2, 2, 1, 1, '2024-06-15', '15:00:00', 2, 15000.00, 1),
(4, 4, 1, 1, '2024-06-15', '15:00:00', 3, 15000.00, 1),
(6, 3, 2, 2, '2024-06-15', '20:00:00', 1, 15700.50, 1),
(7, 4, 2, 2, '2024-06-15', '20:00:00', 4, 15750.00, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasajero`
--

CREATE TABLE `pasajero` (
  `id_pasajero` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apeliido` varchar(50) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `telefono` varchar(13) NOT NULL,
  `estado` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pasajero`
--

INSERT INTO `pasajero` (`id_pasajero`, `nombre`, `apeliido`, `dni`, `correo`, `telefono`, `estado`) VALUES
(1, 'Daniel', 'Sánchez', '28126367', 'danielsanchez@gmail.com', '2665116178', 1),
(2, 'Roberto', 'Quintana', '36746523', 'robertoquintana@gmail.com', '2667815594', 1),
(3, 'Marta', 'Quiroga', '18808380', 'martaquiroga@gmail.com', '2668964980', 1),
(4, 'Orlando', 'González', '5515237', 'orlandogonzalez@gmail.com', '2668964840', 1),
(5, 'Mariana', 'Gómez', '42133651', 'marianagomez@gmail.com', '2668965432', 1),
(6, 'Lucrecia', 'Mercado', '11111111', 'lucreciamercado@gmail.com', '2667856156', 1),
(7, 'Luciano', 'Carreras', '22222222', 'lucianocarreras@gmail.com', '2668955378', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ruta`
--

CREATE TABLE `ruta` (
  `id_ruta` int(11) NOT NULL,
  `id_origen` int(11) NOT NULL,
  `id_destino` int(11) NOT NULL,
  `duracion_estimada` time NOT NULL,
  `estado` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ruta`
--

INSERT INTO `ruta` (`id_ruta`, `id_origen`, `id_destino`, `duracion_estimada`, `estado`) VALUES
(1, 1, 2, '03:05:00', 1),
(2, 2, 1, '03:00:00', 1),
(3, 1, 5, '05:20:00', 1),
(4, 5, 1, '05:20:00', 1),
(5, 1, 4, '03:25:00', 1),
(6, 4, 1, '03:16:00', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`id_ciudad`);

--
-- Indices de la tabla `colectivo`
--
ALTER TABLE `colectivo`
  ADD PRIMARY KEY (`id_colectivo`),
  ADD UNIQUE KEY `matricula` (`matricula`);

--
-- Indices de la tabla `horario`
--
ALTER TABLE `horario`
  ADD PRIMARY KEY (`id_horario`),
  ADD KEY `id_ruta` (`id_ruta`);

--
-- Indices de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD PRIMARY KEY (`id_pasaje`),
  ADD KEY `id_pasajero` (`id_pasajero`),
  ADD KEY `id_colectivo` (`id_colectivo`),
  ADD KEY `id_ruta` (`id_ruta`);

--
-- Indices de la tabla `pasajero`
--
ALTER TABLE `pasajero`
  ADD PRIMARY KEY (`id_pasajero`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD PRIMARY KEY (`id_ruta`),
  ADD KEY `id_origen` (`id_origen`),
  ADD KEY `id_destino` (`id_destino`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `id_ciudad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `colectivo`
--
ALTER TABLE `colectivo`
  MODIFY `id_colectivo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `horario`
--
ALTER TABLE `horario`
  MODIFY `id_horario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `pasaje`
--
ALTER TABLE `pasaje`
  MODIFY `id_pasaje` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `pasajero`
--
ALTER TABLE `pasajero`
  MODIFY `id_pasajero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `ruta`
--
ALTER TABLE `ruta`
  MODIFY `id_ruta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `horario`
--
ALTER TABLE `horario`
  ADD CONSTRAINT `horario_ibfk_1` FOREIGN KEY (`id_ruta`) REFERENCES `ruta` (`id_ruta`);

--
-- Filtros para la tabla `pasaje`
--
ALTER TABLE `pasaje`
  ADD CONSTRAINT `pasaje_ibfk_1` FOREIGN KEY (`id_pasajero`) REFERENCES `pasajero` (`id_pasajero`),
  ADD CONSTRAINT `pasaje_ibfk_2` FOREIGN KEY (`id_colectivo`) REFERENCES `colectivo` (`id_colectivo`),
  ADD CONSTRAINT `pasaje_ibfk_3` FOREIGN KEY (`id_ruta`) REFERENCES `ruta` (`id_ruta`);

--
-- Filtros para la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD CONSTRAINT `ruta_ibfk_1` FOREIGN KEY (`id_origen`) REFERENCES `ciudad` (`id_ciudad`),
  ADD CONSTRAINT `ruta_ibfk_2` FOREIGN KEY (`id_destino`) REFERENCES `ciudad` (`id_ciudad`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
