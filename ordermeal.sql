/*
 Navicat Premium Data Transfer

 Source Server         : StuSys
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : ordermeal

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 10/05/2020 13:44:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('zwt', '123456');
INSERT INTO `admin` VALUES ('zq', '123456');

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `OPENID` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `FOODID` int(255) NOT NULL,
  `NUM` int(11) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES ('oGM6I5PrPguir95vFnHdpOIz8ZFw', 6, 1);
INSERT INTO `cart` VALUES ('oGM6I5PrPguir95vFnHdpOIz8ZFw', 7, 1);
INSERT INTO `cart` VALUES ('oGM6I5PrPguir95vFnHdpOIz8ZFw', 8, 1);

-- ----------------------------
-- Table structure for collection
-- ----------------------------
DROP TABLE IF EXISTS `collection`;
CREATE TABLE `collection`  (
  `CUSTOMERID` int(255) NOT NULL,
  `FOODID` int(255) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cusorder
-- ----------------------------
DROP TABLE IF EXISTS `cusorder`;
CREATE TABLE `cusorder`  (
  `ORDERID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CUSTOMERID` int(255) NOT NULL,
  `ORDERTIME` datetime(0) NOT NULL,
  `ORDERSTATE` int(11) NOT NULL,
  `TOTALPRICE` decimal(10, 0) NOT NULL,
  `TABLE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `CUSTOMERID` int(255) NOT NULL AUTO_INCREMENT,
  `OPENID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `NICKNAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SEX` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ISMEMBER` tinyint(1) NOT NULL,
  `HEADIMG` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `MEMBERNEMBER` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `MEMBERTIME` date NULL DEFAULT NULL,
  PRIMARY KEY (`CUSTOMERID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (5, 'oBcOVwgnLFIH7QTdZPy28nXZq6I0', '赵婉婷', '女', 0, 'https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTIe6Qyz7tCPVhuviaKpgkcDOdr4ndgjX5fHVQUMD53iaaphH6NSZJRynJLv5JgXcSRTlM96dibdk2CVQ/132', NULL, NULL);
INSERT INTO `customer` VALUES (6, 'oGM6I5PrPguir95vFnHdpOIz8ZFw', '哎Coding', '男', 0, 'https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLWOxKTdHQstf9T2fxIvMPM3kCQRXUhwEnseB9a2lYaVYRzJJE8TD9EicVLukTJiaS2ebdgcpaU626Q/132', NULL, NULL);

-- ----------------------------
-- Table structure for food
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food`  (
  `FOODID` int(255) NOT NULL AUTO_INCREMENT,
  `TYPEID` int(255) NOT NULL,
  `FOODNAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `FOODPRICE` double(10, 1) NOT NULL,
  `FOODIMG` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `FOODINFO` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `MEMBERPEICE` double(10, 1) NOT NULL,
  `SALENUMBER` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`FOODID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES (6, 5, '红烧带鱼', 49.9, 'http://localhost/OrderMeal/file/img/fish.jpg', 'yammy', 45.9, 0);
INSERT INTO `food` VALUES (7, 1, '冰淇淋', 16.9, 'http://localhost/OrderMeal/file/img/dishThree.jpg', '健康低脂', 12.9, 0);
INSERT INTO `food` VALUES (8, 5, '干煸豆角', 30.9, 'http://localhost/OrderMeal/file/img/dishFour.jpg', '好', 25.9, 0);
INSERT INTO `food` VALUES (9, 5, '糖醋排骨', 33.9, 'http://localhost/OrderMeal/file/img/dishSix.jpg', '好', 27.9, 0);
INSERT INTO `food` VALUES (10, 6, '红豆薏米粥', 9.9, 'http://localhost/OrderMeal/file/img/porridge.jpg', '暖心暖胃', 6.9, 0);
INSERT INTO `food` VALUES (11, 1, '杨枝甘露', 13.9, 'http://localhost/OrderMeal/file/img/mangodrink.jpg', '纯天然', 10.9, 0);

-- ----------------------------
-- Table structure for foodtype
-- ----------------------------
DROP TABLE IF EXISTS `foodtype`;
CREATE TABLE `foodtype`  (
  `TYPEID` int(255) NOT NULL AUTO_INCREMENT,
  `TYPENAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`TYPEID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of foodtype
-- ----------------------------
INSERT INTO `foodtype` VALUES (1, '饭后甜品');
INSERT INTO `foodtype` VALUES (2, '酒水饮料');
INSERT INTO `foodtype` VALUES (3, '精品凉菜');
INSERT INTO `foodtype` VALUES (4, '精致主食');
INSERT INTO `foodtype` VALUES (5, '精品热菜');
INSERT INTO `foodtype` VALUES (6, '暖胃汤粥');

-- ----------------------------
-- Table structure for judge
-- ----------------------------
DROP TABLE IF EXISTS `judge`;
CREATE TABLE `judge`  (
  `CUSTOMERID` int(255) NOT NULL,
  `FOODID` int(255) NOT NULL,
  `JCONTENT` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `JUDGEITME` datetime(0) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for orderdetail
-- ----------------------------
DROP TABLE IF EXISTS `orderdetail`;
CREATE TABLE `orderdetail`  (
  `FOODID` int(255) NOT NULL,
  `ORDERID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `FCOUNT` int(11) NOT NULL,
  `FPRICE` decimal(10, 0) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
