CREATE DATABASE IT;
CREATE TABLE COMPANY(
    ID INT,
    NAME VARCHAR(100),
    EMPLOYEES INT
);
INSERT INTO COMPANY(ID,NAME,EMPLOYEES)VALUES(1,"Monkeyy Raja",10000),(2,"Flipkart",14000),(3,"Google",19000),(4,"Amazon",20000),(5,"IBM",50000),(6,"PWC",40000),(7,"Monkeyy Raja",12000),(8,"MAmazon",10000);
SELECT * FROM Institute;
SELECT * FROM COMPANY;
CREATE TABLE Institute(
Id INT,
Name VARCHAR(20),
Salary DOUBLE,
city VARCHAR(30)
);
INSERT INTO Institute(Id,Name,Salary,city)VALUES(1,"Sahil",22000,"Mumbai"),(2,"Sohel",29000,"Calcutta"),(3,"Cheeku",10000,'Kerala'),(4,"Abdul",22000,"Mumbai"),(5,"Muqqu",29000,"Calcutta"),(6,"arman",10000,'Kerala');
SELECT city,count(name) FROM Institute GROUP BY city HAVING MAX(Salary) > 23000; 
SELECT city,count(name) FROM Institute GROUP BY city ORDER BY city; 
UPDATE Institute SET Name="Suhel" WHERE Name="Sahil";
UPDATE Institute SET Salary=45000 WHERE Name="Suhel";
SET SQL_SAFE_UPDATES=0;
UPDATE Institute SET Salary=Salary+100;
DELETE FROM COMPANY WHERE ID=7 AND EMPLOYEES=12000;