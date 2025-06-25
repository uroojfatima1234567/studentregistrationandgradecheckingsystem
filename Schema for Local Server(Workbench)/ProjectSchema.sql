-- Create Database

CREATE DATABASE IF NOT EXISTS studentregistrationsystem;

-- Using Database
USE studentregistrationsystem;

-- Creating Departments table
CREATE TABLE IF NOT EXISTS departments 
(
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50) NOT NULL UNIQUE
);

-- Creating Students table
CREATE TABLE IF NOT EXISTS students 
(
    std_id INT PRIMARY KEY,
    std_name VARCHAR(50) NOT NULL,
    std_fname VARCHAR(50) NOT NULL,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

-- Creating Courses table
CREATE TABLE IF NOT EXISTS courses 
(
    course_id INT PRIMARY KEY,
    course_name VARCHAR(50) NOT NULL UNIQUE
);

-- Creating Faculty table
CREATE TABLE IF NOT EXISTS faculty 
(
    faculty_id INT,
    faculty_name VARCHAR(50) NOT NULL,
    course_id INT,
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);

-- Creating EnrolledCourses table
CREATE TABLE IF NOT EXISTS enrolled_courses 
(
    std_id INT,
    course_id INT,
    PRIMARY KEY (std_id, course_id),
    FOREIGN KEY (std_id) REFERENCES students(std_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);

-- Creating TheoryMarks table
CREATE TABLE IF NOT EXISTS theory_marks 
(
    std_id INT,
    course_id INT,
    mid_marks DECIMAL(5,2),
    sessional_marks DECIMAL(5,2),
    final_marks DECIMAL(5,2),
    PRIMARY KEY (std_id, course_id),
    FOREIGN KEY (std_id) REFERENCES students(std_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);

-- Creating LabMarks table
CREATE TABLE IF NOT EXISTS lab_marks 
(
    std_id INT,
    course_id INT,
    mid_marks DECIMAL(5,2),
    sessional_marks DECIMAL(5,2),
    final_marks DECIMAL(5,2),
    PRIMARY KEY (std_id, course_id),
    FOREIGN KEY (std_id) REFERENCES students(std_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);




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
insert into students values
("101", "Urooj Fatima", "Mushtaque Ali", "319"),
("102", "Misbah Hassan", "Muhammad Hassan", "319"),
("103", "Abdul Rafiu", "Abdul Kareem", "319"),
("104", "Syed Hassan Ali", "Syed Niaz Shah", "319"),
("105", "Abdul Manio", "Abdul Qadir", "319"),
("106", "Sarah Davis", "Sarah's Father", "319"),
("107", "James Wilson", "James's Father", "319"),
("108", "Emma Taylor", "Emma's Father", "319"),
("109", "Matthew Martinez", "Matthew's Father", "319"),
("110", "Olivia Anderson", "Olivia's Father", "319"),
("111", "Ethan Rodriguez", "Ethan's Father", 319),
("112", "Charlotte Lewis", "Charlotte's Father", 319),
("113", "Ryan Lee", "Ryan's Father", 319),
("114", "Amelia Walker", "Amelia's Father", 319),
("115", "Logan Hall", "Logan's Father", 319);


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


-- Student 1
insert into Enrolled_Courses values
("101", "31"),
("101", "151"),
("101", "42"),
("101", "201"),
("101", "127"),
("101", "311"),
("101", "1511"),
("101", "421");

-- Student 2
insert into Enrolled_Courses values
("102", "31"),
("102", "151"),
("102", "42"),
("102", "201"),
("102", "127"),
("102", "311"),
("102", "1511"),
("102", "421");

-- Student 3
insert into Enrolled_Courses values
("103", "31"),
("103", "151"),
("103", "42"),
("103", "201"),
("103", "127"),
("103", "311"),
("103", "1511"),
("103", "421");

-- Student 4
insert into Enrolled_Courses values
("104", "31"),
("104", "151"),
("104", "42"),
("104", "201"),
("104", "127"),
("104", "311"),
("104", "1511"),
("104", "421");

-- Student 5
insert into Enrolled_Courses values
("105", "31"),
("105", "151"),
("105", "42"),
("105", "201"),
("105", "127"),
("105", "311"),
("105", "1511"),
("105", "421");

-- Student 6
insert into Enrolled_Courses values
("106", "31"),
("106", "151"),
("106", "42"),
("106", "201"),
("106", "127"),
("106", "311"),
("106", "1511"),
("106", "421");

-- Student 7
insert into Enrolled_Courses values
("107", "31"),
("107", "151"),
("107", "42"),
("107", "201"),
("107", "127"),
("107", "311"),
("107", "1511"),
("107", "421");

-- Student 8
insert into Enrolled_Courses values
("108", "31"),
("108", "151"),
("108", "42"),
("108", "201"),
("108", "127"),
("108", "311"),
("108", "1511"),
("108", "421");

-- Student 9
insert into Enrolled_Courses values
("109", "31"),
("109", "151"),
("109", "42"),
("109", "201"),
("109", "127"),
("109", "311"),
("109", "1511"),
("109", "421");

-- Student 10
insert into Enrolled_Courses values
("110", "31"),
("110", "151"),
("110", "42"),
("110", "201"),
("110", "127"),
("110", "311"),
("110", "1511"),
("110", "421");




-- Inserting Theory Marks Student 1 Data
insert into Theory_Marks values
-- Student 1
('101', '31', '25', '18.5', '46'),
('101', '151', '25', '24.5', '46'),
('101', '42', '22', '19', '45'),
('101', '201', '22', '18.5', '41'),
('101', '127', '20.5', '18.5', '44'),

-- Student 2
('102', '31', '24', '18.5', '45'),
('102', '151', '24', '24.5', '45'),
('102', '42', '21', '19', '44'),
('102', '201', '21', '18.5', '40'),
('102', '127', '22', '18.5', '43'),

-- Student 3
('103', '31', '25.7', '19', '47'),
('103', '151', '25', '24.5', '47'),
('103', '42', '29.5', '19', '46'),
('103', '201', '22', '18.5', '41'),
('103', '127', '25.75', '18.5', '44'),

-- Student 4
('104', '31', '26', '18.5', '45'),
('104', '151', '25', '24.5', '45'),
('104', '42', '28.5', '19', '46'),
('104', '201', '21', '18.5', '40'),
('104', '127', '19', '18.5', '39'),

-- Student 5
('105', '31', '24', '18.5', '45'),
('105', '151', '25', '24.5', '45'),
('105', '42', '21', '19', '44'),
('105', '201', '21', '18.5', '40'),
('105', '127', '22', '18.5', '43'),


-- Student 6
('106', '31', '24', '18.5', '45'),
('106', '151', '25', '24.5', '45'),
('106', '42', '21', '19', '44'),
('106', '201', '21', '18.5', '40'),
('106', '127', '22', '18.5', '43'),

-- Student 7
('107', '31', '25.5', '19', '47'),
('107', '151', '25', '24.5', '47'),
('107', '42', '29', '19', '46'),
('107', '201', '22', '18.5', '41'),
('107', '127', '25.5', '18.5', '44'),

-- Student 8
('108', '31', '26', '18.5', '45'),
('108', '151', '25', '24.5', '45'),
('108', '42', '28', '19', '46'),
('108', '201', '21', '18.5', '40'),
('108', '127', '19', '18.5', '39'),

-- Student 9
('109', '31', '24', '18.5', '45'),
('109', '151', '25', '24.5', '45'),
('109', '42', '21', '19', '44'),
('109', '201', '21', '18.5', '40'),
('109', '127', '22', '18.5', '43'),

-- Student 10
('110', '31', '25', '18.5', '46'),
('110', '151', '25', '24.5', '46'),
('110', '42', '22', '19', '45'),
('110', '201', '22', '18.5', '41'),
('110', '127', '20.5', '18.5', '44');



-- Inserting Lab Marks Student 1 Data
insert into Lab_Marks values
-- Student 1
("101", "311", "14", "9.5", "23"),
("101", "1511", "7", "8", "23"),
("101", "421", "13", "10", "24"),

-- Student 2
("102", "311", "14.5", "9.5", "23"),
("102", "1511", "13", "8.5", "23"),
("102", "421", "13", "10", "24"),

-- Student 3
("103", "311", "13", "9.5", "24"),
("103", "1511", "15", "9.8", "24"),
("103", "421", "13", "10", "24"),

-- Student 4
("104", "311", "13", "7", "23"),
("104", "1511", "11.5", "7", "23"),
("104", "421", "13", "10", "24"),

-- Student 5
("105", "311", "14.5", "9.5", "23"),
("105", "1511", "13", "8.5", "23"),
("105", "421", "13", "10", "24"),

-- Student 6
("106", "311", "14.5", "9.5", "23"),
("106", "1511", "13", "8.5", "23"),
("106", "421", "13", "10", "24"),

-- Student 7
("107", "311", "13", "9.5", "24"),
("107", "1511", "15", "9.8", "24"),
("107", "421", "13", "10", "24"),

-- Student 8
("108", "311", "13", "7", "23"),
("108", "1511", "11.5", "7", "23"),
("108", "421", "13", "10", "24"),

-- Student 9
("109", "311", "14.5", "9.5", "23"),
("109", "1511", "13", "8.5", "23"),
("109", "421", "13", "10", "24"),

-- Student 10
("110", "311", "14", "9.5", "23"),
("110", "1511", "13", "8", "23"),
("110", "421", "13", "10", "24");

