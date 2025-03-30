use TCS;

create table author (author_id integer primary key, 
                            authorName varchar(30), 
                            email varchar (25), gender varchar (6));
                            
create table book (BookId integer not null unique, 
                        ISBN integer primary key, 
                       book_name varchar (30) not null, 
                        author integer, ed_num integer, 
                      price integer, pages integer, 
         foreign key (author) references author (author_id) on delete cascade);
         
         
insert into author values 
              (1, "Kraig Muller", "Wordnewton@gmail.com", "Male");
insert into author values
              (2, "Karrie Nicolette", "karrie23@gmail.com", "Female");
insert into book values
              (1, 001, "Glimpses of the past", 1, 1, 650, 396);
insert into book values
              (2, 002, "Beyond The Horizons of Venus", 1, 1, 650, 396);
insert into book values
              (3, 003, "Ultrasonic Aquaculture", 2, 1, 799, 500);
insert into book values
              (4, 004, "Cryogenic Engines", 2, 1, 499, 330); 
              

-- DEFAULT
delimiter //
create procedure display_book()
begin
select * from book;
select * from author;
end //

call display_book(); //

//
drop procedure display_book;
//


-- IN 
delimiter //
create procedure Second(in x int)
begin
select * from book where BookId = x;
end //

call Second(4);//

-- OUT
delimiter //
create procedure Third(out maxprice int)
begin
select max(price) into maxprice from book;
end;//

call Third(@m);//
select @m;//

-- INOUT

delimiter //
create procedure Fourth(inout x int)
begin
select price into x from book where BookId = x;
end; //

set @m = 4;
call Fourth(@m);
select @m;//