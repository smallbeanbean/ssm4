/*
Navicat MySQL Data Transfer

Source Server         : aa
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2018-09-28 15:26:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `myuser`
-- ----------------------------
DROP TABLE IF EXISTS `myuser`;
CREATE TABLE `myuser` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(20) default NULL,
  `userpass` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of myuser
-- ----------------------------
INSERT INTO `myuser` VALUES ('1', '9aa12', 'bbbb');
INSERT INTO `myuser` VALUES ('2', 'aa21', 'bb2');
INSERT INTO `myuser` VALUES ('3', 'dd,cc', 'dd,cc');
INSERT INTO `myuser` VALUES ('4', 'ee', 'ee');
INSERT INTO `myuser` VALUES ('5', 'ee2', 'ee2');
INSERT INTO `myuser` VALUES ('6', 'ff', 'ff');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sid` int(11) NOT NULL auto_increment,
  `sname` varchar(50) default NULL,
  `spic` varchar(50) default NULL,
  `sflag` int(11) default NULL,
  PRIMARY KEY  (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', null, null, '-1');
INSERT INTO `student` VALUES ('2', '小王', null, '0');
INSERT INTO `student` VALUES ('3', '小李', null, '0');
INSERT INTO `student` VALUES ('4', 'ss', 'temp1.jpg', '0');
INSERT INTO `student` VALUES ('5', '哈', 'temp3.jpg', '0');
INSERT INTO `student` VALUES ('6', 'aa', 'temp2.png', '0');
INSERT INTO `student` VALUES ('7', 'bb', 'temp1.jpg', '0');
INSERT INTO `student` VALUES ('11', 'aa', 'temp1.jpg', '0');
INSERT INTO `student` VALUES ('12', 'bb', 'temp2.png', '0');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tid` int(11) NOT NULL auto_increment,
  `sid` int(11) default NULL,
  `tname` varchar(50) default NULL,
  `tpic` varchar(50) default NULL,
  `tflag` int(11) default NULL,
  PRIMARY KEY  (`tid`),
  KEY `tsid` (`sid`),
  CONSTRAINT `tsid` FOREIGN KEY (`sid`) REFERENCES `student` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '1', '小明', null, '0');
INSERT INTO `teacher` VALUES ('2', '1', '小王', null, '0');
INSERT INTO `teacher` VALUES ('3', '2', 'abc', null, '0');
