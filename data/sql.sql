

SELECT *
FROM   Professor INNER JOIN
             Person ON Professor.uid = Person.uid
where Professor.uid = 'GV002'


--Select
select * from Section
select * from Faculty
select * from NominalClass
select * from Department
select * from Schedule

SELECT Course.*, Prerequisite_Course.prerequisite
FROM   Course INNER JOIN
             Prerequisite_Course ON Course.course_id = Prerequisite_Course.course_id
select * from Enrollment
--End Select


select * from Department
where name_dep like '____A%'
	and name_dep like '___________3%'
	and name_dep like '____________________11%'


select * from Department
where name_dep like '____A%'
	and name_dep like '____________________11%'


select * from Person

--Tra ve nhung section cua mon hoc OOP
SELECT Course.*, Section.*
FROM   Course INNER JOIN
             Section ON Course.course_id = Section.course_id
where Course.course_id = 'OOP'


--Tra ve section co giao vien day ten bat dau tu chu T
SELECT Section.*
FROM   Person INNER JOIN
             Professor ON Person.uid = Professor.uid INNER JOIN
             Section ON Professor.uid = Section.uid_professor
where Person.lastName like 'T%'


-- Tra ve section co nam hoc 2020
SELECT Section.*
FROM   Schedule INNER JOIN
             Section ON Schedule.id = Section.schedule_id
where Schedule.years = '2020'

-- Tra ve section co nam hoc 2020 va thuoc hoc ki 1
SELECT Section.*
FROM   Schedule INNER JOIN
             Section ON Schedule.id = Section.schedule_id
where Schedule.years = '2020'
and Schedule.semester like '%1%'

--Tra ve section theo ten mon hoc
SELECT Course.*, Section.*
FROM   Course INNER JOIN
             Prerequisite_Course ON Course.course_id = Prerequisite_Course.course_id INNER JOIN
             Section ON Course.course_id = Section.course_id
where Course.course_name like 'L%'