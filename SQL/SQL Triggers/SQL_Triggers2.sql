use TCS;




CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    salary DECIMAL(10, 2)
);

INSERT INTO employees (name, salary) VALUES ('John Doe', 50000.00);
INSERT INTO employees (name, salary) VALUES ('Jane Smith', 60000.00);



CREATE TABLE employee_audit (
    id INT AUTO_INCREMENT PRIMARY KEY,
    employee_id INT,
    old_salary DECIMAL(10, 2),
    new_salary DECIMAL(10, 2),
    changed_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
UPDATE employees
SET salary = 55000.00
WHERE name = 'John Doe';
select * from employees;
select * from employee_audit;



delimiter //
create trigger Fourth
after update on employees
for each row
begin
INSERT INTO employee_audit (employee_id, old_salary, new_salary)
    VALUES (OLD.id, OLD.salary, NEW.salary);
end //


CREATE TABLE emp13(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    salary int
); //

insert into emp13 values(3,"Vikas",26678); //
select * from emp13;//
select * from empbackup; //
create table empbackup 
as select * from emp13 where 1 = 2; //

delimiter //
create trigger Fifth
before delete on emp13
for each row
begin 
insert into empbackup values(old.id,old.name, old.salary);
end //

delete from emp13 where id = 2;


create table st(id int primary key auto_increment,name varchar(50),status varchar(50)); //

insert into st(name, status) values("ramesh","fail"); 


create table stpass as select * from st where 1= 2; //

create table stfail as select * from st where 1= 2; //

delimiter //
create trigger sixth
before delete on st
for each row
begin
if old.status = "pass" then insert into stpass values(old.id,old.name,old.status);
else insert into stfail values(old.id,old.name,old.status);
end if;
end //

delete from st where id = 4;

select * from stpass;
select * from stfail;
select * from st;