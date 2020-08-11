-- ----------------------------------------------
-- DDL Statements for tables
-- ----------------------------------------------

CREATE TABLE "CUSTOMERS" (
	ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
	NAME VARCHAR(255), 
	EMAIL VARCHAR(255),
	PASSWORD VARCHAR(255));
	
CREATE TABLE "EVENTS" (
	ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
	CODE VARCHAR(255), 
	TITLE VARCHAR(255),
	DESCRIPTION VARCHAR(1024));
	
CREATE TABLE "REGISTRATIONS" (
	ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
	EVENT_ID INTEGER NOT NULL,
	CUSTOMER_ID INTEGER NOT NULL,
	REGISTRATION_DATE DATE, 
	NOTES VARCHAR(1024));
-- ----------------------------------------------
-- DDL Statements for keys
-- ----------------------------------------------

-- primary/unique
ALTER TABLE "CUSTOMERS" ADD CONSTRAINT "CUSTOMERS_PK" PRIMARY KEY ("ID");

ALTER TABLE "EVENTS" ADD CONSTRAINT "EVENTS_PK" PRIMARY KEY ("ID");

ALTER TABLE "REGISTRATIONS" ADD CONSTRAINT "REGISTRATIONS_PK" PRIMARY KEY ("ID");

ALTER TABLE "REGISTRATIONS" ADD CONSTRAINT "CUSTOMERS_FK" FOREIGN KEY ("CUSTOMER_ID") REFERENCES CUSTOMERS ("ID");

ALTER TABLE "REGISTRATIONS" ADD CONSTRAINT "EVENTS_FK" FOREIGN KEY ("EVENT_ID") REFERENCES EVENTS ("ID");



