create database ustDB;
show databases;
use ustDB;
create table ust_table(ID int not null primary key,
name varchar(20), 
state varchar(20),
age int);
show tables;

insert into ust_table values(1,"Anu","KTM",20),
(2,"vinu","KTM",20),
(3,"Anna","KTM",20);

select * from ust_table;

update ust_table set age=25 where id=2;

select name, if(id>2,"Good","Bad") as remarks from ust_table;
 
 create table table2(id int not null primary key,
 dept_name varchar(20),
 city varchar(20));
 
 insert into table2 values(1,"English","ktm"),
(2,"physics","EKM") ,
(3,"CS","kochi");

 insert into table2 values(4,"social","ktm"),
 (5,"science","kochi");
 select name,dept_name,city,state from ust_table join table2 on ust_table.id=table2.id;
 
 select count(id) from ust_table;
 
 select city,count(*) from table2 group by city;
 
 select * from table2 group by city;
 
 select count(*) from table2;

select dept_name,count(city)from table2 group by city having count(city)<3;
 
 select sum(id) from table2 having sun(id)>5;