
DROP TABLE IF EXISTS LOANS;

CREATE TABLE LOANS (
 loan_number INT AUTO_INCREMENT PRIMARY KEY,
 customer_id INT NOT NULL,
 loan_type VARCHAR(50) NOT NULL,
 loan_amount INT NOT NULL,
 loan_end_date DATE DEFAULT CURDATE() + 1
);

INSERT INTO LOANS (customer_id, loan_type, loan_amount, loan_end_date)
VALUES (1, 'HOUSING LOAN', 10000, CURDATE()+1000);

INSERT INTO LOANS (customer_id, loan_type, loan_amount, loan_end_date)
VALUES (1, 'VEHICLE LOAN', 50000, CURDATE()+100);

INSERT INTO LOANS (customer_id, loan_type, loan_amount, loan_end_date)
VALUES (2, 'HOUSING LOAN', 80000, CURDATE()+5000);

INSERT INTO LOANS (customer_id, loan_type, loan_amount, loan_end_date)
VALUES (2, 'PERSONAL LOAN', 7000, CURDATE()+10);