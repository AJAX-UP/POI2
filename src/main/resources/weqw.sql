/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : weqw

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 27/05/2020 15:01:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ml_catalog_nation
-- ----------------------------
DROP TABLE IF EXISTS `ml_catalog_nation`;
CREATE TABLE `ml_catalog_nation`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键（记录唯一标识）',
  `NAME` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事项名称',
  `BASIC_CODE` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '基本编码',
  `TYPE` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事项类型',
  `BASIS` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '国家设定依据',
  `EXE_LEVEL` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国家行使层级',
  `FLAG` char(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '目录状态',
  `VERSION` int(10) NOT NULL COMMENT '事项版本',
  `VALID_DATE` date NULL DEFAULT NULL COMMENT '计划生效日期',
  `INVALID_DATE` date NULL DEFAULT NULL COMMENT '计划取消日期',
  `CENTRAL_DEPT` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '中央业务指导部门代码',
  `STR_LEVEL` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '目录层级',
  `HAS_CHILD` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否有下级目录',
  `IS_HANDLE` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否为办理项',
  `PARENTID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '父目录ID（父目录的主键）',
  `TENANT` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '租户标识',
  `TMS` timestamp(3) NULL DEFAULT NULL COMMENT '时间戳',
  `VNO` int(9) NULL DEFAULT NULL COMMENT '版本号',
  `TXN_ITT_CHNL_CGY_CODE` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道类型',
  `TXN_ITT_CHNL_ID` varchar(23) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道编号',
  `DAC_VERF` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'DAC校验',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '国家基本目录初始数据表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ml_classification_info
-- ----------------------------
DROP TABLE IF EXISTS `ml_classification_info`;
CREATE TABLE `ml_classification_info`  (
  `TYPEID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `TYPENAME` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类名称',
  `TYPE_CODE` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类代码',
  `SORTCODE` int(11) NOT NULL COMMENT '排序码',
  `CATEGORYID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类型',
  `PARENTID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '父级ID',
  `ISDISABLE` tinyint(4) NOT NULL COMMENT '是否禁用',
  `IS_DEL` tinyint(4) NOT NULL COMMENT '是否删除',
  `SERVICE_OBJECT` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '服务对象',
  `ISHOT` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否热门',
  `TENANT` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '租户标识',
  `TMS` timestamp(3) NULL DEFAULT NULL COMMENT '时间戳',
  `VNO` int(9) NULL DEFAULT NULL COMMENT '版本号',
  `TXN_ITT_CHNL_CGY_CODE` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道类型',
  `TXN_ITT_CHNL_ID` varchar(23) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道编号',
  `DAC_VERF` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'DAC校验',
  PRIMARY KEY (`TYPEID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '事项分类信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ml_matter_charge
-- ----------------------------
DROP TABLE IF EXISTS `ml_matter_charge`;
CREATE TABLE `ml_matter_charge`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键（记录唯一标识）',
  `TASK_GUID` char(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事项记录唯一标识',
  `FEE_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收费项目名称',
  `FEE_STAND` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '收费标准',
  `BY_LAW` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '收费依据',
  `IS_DESC` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '是否允许减免',
  `DESC_EXPLAIN` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '允许减免的依据',
  `REMARK` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `ORDER_NUM` int(11) NOT NULL COMMENT '排序码',
  `CATALOG_CHARGE_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '目录收费关联ID',
  `ISDEL` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否删除',
  `TENANT` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '租户标识',
  `TMS` timestamp(3) NULL DEFAULT NULL COMMENT '时间戳',
  `VNO` int(9) NULL DEFAULT NULL COMMENT '版本号',
  `TXN_ITT_CHNL_CGY_CODE` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道类型',
  `TXN_ITT_CHNL_ID` varchar(23) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道编号',
  `DAC_VERF` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'DAC校验',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '事项收费项目信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ml_matter_classification
-- ----------------------------
DROP TABLE IF EXISTS `ml_matter_classification`;
CREATE TABLE `ml_matter_classification`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `TYPEID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类id',
  `TASK_GUID` char(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事项记录唯一标识',
  `ISDEL` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否删除',
  `TENANT` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '租户标识',
  `TMS` timestamp(3) NULL DEFAULT NULL COMMENT '时间戳',
  `VNO` int(9) NULL DEFAULT NULL COMMENT '版本号',
  `TXN_ITT_CHNL_CGY_CODE` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道类型',
  `TXN_ITT_CHNL_ID` varchar(23) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道编号',
  `DAC_VERF` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'DAC校验',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '事项分类关系表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ml_matter_file
-- ----------------------------
DROP TABLE IF EXISTS `ml_matter_file`;
CREATE TABLE `ml_matter_file`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '材料ID（记录唯一标识）',
  `TASK_GUID` char(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事项记录唯一标识',
  `MATERIAL_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '材料名称',
  `MATERIAL_TYPE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '材料类型',
  `MATERIAL_FORMAT` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '材料形式',
  `IS_NEED` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '材料必要性',
  `FORM_GUID` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '空白表格',
  `EXAMPLE_GUID` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '示例样表',
  `SOURCE_TYPE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源渠道',
  `SOURCE_EXPLAIN` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源渠道说明',
  `PAGE_NUM` int(11) NULL DEFAULT NULL COMMENT '纸质材料份数',
  `PAGE_FORMAT` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '纸质材料规格',
  `FILL_EXPLAIN` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '填报须知',
  `ACCEPT_STAND` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '受理标准',
  `BY_LAW` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '要求提供材料的依据',
  `REMARK` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '备注',
  `ORDER_NUM` int(11) NOT NULL COMMENT '排序码',
  `HANDLE_CASE` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '非必要时办理情形',
  `IS_SELF` char(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '是否需要本人到现场填写',
  `CATALOG_FILE_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '目录材料关联ID',
  `COPY_EXPLAIN` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '复印件要求说明',
  `ISDEL` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否删除',
  `ORIGINALNUM` int(11) NULL DEFAULT NULL COMMENT '材料原件份数',
  `COPIESNUM` int(11) NULL DEFAULT NULL COMMENT '材料复印件份数',
  `TENANT` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '租户标识',
  `TMS` timestamp(3) NULL DEFAULT NULL COMMENT '时间戳',
  `VNO` int(9) NULL DEFAULT NULL COMMENT '版本号',
  `TXN_ITT_CHNL_CGY_CODE` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道类型',
  `TXN_ITT_CHNL_ID` varchar(23) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道编号',
  `DAC_VERF` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'DAC校验',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '事项申报材料表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ml_matter_file_attach
-- ----------------------------
DROP TABLE IF EXISTS `ml_matter_file_attach`;
CREATE TABLE `ml_matter_file_attach`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键（记录唯一标识）',
  `FILEID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '材料ID',
  `TASK_GUID` char(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事项记录唯一标识',
  `ATTACH_TYPE` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '附件类型',
  `ATTACH_NAME` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '附件原文件名称',
  `ATTACH_PATH` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '附件存储路径',
  `ISDEL` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否删除',
  `CATALOG_FILE_ATTACH_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '目录材料附件关联ID',
  `INIT_ATTACH_ID` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '原附件主键',
  `TENANT` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '租户标识',
  `TMS` timestamp(3) NULL DEFAULT NULL COMMENT '时间戳',
  `VNO` int(9) NULL DEFAULT NULL COMMENT '版本号',
  `TXN_ITT_CHNL_CGY_CODE` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道类型',
  `TXN_ITT_CHNL_ID` varchar(23) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道编号',
  `DAC_VERF` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'DAC校验',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '事项申报材料附件表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ml_matter_info
-- ----------------------------
DROP TABLE IF EXISTS `ml_matter_info`;
CREATE TABLE `ml_matter_info`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	主键（记录唯一标识）	',
  `MATTERID` char(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	实施清单唯一标识	',
  `TASK_NAME` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	事项名称	',
  `CATALOG_CODE` char(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	基本编码	',
  `LOCAL_CATALOG_CODE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	地方基本目录基本编码	',
  `TASK_TYPE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	事项类型	',
  `BY_LAW` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	设定依据	',
  `POWER_SOURCE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	权力来源	',
  `USE_LEVEL` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	行使层级	',
  `TASK_CODE` char(36) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	实施编码	',
  `LOCAL_TASK_CODE` char(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	地方实施编码	',
  `TASK_HANDLE_ITEM` char(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	业务办理项编码	',
  `TASK_VERSION` int(10) NULL DEFAULT NULL COMMENT '	事项版本	',
  `DEPT_CODE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	实施主体机构代码	',
  `CENTRAL_DEPT` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	中央业务指导部门代码	',
  `DEPT_TYPE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	实施主体性质	',
  `ENTRUST_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	委托部门	',
  `ANTICIPATE_DAY` int(11) NULL DEFAULT NULL COMMENT '	法定办结时限	',
  `ANTICIPATE_TYPE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	法定办结时限单位	',
  `ANTICIPATE_EXPLAIN` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '	法定办结时限说明	',
  `PROMISE_DAY` int(11) NULL DEFAULT NULL COMMENT '	承诺办结时限	',
  `PROMISE_TYPE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	承诺办结时限单位	',
  `PROMISE_EXPLAIN` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '	承诺办结时限说明	',
  `ACCEPT_CONDITION` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '	受理条件（原予以受理的法定条件）	',
  `IS_PERMIT_REDUCE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	是否涉及征收（税）费减免的审批	',
  `COLLECT_TYPE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	征收种类	',
  `HANDLE_FLOW` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '	办理流程-流程图	',
  `OFFLINE_FLOW` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	线下办理流程图	',
  `OFFLINE_EXPLAIN` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	线下办理流程说明	',
  `ONLINE_FLOW` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	网上办理流程图	',
  `ONLINE_EXPLAIN` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	网上办理流程说明	',
  `SPECIAL_PROCEDURE` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	特别程序说明	',
  `IS_FEE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	是否收费	',
  `FEE_BASIS` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '	收费依据	',
  `SERVER_TYPE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	服务对象	',
  `PROJECT_TYPE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	办件类型	',
  `HANDLE_TYPE` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	办理形式	',
  `LIMIT_SCENE_NUM` int(11) NULL DEFAULT NULL COMMENT '	到办事现场次数	',
  `IS_HANDLE_BY_GOV_NET` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	是否通过政务服务网办理	',
  `GOV_NET_URL` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	政务服务网地址	',
  `IS_HANDLE_BY_DEPT_SYS` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	是否通过部门业务系统办理	',
  `DEPT_SYS_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	部门业务系统名称	',
  `DEPT_SYS_URL` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	部门业务系统地址	',
  `DEPT_SYS_TYPE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	业务系统运行网络	',
  `APP_IS_SINGLE_LOGIN` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	移动端是否对接单点登录	',
  `MOBILE_TERMINAL_URL` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '	移动端办理地址	',
  `IS_SINGLE_LOGIN` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	计算机端是否对接单点登录	',
  `LINK_ADDR` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '	计算机端在线办理跳转地址	',
  `TRANSACT_ADDR` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	办理地点	',
  `TRANSACT_TIME` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	办理时间	',
  `TRAFFIC_GUIDE` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	交通指引	',
  `LINK_WAY` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '	咨询方式	',
  `SUPERVISE_WAY` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '	监督投诉方式	',
  `PUNISHMENT_METHOD` varchar(3000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	处罚的行为、种类、幅度	',
  `PLAN_EFFECTIVE_DATE` date NULL DEFAULT NULL COMMENT '	计划生效日期	',
  `PLAN_CANCEL_DATE` date NULL DEFAULT NULL COMMENT '	计划取消日期	',
  `IS_ENTRY_CENTER` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	是否进驻政务大厅	',
  `CENTER_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	大厅名称	',
  `IS_HANDLE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	是否通办	',
  `HANDLE_AREA` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	通办范围	',
  `LIMIT_EXPLAIN` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '	数量限制	',
  `RESULT_TYPE` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	审批结果类型	',
  `RESULT_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	审批结果名称	',
  `RESULT_GUID` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	审批结果样本	',
  `IS_SCHEDULE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	是否支持预约办理	',
  `SCHEDULE_NUM` int(11) NULL DEFAULT NULL COMMENT '	该事项每天可预约办理量	',
  `SCHEDULE_RULE` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	预约规则说明	',
  `IS_PAY_ONLINE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	是否支持网上支付	',
  `IS_EXPRESS` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	是否支持物流快递	',
  `IS_SERVICE_TERMINALS` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	是否支持自助终端办理	',
  `IS_MAIL_MATERIAL` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	是否支持申报材料邮寄	',
  `IS_MAIL_RESULT` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	是否支持办件结果邮寄	',
  `USER_TOPIC_TYPE` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	面向自然人事项主题分类	',
  `USER_CHARACTER_TOPIC_TYPE` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	面向自然人地方特色主题分类	',
  `CORP_TOPIC_TYPE` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	面向法人事项主题分类 	',
  `CORP_CHARACTER_TOPIC_TYPE` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	面向法人地方特色主题分类	',
  `IS_ONLINE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	是否网办	',
  `ONLINE_HANDLE_DEPTH` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	网上办理深度	',
  `ONLINE_HANDLE_URL` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '	网办地址	',
  `LIMIT_SCENE_EXPLAIN` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	必须现场办理原因说明	',
  `TOWN_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	乡镇街道名称	',
  `TOWN_CODE` char(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	乡镇街道代码	',
  `VILLAGE_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	村居社区名称	',
  `VILLAGE_CODE` char(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	村居社区代码	',
  `FINANCE_FLAG` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	金融服务标识	',
  `CONSULT_PHONE` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	咨询电话号码	',
  `NET_CONSULT_WAY` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	网络咨询方式	',
  `CONSULT_MAIL` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	咨询电子邮件	',
  `CONSULT_WECHAT` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	咨询微信公众号	',
  `COMPLAIN_PHONE` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	投诉电话号码	',
  `NET_COMPLAIN_WAY` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	网络投诉方式	',
  `COMPLAIN_MAIL` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	投诉电子邮件	',
  `COMPLAIN_LETTER_ADDR` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	投诉信函地址	',
  `RIGHT_ENJOY_BY_LAW` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	依法享有的权利	',
  `DUTY_PERFORM_BY_LAW` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	依法履行的义务	',
  `ADMINISTRATIVE_REVIEW_DEPT` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	行政复议部门	',
  `ADMINISTRATIVE_REVIEW_ADDR` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	行政复议地址	',
  `ADMINISTRATIVE_REVIEW_PHONE` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	行政复议电话	',
  `ADMINISTRATIVE_REVIEW_URL` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	行政复议网址	',
  `ADMINISTRATIVE_LITIGATION_DEPT` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	行政诉讼部门	',
  `ADMINISTRATIVE_LITIGATION_ADDR` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	行政诉讼地址	',
  `ADMINISTRATIVE_LITIGATION_PHONE` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	行政诉讼电话	',
  `ADMINISTRATIVE_LITIGATION_URL` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	行政诉讼网址	',
  `STR_LEVEL` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	所在层级	',
  `TASK_STATE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	事项状态	',
  `AUDIT_STATUS` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	审核状态	',
  `ISDEL` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	是否删除	',
  `ADDTIME` date NOT NULL COMMENT '	添加时间	',
  `PUBLISHTIME` date NULL DEFAULT NULL COMMENT '	发布时间	',
  `REGNCODE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	区域代码（实施清单所属局委所在区域）	',
  `USER_ORG_CODE` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	操作员部门	',
  `USER_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	操作员用户id	',
  `DATA_SOURCE` char(3) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '	数据来源	',
  `PARENT_MATTERID` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	上级事项的id	',
  `GROUP_ID` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	事项的分组id（根事项的id）	',
  `HAS_CHILD` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	是否有下级事项	',
  `MATTER_TYPE` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	事项分类	',
  `IS_TEMPLATE` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	是否为模板	',
  `OTHER_DEPT` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	联办机构	',
  `IS_EXIST_INTERMEDIARY` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	是否存在中介服务	',
  `INTERMEDIARY_CONTENT` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	中介服务内容	',
  `SERVICE_TYPE` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	中介服务名称	',
  `CURRENT_LEVEL` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	目录层级	',
  `CURRENT_DEPT_CODE` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	目录所属机构	',
  `TENANT` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	租户标识	',
  `TMS` timestamp(3) NULL DEFAULT NULL COMMENT '	时间戳	',
  `VNO` int(9) NULL DEFAULT NULL COMMENT '	版本号	',
  `TXN_ITT_CHNL_CGY_CODE` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	交易发起渠道类型	',
  `TXN_ITT_CHNL_ID` varchar(23) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	交易发起渠道编号	',
  `DAC_VERF` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	DAC校验	'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ml_matter_process_link
-- ----------------------------
DROP TABLE IF EXISTS `ml_matter_process_link`;
CREATE TABLE `ml_matter_process_link`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	主键（记录唯一标识）	',
  `TASK_GUID` char(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	事项记录唯一标识	',
  `LINK_NAME` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	环节名称	',
  `HANDLE_DEPT_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	办理处室	',
  `HANDLE_PERSON_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	办理人	',
  `HANDLE_DAY` int(11) NOT NULL COMMENT '	办理时限	',
  `HANDLE_TYPE` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	办理时限单位	',
  `IS_SPECIAL` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	有无特别程序	',
  `SPECIAL_EXPLAIN` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	特别程序说明	',
  `ORDER_NUM` int(11) NOT NULL COMMENT '	排序码	',
  `ISDEL` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '	是否删除	',
  `TENANT` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	租户标识	',
  `TMS` timestamp(0) NULL DEFAULT NULL COMMENT '	时间戳	',
  `VNO` int(9) NULL DEFAULT NULL COMMENT '	版本号	',
  `TXN_ITT_CHNL_CGY_CODE` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	交易发起渠道类型	',
  `TXN_ITT_CHNL_ID` varchar(23) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	交易发起渠道编号	',
  `DAC_VERF` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '	DAC校验	',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ml_matter_question
-- ----------------------------
DROP TABLE IF EXISTS `ml_matter_question`;
CREATE TABLE `ml_matter_question`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键（记录唯一标识）',
  `TASK_GUID` char(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事项记录唯一标识',
  `QUESTION` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '问题',
  `ANSWER` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '解答',
  `ORDER_NUM` int(11) NOT NULL COMMENT '排序码',
  `ISDEL` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否删除',
  `TENANT` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '租户标识',
  `TMS` timestamp(3) NULL DEFAULT NULL COMMENT '时间戳',
  `VNO` int(9) NULL DEFAULT NULL COMMENT '版本号',
  `TXN_ITT_CHNL_CGY_CODE` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道类型',
  `TXN_ITT_CHNL_ID` varchar(23) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道编号',
  `DAC_VERF` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'DAC校验',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '事项常见问题解答表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ml_matter_result
-- ----------------------------
DROP TABLE IF EXISTS `ml_matter_result`;
CREATE TABLE `ml_matter_result`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `TASK_GUID` char(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事项记录唯一标识',
  `RESULT_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '办理结果名称',
  `RESULT_SAMP` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '办理结果样本',
  `ISDEL` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否删除',
  `TENANT` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '租户标识',
  `TMS` timestamp(3) NULL DEFAULT NULL COMMENT '时间戳',
  `VNO` int(9) NULL DEFAULT NULL COMMENT '版本号',
  `TXN_ITT_CHNL_CGY_CODE` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道类型',
  `TXN_ITT_CHNL_ID` varchar(23) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易发起渠道编号',
  `DAC_VERF` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'DAC校验',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '事项办理结果表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
