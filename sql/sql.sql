create database ustDB;
show databases;
use ustDB;

create table Employee(EMP_ID int not null ,
Manager_ID int ,
First_Name varchar(20) not null,
Last_Name varchar(20) not null,
EMP_Title varchar(20) not null,
Salary int not null,
Joining_date varchar(20) not null,
DEP varchar(20) not null);

 insert into Employee values(1,NULL,"Monika","Arora","Manager",100000,"02/20/14 9:00","HR"),
 (2,1,"Niharika","Verma","Executive",80000,"06/11/14 9:00","Admin"),
 (3,1,"Vishal","Singhal","Executive",300000,"02/20/14 9:00","HR"),
 (4,NULL,"Amitabh","Singh","Manager",500000,"02/20/14 9:00","Admin"),
 (5,4,"Vivek","Bhati","Asst.Manager",500000,"06/11/14 9:00","Admin"),
 (6,5,"Vipul","Diwan","Executive",200000,"06/11/14 9:00","Account"),
 (7,4,"Satish","Kumar","Lead",75000,"01/20/14 9:00","Account"),
 (8,4,"Geetika","Chauhan","Lead",90000,"04/11/14 9:00","Admin"),
 (8,null,"Geetik",'',"Lead",4000,"04/11/14 9:00","Admin");
 
 select First_Name,Last_Name
 from Employee 
 where Salary 
 between 50000 and 100000;
 
  select * from Employee;
  
  select e.EMP_ID 'EMP_ID',
  e.First_Name 'Employee' ,
  m.Manager_ID 'EMP_ID',
  m.First_Name 'Manager'
  from Employee 
  e JOIN Employee m ON 
  (e.Manager_ID=m.EMP_ID);
  
  select DEP,count(*) from Employee 
  GROUP BY DEP 
  ORDER BY count(*) DESC;
  
  select salary from Employee 
  order by salary DESC;
  
  select salary from Employee e1 
  where 5=(select count(distinct salary)
  from Employee e2
  where e1.salary>e2.salary) 
  order by salary DESC;
  
  select max(Salary) from Employee;
  
  select EMP_ID,count(*) 
  from Employee group by EMP_ID
  having count(EMP_ID)>1;
  
select count(*)
from Employee 
where Joining_date like "%14%";
 

select * from Employee
where Manager_ID is null;






