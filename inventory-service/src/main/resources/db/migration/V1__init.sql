CREATE TABLE `t_inventory` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `sku_code` varchar(255) default NULL,
    `quantity` INT default NULL,
    PRIMARY KEY (`id`)
)