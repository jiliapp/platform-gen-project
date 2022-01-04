-- ----------------------------
-- do sql
-- ----------------------------
create database  if not exists `shared-ad` default  CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci  charset  utf8mb4;

DROP TABLE IF EXISTS `shared-ad`.`agent`;
CREATE TABLE `shared-ad`.`agent` (
 `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
 `nick_name` varchar(128) COLLATE utf8mb4_bin NOT NULL COMMENT '运营商名称',
 `user_name` varchar(128) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '登录账户',
 `contact_name` varchar(128) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '联系人',
 `contact_number` varchar(11) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '联系电话',
 `expired_at` datetime NOT NULL   COMMENT '过期时间',
 `ref_user_id` bigint(20)  NULL  COMMENT 'ref用户ID',
 `create_user_id` bigint(20)  NULL  COMMENT '创建人ID',
 `status` int(11) DEFAULT NULL COMMENT '状态[1-已启用,2-已禁用]',
 `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
 `updated_at` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
 `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
 PRIMARY KEY (`id`),
 UNIQUE KEY `idx_agent_user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='运营代理';

INSERT INTO `shared-ad`.`agent` VALUES (1446750480012283904,'四川xx科技有限公司','17380072170','17380072170','17380072170','2021-10-31 00:00:00',1446750904731701250,1440939914966470656,2,'2021-10-09 16:12:48','2021-10-09 16:14:30',NULL),(1446755263280451584,' 四川XX科技有限公司','17380072222','张三','17380072222','2021-10-31 00:00:00',NULL,1440939914966470656,1,'2021-10-09 16:31:49','2021-10-09 16:31:49',NULL),(1446758550125809664,'安讯宜胜互联网科技有限','1111','111','17380072111','2021-10-31 00:00:00',NULL,1440939914966470656,1,'2021-10-09 16:44:52','2021-10-09 16:44:52',NULL);


