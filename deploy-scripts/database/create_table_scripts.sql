-------------- SERCURITY ----------------------
-----------------------------------------------
---------- AUTHOR TABLE -----------------------
-----------------------------------------------
-- DELETE IF EXITS
DROP TABLE IF EXISTS PUBLIC.AUTHOR CASCADE;

-- CREATE
CREATE TABLE PUBLIC.AUTHOR(
	ID UUID NOT NULL,
	NAME CHARACTER VARYING(50) COLLATE pg_catalog."default",
	HISTORY TEXT
);

-- ADD CONSTRAINTS
ALTER TABLE PUBLIC.AUTHOR 
	ADD CONSTRAINT AUTHOR_PK PRIMARY KEY (ID);
-----------------------------------------------

-------------- PRODUCT ------------------------
-----------------------------------------------
---------- AUTHOR TABLE -----------------------
-----------------------------------------------
-- DELETE IF EXITS
DROP TABLE IF EXISTS PUBLIC.AUTHOR CASCADE;

-- CREATE
CREATE TABLE PUBLIC.AUTHOR(
	ID UUID NOT NULL,
	NAME CHARACTER VARYING(50) COLLATE pg_catalog."default",
	HISTORY TEXT
);

-- ADD CONSTRAINTS
ALTER TABLE PUBLIC.AUTHOR 
	ADD CONSTRAINT AUTHOR_PK PRIMARY KEY (ID);
-----------------------------------------------

-----------------------------------------------
---------- PUBLISHER TABLE --------------------
-----------------------------------------------
-- DELETE IF EXISTS
DROP TABLE IF EXISTS PUBLIC.PUBLISHER CASCADE;

-- CREATE
CREATE TABLE PUBLIC.PUBLISHER(
	ID UUID NOT NULL,
	NAME CHARACTER VARYING(50) COLLATE pg_catalog."default",
	DESCRIPTION TEXT
);

-- ADD CONSTRAINTS
ALTER TABLE PUBLIC.PUBLISHER
	ADD CONSTRAINT PUBLISHER_PK PRIMARY KEY (ID);
-----------------------------------------------

-----------------------------------------------
---------- CATEGORY TABLE ---------------------
-----------------------------------------------
-- DELETE IF EXITS
DROP TABLE IF EXISTS PUBLIC.CATEGORY CASCADE;

-- CREATE
CREATE TABLE PUBLIC.CATEGORY(
	ID UUID NOT NULL,
	NAME CHARACTER VARYING(50) COLLATE pg_catalog."default",
	DESCRIPTION TEXT
);

-- ADD CONSTRAINTS
ALTER TABLE PUBLIC.CATEGORY
	ADD CONSTRAINT CATEGORY_PK PRIMARY KEY (ID);
-------------------------------------------------

-------------------------------------------------
---------- BOOK TABLE ---------------------------
-------------------------------------------------
-- DELETE IF EXITSTS
DROP TABLE IF EXISTS PUBLIC.BOOK CASCADE;

-- CREATE
CREATE TABLE PUBLIC.BOOK(
	ID UUID NOT NULL,
	TITLE CHARACTER VARYING(50) COLLATE pg_catalog."default",
	SUMMARY TEXT,
	PRICE FLOAT,
	QUANTITY INT,
	CREATED_DATE TIMESTAMP WITHOUT TIME ZONE,
	MODIFIED TIMESTAMP,
	IS_ACTIVE BOOLEAN,
	AUTHOR_ID UUID,
	PUBLISHER_ID UUID,
	CATEGORY_ID UUID
);

-- ADD CONSTRAINTS
ALTER TABLE PUBLIC.BOOK
	ADD CONSTRAINT BOOK_PK PRIMARY KEY (ID),
	ADD CONSTRAINT AUTHOR_FK FOREIGN KEY (AUTHOR_ID) REFERENCES PUBLIC.AUTHOR (ID) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION,
	ADD CONSTRAINT PUBLISHER_FK FOREIGN KEY (PUBLISHER_ID) REFERENCES PUBLIC.PUBLISHER(ID) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION,
	ADD CONSTRAINT CATEGORY_FK FOREIGN KEY (CATEGORY_ID) REFERENCES PUBLIC.CATEGORY (ID) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION;
-------------------------------------------------