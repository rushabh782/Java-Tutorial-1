use TCS;


create table customer(id int primary key auto_increment, name varchar(50),age int, dob date);
create table message(mid int primary key auto_increment,uid int,message varchar(300));




insert into customer(name, age, dob) values("jaya",16,null);


create table emp12(id int primary key auto_increment,name varchar(50),salary int); 
create table empprevioussalary(empid int,previous_salary int);


insert into emp12(name,salary) values("rgnesh",23789);

update emp12 set salary = salary + 5000;
select * from emp12;
select * from empprevioussalary;

delimiter //
create trigger Third
before update on emp12
for each row
begin
insert into empprevioussalary values(old.id,old.salary);
end //



select * from customer;
select * from message;

delimiter //
create trigger first
before insert on customer
for each row
begin
if new.age< 1 then set new.age=1;
end if;
end //

delimiter //
create trigger second
after insert on customer
for each row
begin
if new.dob is null then
insert into message(uid,message) values(new.id,concat("Hi ,",new.name,"PLease update your date of birth"));
end if;
end //




