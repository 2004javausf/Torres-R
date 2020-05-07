CREATE TABLE BEAR (
BEAR_ID INTEGER PRIMARY KEY,
BEAR_TYPE_ID INTEGER,
BEAR_NAME VARCHAR2(50),
BEAR_BIRTHDATE DATE,
BEAR_WEIGHT INTEGER DEFAULT 200,
CAVE_ID INTEGER);

CREATE TABLE BEAR_TYPE (
BEAR_TYPE_ID INTEGER PRIMARY KEY,
BEAR_TYPE_NAME VARCHAR2(50));

CREATE TABLE CAVE (
CAVE_ID INTEGER PRIMARY KEY,
CAVE_NAME VARCHAR2(50),
MAX_BEARS INTEGER DEFAULT 4);

CREATE TABLE BEEHIVE (
BEEHIVE_ID INTEGER PRIMARY KEY,
BEEHIVE_WEIGHT INTEGER DEFAULT 50);

CREATE TABLE BEAR_BEEHIVE (
BEAR_ID INTEGER,
BEEHIVE_ID INTEGER,
PRIMARY KEY (BEAR_ID, BEEHIVE_ID));

--ADD CONSTRAINTS
ALTER TABLE BEAR
ADD CONSTRAINT FK_BEAR_BEAR_TYPE
FOREIGN KEY (BEAR_TYPE_ID) REFERENCES BEAR_TYPE(BEAR_TYPE_ID);

ALTER TABLE BEAR
ADD CONSTRAINT FK_BEAR_CAVE
FOREIGN KEY (CAVE_ID) REFERENCES CAVE(CAVE_ID);

ALTER TABLE BEAR_BEEHIVE
ADD CONSTRAINT FK_BEAR_BEEHIVE_BEAR
FOREIGN KEY(BEAR_ID) REFERENCES BEAR(BEAR_ID);

ALTER TABLE BEAR_BEEHIVE
ADD CONSTRAINT FK_BEAR_BEEHIVE_BEEHIVE
FOREIGN KEY (BEEHIVE_ID) REFERENCES BEEHIVE(BEEHIVE_ID);

--CHECK CONSTRAINTS
ALTER TABLE BEAR
ADD CONSTRAINT CK_BEAR_WEIGHT_POSITIVE
CHECK(BEAR_WEIGHT > 0);

ALTER TABLE BEEHIVE
ADD CONSTRAINT CK_BEEHIVE_WEIGHT
CHECK(BEEHIVE_WEIGHT > 0);

--UNIQUE CONSTRAINTS
ALTER TABLE CAVE
ADD CONSTRAINT UQ_CAVE_NAME
UNIQUE(CAVE_NAME);

ALTER TABLE BEAR_TYPE
ADD CONSTRAINT UQ_BEAR_TYPE
UNIQUE(BEAR_TYPE_NAME);

INSERT INTO BEAR_TYPE VALUES(1, 'BROWN');
INSERT INTO BEAR_TYPE VALUES(2, 'BLACK');
INSERT INTO BEAR_TYPE VALUES(3, 'TEDDY');

SELECT * FROM BEAR_TYPE;

INSERT INTO CAVE VALUES(1, 'UPTOWN', 6);

INSERT INTO BEAR VALUES(1, 3, 'STEVEPOOH', '20-MAY-2003', 35, 1);

SELECT * FROM BEAR;

DROP  TABLE CAVE;