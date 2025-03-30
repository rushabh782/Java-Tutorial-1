use TCS;

select * from customer;

update customer set age = 25 where id = 6;

create view customerView as select * from customer;

select * from customerView;

update customerView set age = 23 where id = 1;

desc customerView;

drop view customerView;

create view customerView1 as select id,name from customer limit 2;

select * from customerView1;

select * from course;
select * from student;

show tables;


create view student_course as select sid,name,cname from student inner join course on student.cid = course.cid;

select * from student_course;

create table demo(id int,name varchar(50));
insert into demo values(2,"sanjay"),(3,"sachind");

select * from demo;

create view demoview as select distinct *  from demo;
select * from demoview;
