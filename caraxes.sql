DROP SCHEMA IF EXISTS `caraxes`;

CREATE SCHEMA `caraxes`;
USE `caraxes`;

CREATE TABLE IF NOT EXISTS `caraxes`.`movie` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(50) UNIQUE NOT NULL,
    `imdb_rating` DECIMAL(2 , 1 ) NOT NULL,
    `year_of_release` YEAR(4) NOT NULL,
    PRIMARY KEY (`id`)
)  ENGINE=INNODB AUTO_INCREMENT=1;

select * from movie;