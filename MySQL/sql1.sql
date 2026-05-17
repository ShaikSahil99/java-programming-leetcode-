create database if not exists XYZ;
use XYZ;
create table Employee(
Id int,
Name varchar(20),
Salary double, 
city varchar(30),
primary key(Id)
);
insert into Employee(Id,Name,Salary,city)values(1,"Sahil",22000,"Mumbai"),(2,"Sohel",29000,"Calcutta"),(3,"Cheeku",10000,'Kerala'),(4,"Abdul",22000,"Mumbai"),(5,"Muqqu",29000,"Calcutta"),(6,"arman",10000,'Kerala');
select * from Employee;
create table Customer(
Customer_Id int,
CustomerName varchar(20) default "Unknown"
);
insert into Customer(Customer_Id)values(1),(2),(3);
select distinct city from Employee;
select * from Employee where Id between 3 and 6;
select * from Employee where city in("Mumbai");
select * from Employee where city not in("Mumbai") limit 3;
select * from Employee order by Salary desc;
select city,avg(Salary) from Employee group by city order by avg(Salary);
select city,count(Name) from Employee group by city order by avg(Salary);
select city,sum(Name) from Employee group by city order by avg(Salary);
DROP TABLE Employee;	
DROP TABLE Customer;
TRUNCATE TABLE Employee;






