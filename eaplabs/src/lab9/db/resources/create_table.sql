create schema user_entitlement;

CREATE TABLE `user_entitlement`.`users` (
                                                  `id` INT NOT NULL AUTO_INCREMENT,
                                                  `name` VARCHAR(45) NULL,
                                                  `email` VARCHAR(45) NOT NULL UNIQUE,
                                                  `is_active` INT NOT NULL,
                                                  PRIMARY KEY (`id`));
