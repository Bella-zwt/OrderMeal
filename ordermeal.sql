/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : ordermeal

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2020-05-09 13:49:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('zwt', '123456');
INSERT INTO `admin` VALUES ('zq', '123456');

-- ----------------------------
-- Table structure for collection
-- ----------------------------
DROP TABLE IF EXISTS `collection`;
CREATE TABLE `collection` (
  `CUSTOMERID` int(255) NOT NULL,
  `FOODID` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collection
-- ----------------------------

-- ----------------------------
-- Table structure for cusorder
-- ----------------------------
DROP TABLE IF EXISTS `cusorder`;
CREATE TABLE `cusorder` (
  `ORDERID` varchar(255) NOT NULL,
  `CUSTOMERID` int(255) NOT NULL,
  `ORDERTIME` datetime NOT NULL,
  `ORDERSTATE` int(11) NOT NULL,
  `TOTALPRICE` decimal(10,0) NOT NULL,
  `TABLE` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cusorder
-- ----------------------------

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `CUSTOMERID` int(255) NOT NULL AUTO_INCREMENT,
  `OPENID` varchar(255) NOT NULL,
  `NICKNAME` varchar(255) NOT NULL,
  `SEX` varchar(255) NOT NULL,
  `ISMEMBER` tinyint(1) NOT NULL,
  `HEADIMG` varchar(255) NOT NULL,
  `MEMBERNEMBER` varchar(255) DEFAULT NULL,
  `MEMBERTIME` date DEFAULT NULL,
  PRIMARY KEY (`CUSTOMERID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('5', 'oBcOVwgnLFIH7QTdZPy28nXZq6I0', '赵婉婷', '女', '0', 'https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTIe6Qyz7tCPVhuviaKpgkcDOdr4ndgjX5fHVQUMD53iaaphH6NSZJRynJLv5JgXcSRTlM96dibdk2CVQ/132', null, null);

-- ----------------------------
-- Table structure for food
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food` (
  `FOODID` int(255) NOT NULL AUTO_INCREMENT,
  `TYPEID` int(255) NOT NULL,
  `FOODNAME` varchar(255) NOT NULL,
  `FOODPRICE` double(10,1) NOT NULL,
  `FOODIMG` varchar(255) NOT NULL,
  `FOODINFO` varchar(255) DEFAULT NULL,
  `MEMBERPEICE` double(10,1) NOT NULL,
  `SALENUMBER` int(11) DEFAULT NULL,
  PRIMARY KEY (`FOODID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES ('6', '5', '红烧带鱼', '49.9', 'http://localhost/OrderMeal/file/img/fish.jpg', 'yammy', '45.9', '0');
INSERT INTO `food` VALUES ('7', '1', '冰淇淋', '16.9', 'http://localhost/OrderMeal/file/img/dishThree.jpg', '健康低脂', '12.9', '0');
INSERT INTO `food` VALUES ('8', '5', '干煸豆角', '30.9', 'http://localhost/OrderMeal/file/img/dishFour.jpg', '好', '25.9', '0');
INSERT INTO `food` VALUES ('9', '5', '糖醋排骨', '33.9', 'http://localhost/OrderMeal/file/img/dishSix.jpg', '好', '27.9', '0');
INSERT INTO `food` VALUES ('10', '6', '红豆薏米粥', '9.9', 'http://localhost/OrderMeal/file/img/porridge.jpg', '暖心暖胃', '6.9', '0');
INSERT INTO `food` VALUES ('11', '1', '杨枝甘露', '13.9', 'http://localhost/OrderMeal/file/img/mangodrink.jpg', '纯天然', '10.9', '0');

-- ----------------------------
-- Table structure for foodtype
-- ----------------------------
DROP TABLE IF EXISTS `foodtype`;
CREATE TABLE `foodtype` (
  `TYPEID` int(255) NOT NULL AUTO_INCREMENT,
  `TYPENAME` varchar(255) NOT NULL,
  PRIMARY KEY (`TYPEID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of foodtype
-- ----------------------------
INSERT INTO `foodtype` VALUES ('1', '饭后甜品');
INSERT INTO `foodtype` VALUES ('2', '酒水饮料');
INSERT INTO `foodtype` VALUES ('3', '精品凉菜');
INSERT INTO `foodtype` VALUES ('4', '精致主食');
INSERT INTO `foodtype` VALUES ('5', '精品热菜');
INSERT INTO `foodtype` VALUES ('6', '暖胃汤粥');

-- ----------------------------
-- Table structure for judge
-- ----------------------------
DROP TABLE IF EXISTS `judge`;
CREATE TABLE `judge` (
  `CUSTOMERID` int(255) NOT NULL,
  `FOODID` int(255) NOT NULL,
  `JCONTENT` varchar(255) NOT NULL,
  `JUDGEITME` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of judge
-- ----------------------------

-- ----------------------------
-- Table structure for orderdetail
-- ----------------------------
DROP TABLE IF EXISTS `orderdetail`;
CREATE TABLE `orderdetail` (
  `FOODID` int(255) NOT NULL,
  `ORDERID` varchar(255) NOT NULL,
  `FCOUNT` int(11) NOT NULL,
  `FPRICE` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderdetail
-- ----------------------------
