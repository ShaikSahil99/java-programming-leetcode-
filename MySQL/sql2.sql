create database if not exists College;
use College;
create table Dept(
Id int,
Name varchar(20),
Subject varchar(20),
primary key(Id)
);
insert into Dept(Id,Name,Subject)values(1,"Sahil","English"),(2,"Sohel","Maths"),(3,"Cheeku","Hindi"),(4,"Abdul","English"),(5,"Muqqu","Maths"),(6,"arman","Hindi");
select * from Dept;
create table Teacher(
dept_Id int,
Salary float,
foreign key(dept_Id) references Dept(Id)
);
insert into Teacher(dept_Id, Salary)values(1,20000),(3,40000),(4,30000),(6,50000);
