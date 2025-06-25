
-- This schema is for when you use GUI interface

-- Project Schema 

-- Create Database
create database studentregistrationsystem2;

-- Using databse
use studentregistrationsystem2;

-- Creating Admin Login table
create table admin_login(
username varchar(20),
password varchar(20));


-- Creating Faculty Login table
create table faculty_login(
username varchar(20),
password varchar(20));


-- Creating Student Login table
create table student_login(
username varchar(20),
password varchar(20));


-- Creating Department table
create table departments(
department_id int primary key,
department_name varchar(20));

-- Creating Student table
create table student(
std_id int primary key,
std_name varchar(20),
std_fname varchar(20),
department_id int,
foreign key(department_id) references departments(department_id));


-- Creating Courses table
create table courses(
course_id int primary key,
course_name varchar(20));


-- Creating Faculty table
create table faculty(
faculty_id int,
faculty_name varchar(20),
course_id int,
foreign key(course_id) references courses(course_id));



-- Creating Enrolled Courses table
create table EnrolledCourses(
std_id int primary key,
course1 varchar(30),
course2 varchar(30),
course3 varchar(30),
course4 varchar(30),
course5 varchar(30),
course6 varchar(30),
lab1 varchar(30),
lab2 varchar(30),
lab3 varchar(30),
foreign key(std_id) references student(std_id));



-- Creating Theory Marks table
create table ThMarks(
std_id int,
course varchar(30),
mid_marks decimal(5,2),
sessional_marks decimal(5,2),
final_marks decimal(5,2),
total_marks decimal(5,2),
gpa decimal(3,2),
foreign key(std_id) references student(std_id));


-- Creating Lab Marks table
create table LabMarks(
std_id int,
course varchar(30),
mid_marks decimal(5,2),
sessional_marks decimal(5,2),
final_marks decimal(5,2),
total_marks decimal(5,2),
gpa decimal(3,2),
foreign key(std_id) references student(std_id));


-- Creating CGPA table
create table CGPA(
std_id int,
gpa decimal(3,2),
foreign key(std_id) references student(std_id));



-- Inserting Department Data
insert into departments values
("319", "Computer Science"),
("195", "Software Engineering");


-- Inserting Course Data
insert into courses values
("31", "Comp Arc(Th)"),
("151", "OS(Th)"),
("42", "Database(Th)"),
("201", "TRW"),
("127", "Linear Algebra"),
("311", "Comp Arc(Lab)"),
("1511", "OS(Lab)"),
("421", "Database(Lab)");



-- Inserting Student Data
insert into student values
("101", "Urooj Fatima", "Mushtaque Ali", "319"),
("102", "Misbah Hassan", "Muhammad Hassan", "319"),
("103", "Abdul Rafiu", "Abdul Kareem", "319"),
("104", "Syed Hassan Ali", "Syed Niaz Shah", "319"),
("105", "Abdul Manio", "Abdul Qadir", "319");




-- Inserting Faculty Data
insert into faculty values
("601", "Khakoo Mal", "31"),
("602", "Abdul Manan", "151"),
("603", "Marina Gul", "42"),
("604", "Abdul Aziz", "201"),
("605", "Abdul Fatah", "127"),
("601", "Khakoo Mal", "311"),
("602", "Abdul Manan", "1511"),
("603", "Marina Gul", "421");

insert into admin_login values
("admin", "123");
