CREATE DATABASE  IF NOT EXISTS `ec_site` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ec_site`;
-- MySQL dump 10.13  Distrib 8.0.28, for macos11 (x86_64)
--
-- Host: localhost    Database: ec_site
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Dumping data for table `carts`
--

LOCK TABLES `carts` WRITE;
/*!40000 ALTER TABLE `carts` DISABLE KEYS */;
/*!40000 ALTER TABLE `carts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'食料品'),(2,'美容品'),(3,'雑貨');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `delivery`
--

LOCK TABLES `delivery` WRITE;
/*!40000 ALTER TABLE `delivery` DISABLE KEYS */;
/*!40000 ALTER TABLE `delivery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (1,2,'パンテーン エアリー',' 【業界屈指の配合量】シトルリンを８００mg/6 粒配合！',2480,'在庫あり','2022-04-09 19:56:58',NULL,NULL,2,'https://m.media-amazon.com/images/I/61i-FVM274L._AC_SL1500_.jpg'),(2,2,'Nile 濃密スカルプシャンプー','【濃密泡で髪に至高のひとときを】頭皮を洗いながら髪のコンディションを整えるスカルプシャンプー。アミノ酸活性剤を使用し頭皮に優しいのに、極上の洗浄を実現',2680,'在庫あり','2022-04-09 20:05:37',NULL,NULL,2,'https://m.media-amazon.com/images/I/514uHpZcA-L._AC_SL1500_.jpg'),(3,2,'キャンメイク ラッシュケアエッセンス 4.2g','どこにでも売っているマスカラ！！！！',2680,'在庫あり','2022-04-09 20:10:53',NULL,NULL,2,'https://m.media-amazon.com/images/I/11OxrpNICNL._AC_.jpg'),(4,2,'BULK HOMME 洗顔１００g +化粧水サンプル１回分付き','「余分だから落とす。余分だけを落とす」限りなくシンプルな発想が生んだ、”THE FACE WASH”。',2200,'在庫あり','2022-04-09 20:14:28',NULL,NULL,2,'https://m.media-amazon.com/images/I/71qXUMoJXmL._AC_SL1500_.jpg'),(5,2,'N organic ローション　１００ml','深呼吸したくなる、心地よいスキンタイムを癒しの時間に。',8976,'在庫あり','2022-04-09 20:17:09',NULL,NULL,2,'https://m.media-amazon.com/images/I/71pRW52mBiL._AC_SL1500_.jpg'),(6,2,'美容ローラー ','あーとりあえず美容器ですね。はい',123,'納期２〜３週間','2022-04-29 18:46:50',NULL,NULL,2,'https://m.media-amazon.com/images/I/61pPiAesGrL._AC_SL1500_.jpg'),(7,2,'みかん 蒲郡ハウスみかん 秀品 約1.2kg Sサイズ 15個 愛知県産','とにかく美味い！',298,'在庫あり','2022-04-29 18:47:33',NULL,NULL,1,'https://m.media-amazon.com/images/I/71CQOc-AMHL._AC_SL1001_.jpg'),(8,2,'ドール パイン&黄桃 227g×24個','パインパイン♪',198,'在庫あり','2022-04-29 18:47:56',NULL,NULL,1,'https://m.media-amazon.com/images/I/71zeSpVvozL._AC_SL1500_.jpg'),(9,2,'【 牛松 本店 】 松阪牛 特選 ハンバーグ 160g × 5個 ','お肉お肉☆',123,'在庫あり','2022-04-29 18:48:47',NULL,NULL,1,'https://m.media-amazon.com/images/I/71svWbWEFGL._AC_SL1500_.jpg'),(10,2,'【感動の<生>体験】アサヒスーパードライ生ジョッキ缶 340ml×24本','アサヒスーパードライ！',218,'在庫あり','2022-04-29 18:51:21',NULL,NULL,1,'https://m.media-amazon.com/images/I/71LjibJKcgL._AC_SL1000_.jpg'),(11,2,'みかん','静岡県産三ヶ日みかんジューシー新鮮です！',298,'在庫なし','2022-04-29 18:52:21',NULL,NULL,1,'https://m.media-amazon.com/images/I/71CQOc-AMHL._AC_SL1001_.jpg'),(12,2,'Valery Madelyn ガーデンオーナメント ノーム 大地の妖精','【おしゃれなデザイン】自宅に妖精のノームがやってきった！帰宅する時、のんびり寝ているノームを見て、仕事の疲れをすぐに取れるでしょう。彼女、子供、友達のプレゼントとして或いはインテリアとして、簡単にメルヘンチックな雰囲気を作れます！',2980,'納期２〜３週間','2022-04-29 18:52:28',NULL,NULL,3,'https://m.media-amazon.com/images/I/819OkXQwVjL._AC_SL1500_.jpg'),(13,2,'Valery Madelyn ガーデンライト ソーラーライト 屋外 防水 おしゃれ ツリーハウス','Valery MadelynはEagleGiftsからの小売ブランドです. 我々は、美しい、思慮深い、時代を超越した製品をお客様に提供することを望んでいる。Valery Madelynは豪華で快適で優雅な家を意味しています。愛と幸福に満ちた家族です。',1780,'納期２〜３週間','2022-04-29 18:53:52',NULL,NULL,3,'https://m.media-amazon.com/images/I/91Et3Lnzo+L._AC_SL1500_.jpg'),(29,2,'みかん','みかん美味しい',128,'納期1~2日','2022-05-09 18:35:23',NULL,NULL,1,'https://m.media-amazon.com/images/I/51oZCppL0qS._AC_.jpg'),(30,2,'みかん','美味しいみかんです。',128,'納期1~2日','2022-05-09 18:48:21',NULL,NULL,1,'https://m.media-amazon.com/images/I/51oZCppL0qS._AC_.jpg');
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `order_items`
--

LOCK TABLES `order_items` WRITE;
/*!40000 ALTER TABLE `order_items` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `order_main`
--

LOCK TABLES `order_main` WRITE;
/*!40000 ALTER TABLE `order_main` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_main` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tax`
--

LOCK TABLES `tax` WRITE;
/*!40000 ALTER TABLE `tax` DISABLE KEYS */;
INSERT INTO `tax` VALUES (1,8),(2,10);
/*!40000 ALTER TABLE `tax` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-09 20:01:29
