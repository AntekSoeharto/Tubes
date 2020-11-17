-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 17, 2020 at 01:54 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo`
--
CREATE DATABASE IF NOT EXISTS `pbo` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `pbo`;

-- --------------------------------------------------------

--
-- Table structure for table `absensi_dokter`
--

CREATE TABLE `absensi_dokter` (
  `Tgl_absen` date NOT NULL,
  `Status` varchar(255) NOT NULL,
  `NID` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `absensi_dokter`
--

INSERT INTO `absensi_dokter` (`Tgl_absen`, `Status`, `NID`) VALUES
('2020-11-02', 'ALPHA', '1'),
('2020-11-02', 'IZIN', '3'),
('2020-11-02', 'IZIN', '3'),
('2020-11-01', 'ALPHA', '3'),
('2020-11-02', 'HADIR', '4'),
('2020-11-27', 'HADIR', '4'),
('2020-11-01', 'ALPHA', '4'),
('2020-11-22', 'HADIR', '4');

-- --------------------------------------------------------

--
-- Table structure for table `cabang`
--

CREATE TABLE `cabang` (
  `ID_cabang` varchar(255) NOT NULL,
  `Alamat` varchar(255) NOT NULL,
  `No_telepon` varchar(255) NOT NULL,
  `Nama_cabang` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cabang`
--

INSERT INTO `cabang` (`ID_cabang`, `Alamat`, `No_telepon`, `Nama_cabang`) VALUES
('01', 'Antapani No.5', '02209232093', 'Puskesmas Antapani');

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `NIK` varchar(255) NOT NULL,
  `Nama` varchar(255) NOT NULL,
  `Tgl_Lahir` date NOT NULL,
  `Goldar` varchar(255) NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `NID` varchar(255) NOT NULL,
  `Poliklinik` varchar(255) NOT NULL,
  `No_Telepon` varchar(255) NOT NULL,
  `Alamat` varchar(255) NOT NULL,
  `ID_Cabang` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`NIK`, `Nama`, `Tgl_Lahir`, `Goldar`, `Gender`, `NID`, `Poliklinik`, `No_Telepon`, `Alamat`, `ID_Cabang`) VALUES
('1', '1', '2020-11-03', 'O', 'Pria', '1', 'Dokter Spesialis Anak', '1', '1', '01'),
('4', '4', '2020-11-05', 'O', 'Pria', '4', 'Dokter Umum', '4', '4', '01');

-- --------------------------------------------------------

--
-- Table structure for table `ktp`
--

CREATE TABLE `ktp` (
  `nik` varchar(16) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL,
  `tanggal_lahir` varchar(50) NOT NULL,
  `jk` varchar(10) NOT NULL,
  `goldar` varchar(2) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `rt` varchar(10) NOT NULL,
  `kel` varchar(20) NOT NULL,
  `kec` varchar(20) NOT NULL,
  `agama` varchar(50) NOT NULL,
  `kawin` varchar(15) NOT NULL,
  `kerja` varchar(150) NOT NULL,
  `warga` varchar(150) NOT NULL,
  `berlaku` varchar(20) NOT NULL,
  `foto` varchar(150) NOT NULL,
  `kota_buat` varchar(10) NOT NULL,
  `tanggal_buat` varchar(20) NOT NULL,
  `ttd` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ktp`
--

INSERT INTO `ktp` (`nik`, `nama`, `tempat_lahir`, `tanggal_lahir`, `jk`, `goldar`, `alamat`, `rt`, `kel`, `kec`, `agama`, `kawin`, `kerja`, `warga`, `berlaku`, `foto`, `kota_buat`, `tanggal_buat`, `ttd`) VALUES
('1', '1', '1', '2-10-2020', 'Pria', 'O', '1', '1', '1', '1', 'Belum Dipilih', 'Belum Dipilih', 'Pengangguran', 'WNI', '1', 'C:\\Users\\hp\\Documents\\56110.jpg', '1', '1', 'C:\\Users\\hp\\Documents\\56110.jpg'),
('2', '21', '2111', '2-10-2020', 'Pria', 'O', '21', '21', '21', '21', 'Belum Dipilih', 'Belum Dipilih', 'Pengangguran', 'WNI', '21', 'C:UsershpDocuments56110.jpg', '21', '21', 'C:UsershpDocuments56110.jpg'),
('4', '4', '4', '9-10-2020', 'Pria', 'O', '4', '4', '4', '4', 'Belum Dipilih', 'Belum Dipilih', 'Pengangguran', 'WNI', '4', 'C:\\Users\\hp\\Documents\\56110.jpg', '4', '4', 'C:\\Users\\hp\\Documents\\56110.jpg'),
('8', '81', '81', '3-10-2020', 'Pria', 'O', '81', '81', '81', '81', 'Belum Dipilih', 'Belum Dipilih', 'Pengangguran', 'WNI', '81', 'C:UsershpDocuments56110.jpg', '18', '81', 'C:UsershpDocuments56110.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `Nama_obat` varchar(255) NOT NULL,
  `Harga_beli` int(11) NOT NULL,
  `Stok` int(11) NOT NULL,
  `Harga_jual` int(11) NOT NULL,
  `ID_cabang` varchar(255) NOT NULL,
  `Tgl_beli` date NOT NULL,
  `Tgl_kadaluarsa` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `NIK` varchar(255) NOT NULL,
  `Nama` varchar(255) NOT NULL,
  `Tgl_Lahir` date NOT NULL,
  `Goldar` varchar(255) NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `Alergi` varchar(255) NOT NULL,
  `Penyakit_Menurun` varchar(255) NOT NULL,
  `Golongan` enum('BPJS','NON_BPJS') NOT NULL,
  `No_Telepon` varchar(255) NOT NULL,
  `Alamat` varchar(255) NOT NULL,
  `ID_cabang` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`NIK`, `Nama`, `Tgl_Lahir`, `Goldar`, `Gender`, `Alergi`, `Penyakit_Menurun`, `Golongan`, `No_Telepon`, `Alamat`, `ID_cabang`) VALUES
('123', 'judi', '2000-02-26', 'AB', 'Wanita', '-', '-', 'BPJS', '0888', 'jl.abc no 4', ''),
('145', 'Kyle', '2020-10-02', 'O', 'Pria', 'something', 'hemorhoid', 'NON_BPJS', '02953', 'south park', '');

-- --------------------------------------------------------

--
-- Table structure for table `riwayat_pasien`
--

CREATE TABLE `riwayat_pasien` (
  `Penyakit` varchar(255) NOT NULL,
  `Tgl_kunjungan` date NOT NULL,
  `Keluhan` varchar(255) NOT NULL,
  `ID_pasien` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `ID_cabang` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`username`, `password`, `ID_cabang`) VALUES
('intan', 'intan', '01');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `ID_Transaksi` varchar(255) NOT NULL,
  `Tanggal_masuk` date NOT NULL,
  `Jumlah` int(11) NOT NULL,
  `Jenis_pasien` varchar(255) NOT NULL,
  `Harga_konsul` int(11) NOT NULL,
  `Harga_obat` int(11) NOT NULL,
  `Total_harga` int(11) NOT NULL,
  `ID_cabang` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `absensi_dokter`
--
ALTER TABLE `absensi_dokter`
  ADD KEY `NID` (`NID`);

--
-- Indexes for table `cabang`
--
ALTER TABLE `cabang`
  ADD PRIMARY KEY (`ID_cabang`);

--
-- Indexes for table `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`NIK`);

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD KEY `ID_cabang` (`ID_cabang`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`NIK`);

--
-- Indexes for table `riwayat_pasien`
--
ALTER TABLE `riwayat_pasien`
  ADD PRIMARY KEY (`Penyakit`),
  ADD UNIQUE KEY `ID_pasien` (`ID_pasien`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`ID_Transaksi`),
  ADD KEY `ID_cabang` (`ID_cabang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
