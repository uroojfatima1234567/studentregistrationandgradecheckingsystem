-- local querries
-- 1. Select all students
SELECT * FROM students;

-- 2. Select student details with department names
SELECT std_id, std_name, std_fname, department_name 
FROM students 
JOIN departments 
USING (department_id);

-- 3. Select all students with enrolled courses
SELECT * 
FROM students 
JOIN enrolled_courses 
USING (std_id);

-- 4. Select students' theory marks for "Comp Arch(Th)"
SELECT * 
FROM students 
JOIN theory_marks 
USING (std_id) 
WHERE course_id = (SELECT course_id FROM courses WHERE course_name = 'Comp Arch(Th)');

-- 5. Select students' lab marks for "OS(Th)"
SELECT * 
FROM students 
JOIN lab_marks 
USING (std_id) WHERE course_id = (SELECT course_id FROM courses WHERE course_name = 'OS(Th)');

-- 6. Select faculty details for course "Database(Th)"
SELECT faculty_id, faculty_name, course_name 
FROM faculty 
JOIN courses 
USING(course_id) WHERE course_name = 'Database(Th)';

-- 7. Select all departments
SELECT * FROM departments;

-- 8. Select all courses
SELECT * FROM courses;

-- 9. Select students with enrolled courses
SELECT * 
FROM students 
JOIN enrolled_courses USING (std_id);

-- 10. Select students' theory marks for "TRW" with final marks > 40
SELECT * 
FROM students 
JOIN theory_marks 
USING (std_id) WHERE final_marks > 40 AND course_id = (SELECT course_id FROM courses WHERE course_name = 'TRW');


-- 11. Count the number of students in each department
SELECT course_name, COUNT(*) AS num_students_enrolled
FROM courses
JOIN enrolled_courses USING (course_id)
GROUP BY course_name;


-- 12. List all courses along with the count of enrolled students in each course
SELECT course_name, COUNT(*) AS num_students_enrolled
FROM courses
JOIN enrolled_courses USING (course_id)
GROUP BY course_name;


-- 13. Calculate the average final marks for each course
SELECT course_name, AVG(final_marks) AS avg_final_marks
FROM theory_marks
JOIN courses USING (course_id)
GROUP BY course_name;


-- 14. Find the faculty members who are teaching more than one course
SELECT faculty_name, COUNT(*) AS num_courses_taught
FROM faculty
GROUP BY faculty_name
HAVING num_courses_taught > 1;


-- 15. Find the student with the highest total marks in theory among all courses
SELECT std_id, SUM(final_marks) AS total_marks
FROM theory_marks
GROUP BY std_id
ORDER BY total_marks DESC
LIMIT 1;


-- 16. List all students who have not enrolled in any course
SELECT *
FROM students
WHERE std_id NOT IN (SELECT std_id FROM enrolled_courses);




