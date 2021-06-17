/*
 Navicat Premium Data Transfer

 Source Server         : localhost_lee_01
 Source Server Type    : MySQL
 Source Server Version : 80025
 Source Host           : localhost:3306
 Source Schema         : lee

 Target Server Type    : MySQL
 Target Server Version : 80025
 File Encoding         : 65001

 Date: 17/06/2021 17:56:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_tree
-- ----------------------------
DROP TABLE IF EXISTS `t_tree`;
CREATE TABLE `t_tree` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'name',
  `p_id` int DEFAULT NULL COMMENT 'parent_id',
  `sort` tinyint DEFAULT NULL COMMENT 'sort',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of t_tree
-- ----------------------------
BEGIN;
INSERT INTO `t_tree` VALUES (1, '江苏省', 0, 1);
INSERT INTO `t_tree` VALUES (2, '安徽省', 0, 2);
INSERT INTO `t_tree` VALUES (3, '浙江省', 0, 3);
INSERT INTO `t_tree` VALUES (4, '山东省', 0, 4);
INSERT INTO `t_tree` VALUES (5, '四川省', 0, 5);
INSERT INTO `t_tree` VALUES (6, '南京市', 1, 1);
INSERT INTO `t_tree` VALUES (7, '无锡市', 1, 2);
INSERT INTO `t_tree` VALUES (8, '苏州市', 1, 3);
INSERT INTO `t_tree` VALUES (9, '合肥市', 2, 1);
INSERT INTO `t_tree` VALUES (10, '马鞍山市', 2, 2);
INSERT INTO `t_tree` VALUES (11, '杭州市', 3, 1);
INSERT INTO `t_tree` VALUES (12, '嘉兴市', 3, 2);
INSERT INTO `t_tree` VALUES (13, '温州市', 3, 3);
INSERT INTO `t_tree` VALUES (14, '成都市', 5, 1);
INSERT INTO `t_tree` VALUES (15, '惠山区', 7, 1);
INSERT INTO `t_tree` VALUES (16, '北塘区', 7, 2);
INSERT INTO `t_tree` VALUES (17, '新区', 7, 3);
INSERT INTO `t_tree` VALUES (18, '崇安区', 7, 4);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
