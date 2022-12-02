-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-12-2022 a las 01:48:30
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_project`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `indicadores`
--

CREATE TABLE `indicadores` (
  `id` int(50) NOT NULL,
  `nombre_administrador` varchar(50) NOT NULL,
  `usuario_administrador` varchar(50) NOT NULL,
  `correo_administrador` varchar(50) NOT NULL,
  `nombre_indicador` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `indicadores`
--

INSERT INTO `indicadores` (`id`, `nombre_administrador`, `usuario_administrador`, `correo_administrador`, `nombre_indicador`) VALUES
(1, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnico profesional en soporte informatico'),
(2, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnico profesional en soporte informatico'),
(3, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologo en desarrollo de software'),
(4, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologo en desarrollo de software'),
(5, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Ingenieria de software'),
(6, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Ingenieria de software'),
(7, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologo en desarrollo de software'),
(8, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Ingenieria de software'),
(9, 'Lionel', '6767', 'lionelmessi@gmail.com', 'Tecnologo en desarrollo de software'),
(10, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Ingenieria de software'),
(11, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Ingenieria de software'),
(12, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnico profesional en soporte informatico'),
(13, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnico profesional en soporte informatico'),
(14, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnico profesional en soporte informatico'),
(15, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnico profesional en soporte informatico'),
(16, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologo en desarrollo de software'),
(17, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologo en desarrollo de software'),
(18, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologo en desarrollo de software'),
(19, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologo en desarrollo de software'),
(20, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologo en desarrollo de software'),
(21, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologo en desarrollo de software'),
(22, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Ingenieria de software'),
(23, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Ingenieria de software'),
(24, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Ingenieria de software'),
(25, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnica profesional produccion grafica'),
(26, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnica profesional produccion grafica'),
(27, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnica profesional produccion grafica'),
(28, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnica profesional produccion grafica'),
(29, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnica profesional produccion grafica'),
(30, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnica profesional produccion grafica'),
(31, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnica profesional produccion grafica'),
(32, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnica profesional produccion grafica'),
(33, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnica profesional produccion grafica'),
(34, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnica profesional produccion grafica'),
(35, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnica profesional produccion grafica'),
(36, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnica profesional produccion grafica'),
(37, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en diseño publlicitarioa'),
(38, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en diseño publlicitarioa'),
(39, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en diseño publlicitarioa'),
(40, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en diseño publlicitarioa'),
(41, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en diseño publlicitarioa'),
(42, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en diseño publlicitarioa'),
(43, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en diseño publlicitarioa'),
(44, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en diseño publlicitarioa'),
(45, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en diseño publlicitarioa'),
(46, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Profesional en diseño grafico'),
(47, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Profesional en diseño grafico'),
(48, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Profesional en diseño grafico'),
(49, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Profesional en diseño grafico'),
(50, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Profesional en diseño grafico'),
(51, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Profesional en diseño grafico'),
(52, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Profesional en diseño grafico'),
(53, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Profesional en diseño grafico'),
(54, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Profesional en diseño grafico'),
(55, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnico proceso diseño de modas'),
(56, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnico proceso diseño de modas'),
(57, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnico proceso diseño de modas'),
(58, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnico proceso diseño de modas'),
(59, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnico proceso diseño de modas'),
(60, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnico proceso diseño de modas'),
(61, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnico proceso diseño de modas'),
(62, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en gestion de diseño de modas'),
(63, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en gestion de diseño de modas'),
(64, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en gestion de diseño de modas'),
(65, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en gestion de diseño de modas'),
(66, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en gestion de diseño de modas'),
(67, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en gestion de diseño de modas'),
(68, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Tecnologia en gestion de diseño de modas'),
(69, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Profesional en diseño y administracion de modas'),
(70, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Profesional en diseño y administracion de modas'),
(71, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Profesional en diseño y administracion de modas'),
(72, 'Juan', '9898', 'est_je_garcia@fesc.edu.co', 'Profesional en diseño y administracion de modas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nuevoprograma`
--

CREATE TABLE `nuevoprograma` (
  `id` int(50) NOT NULL,
  `codigo_programa` int(50) NOT NULL,
  `nombre_del_programa` varchar(50) NOT NULL,
  `periodo` varchar(50) NOT NULL,
  `inscritos` int(50) NOT NULL,
  `admitidos` int(50) NOT NULL,
  `matriculados` int(50) NOT NULL,
  `graduados` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `nuevoprograma`
--

INSERT INTO `nuevoprograma` (`id`, `codigo_programa`, `nombre_del_programa`, `periodo`, `inscritos`, `admitidos`, `matriculados`, `graduados`) VALUES
(22, 107859, 'Tecnico profesional en soporte informatico', '2021-1', 10, 10, 10, '0'),
(23, 107859, 'Tecnico profesional en soporte informatico', '2021-2', 13, 13, 13, '23'),
(24, 107859, 'Tecnico profesional en soporte informatico', '2022-1', 15, 15, 15, '8'),
(25, 107859, 'Tecnico profesional en soporte informatico', '2022-2', 19, 19, 19, '2'),
(26, 107860, 'Tecnologo en desarrollo de software', '2019-2', 7, 7, 7, '7'),
(27, 107860, 'Tecnologo en desarrollo de software', '2020-1', 18, 18, 18, '0'),
(28, 107860, 'Tecnologo en desarrollo de software', '2020-2', 11, 11, 11, '0'),
(29, 107860, 'Tecnologo en desarrollo de software', '2021-1', 20, 20, 20, '0'),
(30, 107860, 'Tecnologo en desarrollo de software', '2021-2', 3, 3, 3, '4'),
(31, 107860, 'Tecnologo en desarrollo de software', '2022-1', 25, 25, 25, '7'),
(32, 107861, 'Ingenieria de software', '2020-1', 18, 18, 18, '0'),
(33, 107861, 'Ingenieria de software', '2021-1', 12, 12, 12, '0'),
(34, 107861, 'Ingenieria de software', '2022-1', 29, 29, 29, '0'),
(35, 91390, 'Tecnica profesional produccion grafica', '2017-1', 13, 13, 13, '23'),
(36, 91390, 'Tecnica profesional produccion grafica', '2017-2', 9, 9, 9, '14'),
(37, 91390, 'Tecnica profesional produccion grafica', '2018-1', 18, 18, 18, '20'),
(38, 91390, 'Tecnica profesional produccion grafica', '2018-2', 34, 34, 34, '6'),
(39, 91390, 'Tecnica profesional produccion grafica', '2019-1', 27, 27, 27, '16'),
(40, 91390, 'Tecnica profesional produccion grafica', '2019-2', 26, 26, 26, '31'),
(42, 91390, 'Tecnica profesional produccion grafica', '2020-1', 14, 14, 14, '15'),
(43, 91390, 'Tecnica profesional produccion grafica', '2020-2', 35, 35, 35, '22'),
(44, 91390, 'Tecnica profesional produccion grafica', '2021-1', 28, 28, 28, '23'),
(45, 91390, 'Tecnica profesional produccion grafica', '2021-2', 24, 24, 24, '17'),
(46, 91390, 'Tecnica profesional produccion grafica', '2022-1', 29, 29, 29, '29'),
(47, 91389, 'Tecnologia en diseño publlicitarioa', '2018-1', 23, 23, 23, '8'),
(48, 91389, 'Tecnologia en diseño publlicitarioa', '2018-2', 29, 29, 29, '2'),
(49, 91389, 'Tecnologia en diseño publlicitarioa', '2019-1', 27, 27, 27, '6'),
(50, 91389, 'Tecnologia en diseño publlicitarioa', '2019-2', 24, 24, 24, '10'),
(51, 91389, 'Tecnologia en diseño publlicitarioa', '2020-1', 26, 26, 26, '7'),
(52, 91389, 'Tecnologia en diseño publlicitarioa', '2020-2', 17, 17, 17, '20'),
(53, 91389, 'Tecnologia en diseño publlicitarioa', '2021-1', 34, 34, 34, '12'),
(54, 91389, 'Tecnologia en diseño publlicitarioa', '2021-2', 36, 36, 36, '23'),
(55, 91389, 'Tecnologia en diseño publlicitarioa', '2022-1', 30, 30, 30, '29'),
(56, 91388, 'Profesional en diseño grafico', '2018-1', 23, 23, 23, '0'),
(57, 91388, 'Profesional en diseño grafico', '2018-2', 12, 12, 12, '9'),
(58, 91388, 'Profesional en diseño grafico', '2019-1', 25, 25, 25, '10'),
(59, 91388, 'Profesional en diseño grafico', '2019-2', 28, 28, 28, '19'),
(60, 91388, 'Profesional en diseño grafico', '2020-1', 11, 11, 11, '2'),
(61, 91388, 'Profesional en diseño grafico', '2020-2', 24, 24, 24, '17'),
(62, 91388, 'Profesional en diseño grafico', '2021-1', 27, 27, 27, '19'),
(63, 91388, 'Profesional en diseño grafico', '2021-2', 20, 20, 20, '20'),
(64, 91388, 'Profesional en diseño grafico', '2022-1', 30, 30, 30, '29'),
(65, 104668, 'Tecnico proceso diseño de modas', '2018-1', 23, 23, 23, '1'),
(66, 104668, 'Tecnico proceso diseño de modas', '2019-2', 24, 24, 24, '6'),
(67, 104668, 'Tecnico proceso diseño de modas', '2020-1', 25, 25, 25, '29'),
(68, 104668, 'Tecnico proceso diseño de modas', '2020-2', 17, 17, 17, '12'),
(69, 104668, 'Tecnico proceso diseño de modas', '2021-1', 18, 18, 18, '14'),
(70, 104668, 'Tecnico proceso diseño de modas', '2021-2', 22, 22, 22, '19'),
(71, 104668, 'Tecnico proceso diseño de modas', '2022-1', 30, 30, 30, '9'),
(72, 53509, 'Tecnologia en gestion de diseño de modas', '2018-1', 12, 12, 12, '3'),
(73, 53509, 'Tecnologia en gestion de diseño de modas', '2019-2', 23, 23, 23, '15'),
(74, 53509, 'Tecnologia en gestion de diseño de modas', '2020-1', 32, 32, 32, '28'),
(75, 53509, 'Tecnologia en gestion de diseño de modas', '2020-2', 15, 15, 15, '6'),
(76, 53509, 'Tecnologia en gestion de diseño de modas', '2021-1', 34, 34, 34, '25'),
(77, 53509, 'Tecnologia en gestion de diseño de modas', '2021-2', 13, 13, 13, '29'),
(78, 53509, 'Tecnologia en gestion de diseño de modas', '2022-2', 17, 17, 17, '20'),
(79, 104671, 'Profesional en diseño y administracion de modas', '2018-1', 30, 30, 30, '23'),
(80, 104671, 'Profesional en diseño y administracion de modas', '2019-1', 35, 35, 35, '18'),
(81, 104671, 'Profesional en diseño y administracion de modas', '2020-1', 28, 28, 28, '28'),
(82, 104671, 'Profesional en diseño y administracion de modas', '2021-1', 32, 32, 32, '16');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `saberpro`
--

CREATE TABLE `saberpro` (
  `id` int(11) NOT NULL,
  `codigo_programa` varchar(50) NOT NULL,
  `nombre_programa` varchar(50) NOT NULL,
  `numero_estudiantes` varchar(50) NOT NULL,
  `competencia_ciudadana` varchar(50) NOT NULL,
  `razonamiento_cuantitativo` varchar(50) NOT NULL,
  `comunicacion_escrita` varchar(50) NOT NULL,
  `ingles` varchar(50) NOT NULL,
  `lectura_critica` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `saberpro`
--

INSERT INTO `saberpro` (`id`, `codigo_programa`, `nombre_programa`, `numero_estudiantes`, `competencia_ciudadana`, `razonamiento_cuantitativo`, `comunicacion_escrita`, `ingles`, `lectura_critica`) VALUES
(1, '107859', 'Tecnico profesional en soporte informatico', '32', '134', '145', '143', '123', '178');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(10) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `correo` varchar(40) NOT NULL,
  `usuario` varchar(40) NOT NULL,
  `contrasena` varchar(40) NOT NULL,
  `tipo` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `nombre`, `correo`, `usuario`, `contrasena`, `tipo`) VALUES
(29, 'Juan', 'est_je_garcia@fesc.edu.co', '9898', '9898', '1'),
(30, '', '', '', '', '0');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `indicadores`
--
ALTER TABLE `indicadores`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `nuevoprograma`
--
ALTER TABLE `nuevoprograma`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `saberpro`
--
ALTER TABLE `saberpro`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `usuario` (`usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `indicadores`
--
ALTER TABLE `indicadores`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=73;

--
-- AUTO_INCREMENT de la tabla `nuevoprograma`
--
ALTER TABLE `nuevoprograma`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=83;

--
-- AUTO_INCREMENT de la tabla `saberpro`
--
ALTER TABLE `saberpro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
