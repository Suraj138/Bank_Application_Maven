DROP TABLE IF EXISTS insurance;

CREATE TABLE `insurance` (
`insurance_id` int AUTO_INCREMENT PRIMARY KEY,
`customer_id` int NOT NULL,
`insurance_type` varchar(100) NOT NULL,
`insured_amount` BIGINT NOT NULL,
`insurance_end_date` date DEFAULT NULL
);

INSERT INTO `insurance` (`customer_id`,`insurance_type`, `insured_amount`, `insurance_end_date`)
VALUES (1,'VEHICLE INSURANCE',99000,CURDATE()+365);

INSERT INTO `insurance` (`customer_id`,`insurance_type`, `insured_amount`, `insurance_end_date`)
VALUES (1,'HOME INSURANCE',557000,CURDATE()+100);

INSERT INTO `insurance` (`customer_id`,`insurance_type`, `insured_amount`, `insurance_end_date`)
VALUES (2,'TERM INSURANCE',458000,CURDATE()+1000);

INSERT INTO `insurance` (`customer_id`,`insurance_type`, `insured_amount`, `insurance_end_date`)
VALUES (2,'TRAVEL INSURANCE',359888,CURDATE()+90);

INSERT INTO `insurance` (`customer_id`,`insurance_type`, `insured_amount`, `insurance_end_date`)
VALUES (3,'HEALTH INSURANCE',4558000,CURDATE()+900);

INSERT INTO `insurance` (`customer_id`,`insurance_type`, `insured_amount`, `insurance_end_date`)
VALUES (3,'BUSINESS INSURANCE',1059888,CURDATE()+150);

INSERT INTO `insurance` (`customer_id`,`insurance_type`, `insured_amount`, `insurance_end_date`)
VALUES (4,'ELECTRIC INSURANCE',58000,CURDATE()+500);

INSERT INTO `insurance` (`customer_id`,`insurance_type`, `insured_amount`, `insurance_end_date`)
VALUES (4,'AGENCY INSURANCE',39888,CURDATE()+90);