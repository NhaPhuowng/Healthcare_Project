CREATE TABLE `cadastral_vn`
(
    `cadastral_id`   INT(3) NOT NULL AUTO_INCREMENT,
    `cadastral_code` VARCHAR(10)  NOT NULL,
    `cadastral_name` VARCHAR(100) NOT NULL,
    `parent_code`    VARCHAR(10) NULL,
    `int_order`      INT(3) NULL,
    `cadastral_type` TINYINT(1) NULL,
    `sDesc`          VARCHAR(255) NULL,
    PRIMARY KEY (`cadastral_id`)
);
CREATE TABLE `ethnic`
(
    `ethnic_id`   INT(3) NOT NULL,
    `ethnic_name` VARCHAR(100) NULL,
    `index_num`   INT(3) NULL,
    `is_active`   TINYINT(1) NOT NULL,
    PRIMARY KEY (`ethnic_id`)
);
CREATE TABLE `user_info`
(
    `user_id`          INT(10) NOT NULL AUTO_INCREMENT,
    `user_name`        VARCHAR(50)  NOT NULL,
    `role`             INT(3) NULL,
    `user_patient_id`  VARCHAR(20) NULL,
    `phone_number`     VARCHAR(20)  NOT NULL,
    `date_of_birth`    DATE         NOT NULL,
    `gender`           INT(3) NOT NULL,
    `marital_status`   VARCHAR(30) NULL,
    `job`              VARCHAR(50) NULL,
    `identity_card`    VARCHAR(20)  NOT NULL,
    `insurance_number` VARCHAR(20) NULL,
    `email`            VARCHAR(100) NULL,
    `address_city`     INT(10) NULL,
    `address_district` INT(10) NULL,
    `address_ward`     INT(10) NULL,
    `address_street`   INT(10) NULL,
    `address_detail`   VARCHAR(200) NULL,
    `ethnic_id`        INT(3) NULL,
    `avatar_link`      VARCHAR(100) NULL,
    `is_active`        TINYINT(1) NOT NULL,
    `is_verify`        TINYINT(1) NOT NULL,
    `password`         VARCHAR(100) NOT NULL,
    `salt_password`    VARCHAR(100) NOT NULL,
    PRIMARY KEY (`user_id`)
);