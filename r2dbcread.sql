/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.3.66_3306
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : 192.168.3.66:3306
 Source Schema         : r2dbcread

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 21/05/2021 17:28:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `id` bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `created_at` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, 'compuer', '2021-05-21 16:43:36');
INSERT INTO `product` VALUES (2, 'Iphone7', '2021-05-21 16:43:47');
INSERT INTO `product` VALUES (3, 'car', '2021-05-21 16:44:04');
INSERT INTO `product` VALUES (4, 'book', '2021-05-21 16:44:28');
INSERT INTO `product` VALUES (5, 'cat', '2021-05-21 16:52:42');
INSERT INTO `product` VALUES (6, 'dog', '2021-05-21 16:52:52');
INSERT INTO `product` VALUES (7, 'fish', '2021-05-21 16:53:04');
INSERT INTO `product` VALUES (8, 'tree', '2021-05-21 16:53:22');
INSERT INTO `product` VALUES (9, 'birld', '2021-05-21 16:53:44');
INSERT INTO `product` VALUES (10, 'food', '2021-05-21 16:54:06');

SET FOREIGN_KEY_CHECKS = 1;
