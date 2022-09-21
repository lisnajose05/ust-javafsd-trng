use ustDB;

create table Worker(Worker_ID int not null ,
First_Name varchar(20) not null,
Last_Name varchar(20) not null,
Salary int not null,
Joining_date varchar(20) not null,
Department varchar(20) not null);

 insert into Worker values(001,"Monika","Arora",100000,"02/20/14 9:00:00","HR"),
 (002,"Niharika","Verma",80000,"06/11/14 9:00:00","Admin"),
 (003,"Vishal","Singhal",300000,"02/20/14 9:00:00","HR"),
 (004,"Amitabh","Singh",500000,"02/20/14 9:00:00","Admin"),
 (005,"Vivek","Bhati",500000,"06/11/14 9:00:00","Admin"),
 (006,"Vipul","Diwan",200000,"06/11/14 9:00:00","Account"),
 (007,"Satish","Kumar",75000,"01/20/14 9:00:00","Account"),
 (008,"Geetika","Chauhan",90000,"04/11/14 9:00:00","Admin");
 
 select First_Name as Worker_Name from Worker;
 
 select upper(First_Name) from Worker;
 
 select distinct Department from Worker;
 
 select substring(First_Name,1,3) from Worker;
 
 select INSTR(First_Name,Binary'a')from Worker where First_Name='Amitabh';
 
 select rtrim(First_Name) from Worker;
 
 select LTRIM(Department) from Worker;
 
 select distinct length(Department) from Worker;
 
 select Replace(First_Name,'a','A') from Worker;
 
 select CONCAT(First_Name,'',Last_Name) as 'Complete_Name' from Worker;
 
 select * from Worker
order by first_name asc;



select * from Worker
order by First_Name asc, Department desc;

select * from Worker where first_name in ("Vipul","Satish");

select * from Worker where first_name not in ("Vipul","Satish");

select * from Worker where Department="Admin";

select * from Worker where first_name like '%a%';

select * from worker where first_name like '%a';

select * from worker where first_name like '______h';

 select * from Worker where salary between 50000 and 100000;
 select count(*) from Worker where Department="Admin";
 select First_Name,Last_Name from Worker where salary between 50000 and 100000;
 
 select * from Worker where year (Joining_Date)=2014 and month(Joining_Date)=2;
 
 select Department,count(*) from Worker
  GROUP BY Department 
  ORDER BY count(*) DESC;
  
  
 select * from worker where MOD(Worker_ID,2)<>0;
 
select * from worker where MOD(Worker_ID,2)=0;
