-- auto Generated on 2018-05-22 16:07:38 
-- DROP TABLE IF EXISTS `city`; 
CREATE TABLE city(
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `city_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'cityName',
    `province_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'provinceName',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'city';
