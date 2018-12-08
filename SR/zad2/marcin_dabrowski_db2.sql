-- phpMyAdmin SQL Dump
-- version 4.7.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 10, 2018 at 01:43 PM
-- Server version: 5.7.24-0ubuntu0.16.04.1
-- PHP Version: 7.1.19-1+ubuntu16.04.1+deb.sury.org+1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `marcin_dabrowski_db2`
--

-- --------------------------------------------------------

--
-- Table structure for table `email_queue`
--

CREATE TABLE `email_queue` (
  `email_queue_id` int(11) NOT NULL,
  `email_queue_to_email` varchar(128) NOT NULL,
  `email_queue_title` varchar(128) NOT NULL,
  `email_queue_text` text NOT NULL,
  `email_queue_is_send` tinyint(1) NOT NULL DEFAULT '0',
  `send_date` timestamp NULL DEFAULT NULL,
  `create_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `email_queue`
--

INSERT INTO `email_queue` (`email_queue_id`, `email_queue_to_email`, `email_queue_title`, `email_queue_text`, `email_queue_is_send`, `send_date`, `create_date`) VALUES
(9, '', '', '', 1, '2018-11-10 11:43:34', '2018-11-10 11:07:18'),
(11, '', 'Title', 'textm', 1, '2018-11-10 11:43:34', '2018-11-10 11:11:22');

--
-- Triggers `email_queue`
--
DELIMITER $$
CREATE TRIGGER `create_date_value` BEFORE UPDATE ON `email_queue` FOR EACH ROW BEGIN
    IF new.email_queue_is_send = 1 THEN BEGIN
        SET new.send_date = NOW();
    END; END IF; 
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `email_queue`
--
ALTER TABLE `email_queue`
  ADD PRIMARY KEY (`email_queue_id`),
  ADD KEY `email_queue_is_send` (`email_queue_is_send`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `email_queue`
--
ALTER TABLE `email_queue`
  MODIFY `email_queue_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
