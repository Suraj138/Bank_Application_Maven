DROP TABLE IF EXISTS cards;

CREATE TABLE `cards` (
`card_id` int AUTO_INCREMENT PRIMARY KEY,
`customer_id` int NOT NULL,
`card_number` BIGINT NOT NULL,
`card_type` varchar(100) NOT NULL,
`expir_date` date DEFAULT NULL
);

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (1,98765,'CREDIT_CARD',CURDATE());

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (1,98875,'DEBT_CARD',CURDATE());

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (2,43785,'MASTER_CARD',CURDATE());

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (2,98834,'CREDIT_CARD',CURDATE());

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (3,23745,'PLATINUM_CARD',CURDATE());

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (3,33745,'GOLD_CARD',CURDATE());

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (4,55448,'PETROLIUM_CARD',CURDATE());

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (4,65428,'DIMOND_CARD',CURDATE());

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (5,78556,'HOLYDAY_CARD',CURDATE());

INSERT INTO `cards` (`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (5,10025,'URENIUM_CARD',CURDATE());

