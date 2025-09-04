public class Main {
    public static void main(String[] args) {
        //now i am comeback
        //in SQL we have 2 parts :
        //1. DDL(Data Definition Language)
        //2. DMl(Data Manipulation Language)
//                      +----------------------------------+
//                      |   SQL (Structured Query Language)|
//                      +----------------------------------+
//                                /                   \
//                               /                     \
//                +--------------------------------+    +------------------------------------------+
//                | DDL (Data Definition Language) |    | DML (Data Manipulation Language)         |
//                +--------------------------------+    +------------------------------------------+
//                       |          |        |                   |        |           |          |
//                       |          |        |                   |        |           |          |
//                +---------+  +---------+  +---------+     +---------+ +---------+ +---------+ +---------+
//                | CREATE  |  |  DROP   |  | ALTER   |     | INSERT  | | DELETE  | | UPDATE  | | SELECT  |
//                +---------+  +---------+  +---------+     +---------+ +---------+ +---------+ +---------+
//                              удалить      изменить        добавление   удаление   обновление  выборка данных
//                                                          новый строк                          (используется чаще всего)


        //schemas it`s something like packets in java

        //now i`am work from idea, but i can work from SQL shell

        //I start in postgres database, I can switch to another.But if I want to leave current database,
        // I need to switch to another, I cannot leave from database

        //now I am know how to write comments in SQL, I start commenting there
    }
}

//TEXT FROM QUERY CONSOLE LOOK DOWN








/*
CREATE DATABASE company_repository;

CREATE SCHEMA company_storage;

DROP SCHEMA company_storage;

--For run full code or part Ctrl+Enter

CREATE TABLE company(
    id INT,
    name TEXT,
    --Now I understand how to write a comments is SQL
    --TEXT is like a String
    --And some more limited by bytes variants: VARCHAR(here write size), CHAR(only 120 bytes)
    date DATE
    --DATE(only date), but if I need date and time, I need to use TIMESTAMP, only time - TIME
);

--Ok but I created in public schema, I can choose between 2 variants:
--1. Choose right schema in right-up corner
--2. Write in code in which schema table will be located

DROP TABLE public.company;--here will be error if I DROP smth, that I write here

--2nd variant:
CREATE TABLE company_storage.company(
                                        id INT PRIMARY KEY ,
                                        name TEXT UNIQUE NOT NULL ,
                                        date DATE NOT NULL CHECK(date > '1994-01-01' AND date<'2009-01-01')
                                        --Also I can do like this(set multiple cionstraits to parameters)
--                                         UNIQUE (date)
--Not Null (very speaking name)
--UNIQUE (do unique columns)
--CHECK (check condition(условие) like an 'if')
--PRIMARY KEY (== UNIQUE + NOT NULL but can use only one 1 parameter)
--FOREIGN KEY

);


--Insert into
--Proper manners:
INSERT INTO company(id,name,date) VALUES (1,'Google', '2001-01-01'),
                                         (1337,'Apple','2001-08-25'),
                                         (228,'Samsung', '2000-01-02');
--ofc I can write smth in 1 command
--Date writing like this : XXXX-XX-XX


--Ok, but I see, if I use INSERT INTO 2 times with similar value, it will be writed in 2 different row
--For this we have CONSTRAINT:
--If writing some parameters, that not suitable(подходит)

DROP TABLE company_storage.company



CREATE SCHEMA company_storage_2;

CREATE TABLE company_storage_2.company(
    id SERIAL, --SERIAL is type of data type
    --SERIAL = INTEGER + SEQUENCE
    --SEQUENCE == random, but this random is like a independence structure,
    -- which not linked with other classes

    name TEXT,
    date TIMESTAMP,

    PRIMARY KEY (id),
    UNIQUE (name)
--     SERIAL(id)
    --I cant doing like that, becurse SERIAL is not CONSTRAINTS


);

INSERT INTO company_storage_2.company(name, date) VALUES ('Samsung', '25-08-15'),
                                                         ('Apple','1998-12-25');
--id generated automatically


TRUNCATE TABLE company_storage_2.company RESTART IDENTITY;--Clear table


--Get full table, * like in java get all part of library
SELECT * FROM company_storage_2.company;

--Get specific class field
SELECT name,date FROM company_storage_2.company;

-- Aliases, I can write aliases on different languages on name columns
SELECT
    id AS "Индефикатор",
    name AS "Название компании",
    date AS "Дата основания"
FROM company_storage_2.company;

--It returns table for us as a table with name "t"
SELECT t.id, t.name, t.date FROM company_storage_2.company AS t;

SELECT
    id AS indeficator,
    EXTRACT(YEAR FROM date) AS year_founded,
    CURRENT_DATE - date AS days_since_founded
FROM company_storage_2.company;
--EXTRACT took part of smth, in this moment is took year from date


--Get Unique name,id from table
SELECT DISTINCT name,id FROM company_storage_2.company;


--Skip 2 rows and write 3
SELECT * FROM company_storage_2.company LIMIT 3 OFFSET 2;


--Pagination is like a devide by pages, in this situation we on page 1, because we skip 0 and read 10
SELECT * FROM company_storage_2.company LIMIT 10 OFFSET 0;
--But here we on page 2, because we skip 10 and read 10;
SELECT * FROM company_storage_2.company LIMIT 10 OFFSET 10;



--Print table and sort rows by name field
SELECT * FROM company_storage_2.company ORDER BY name;

--descending (нисходящий), mean reverse sorting
SELECT * FROM company_storage_2.company ORDER BY name DESC ;

--Sort firstly by reverse date, secondaly name
SELECT * FROM company_storage_2.company
ORDER BY date DESC, name;

--Sort by expression,like math
SELECT * FROM company_storage_2.company
ORDER BY length(name)






 */