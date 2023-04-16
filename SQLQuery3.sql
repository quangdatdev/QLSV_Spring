
--- Tạo lớp học phần
INSERT INTO [dbo].[Section]   ([section_id],[dayEnd],[dayStart],[status],[course_id],[uid_professor],[room])
     VALUES  ('LTPT0001','2023-05-18','2023-04-16','Cho sinh vien dang ky','LTPT','GV001','X01.01')
GO


---Sinh viên đăng ký vào một lớp học phần
INSERT INTO [dbo].[Enrollment]  ([id_section],[uid],[gradle]) VALUES ('LTPT0001','SV001',8)
GO


SELECT Enrollment.*
FROM   Enrollment


--- Sau khi kết thúc khóa học thì giáo viên sẽ cập nhật lại điểm cho sinh viên
UPDATE [dbo].[Enrollment]  SET [gradle] = 10
 WHERE uid='SV001' and id_section='LTPT0001'
GO


SELECT Enrollment.*
FROM   Enrollment




select * from Course

INSERT INTO [dbo].[Prerequisite_Course]   ([course_id],[prerequisite]) VALUES ('LTPT','LTHSK')
GO
INSERT INTO [dbo].[Prerequisite_Course]   ([course_id],[prerequisite]) VALUES ('LTHSK','OOP')
GO
INSERT INTO [dbo].[Prerequisite_Course]   ([course_id],[prerequisite]) VALUES ('OOP','OOP')
GO
SELECT Person.*, Professor.*
FROM   Person INNER JOIN
             Professor ON Person.uid = Professor.uid

SELECT Course.*, Prerequisite_Course.*
FROM   Course INNER JOIN
             Prerequisite_Course ON Course.course_id = Prerequisite_Course.course_id

SELECT Section.*
FROM   Section