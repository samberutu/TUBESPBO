-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 05 Bulan Mei 2019 pada 09.44
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `laundry`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `produk`
--

CREATE TABLE `produk` (
  `no_antrian` int(255) NOT NULL,
  `tanggal` date NOT NULL,
  `nama_pemilik` varchar(30) NOT NULL,
  `berat(kg)` float NOT NULL,
  `harga` int(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `tgl_diterima` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `produk`
--

INSERT INTO `produk` (`no_antrian`, `tanggal`, `nama_pemilik`, `berat(kg)`, `harga`, `status`, `tgl_diterima`) VALUES
(0, '2019-05-05', 'samlo', 3, 15000, 'Dalam Antrian', '0000-00-00'),
(1, '2019-05-05', 'leo', 2, 10000, 'Dalam Antrian', '0000-00-00'),
(2, '2019-05-05', 'james', 4, 20000, 'Dalam Antrian', '0000-00-00'),
(3, '2019-05-05', 'hendri', 2.5, 12500, 'Dalam Antrian', '0000-00-00'),
(4, '2019-05-05', 'edo', 2.7, 13500, 'Dalam Antrian', '0000-00-00'),
(5, '2019-05-05', 'jeans', 5, 25000, 'Dalam Antrian', '0000-00-00');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indeks untuk tabel `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`no_antrian`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
