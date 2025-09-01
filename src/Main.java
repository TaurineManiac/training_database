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
    if INT,
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
                        if INT,
                        name TEXT,
                        date DATE

);



 */