# wm-training-sample
* This is sample application for connecting mysql database and doing few db operations.

* Replace MYSQL_HOST, MYSQL_USER_NAME, MYSQL_PASSWORD in MySQLConnectionUtility before testing this.

* Required DB schema

 * create database WM_TEST;
 * CREATE TABLE STUDENTS (   ID INT NOT NULL,   NAME VARCHAR (20) NOT NULL,   AGE INT NOT NULL,   ADDRESS CHAR (25),   PRIMARY KEY (ID)   );
 * 
 * INSERT INTO STUDENTS (ID, NAME, AGE, ADDRESS) VALUES (1, 'Jhon', 21, 'US, CA');
 * INSERT INTO STUDENTS (ID, NAME, AGE, ADDRESS) VALUES (2, 'Robert', 20, 'UK, CS');
 * INSERT INTO STUDENTS (ID, NAME, AGE, ADDRESS) VALUES (3, 'Alwyn', 19, 'US, TX');
