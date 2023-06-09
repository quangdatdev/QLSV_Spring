USE [QLSV]
GO
/****** Object:  Table [dbo].[authorities]    Script Date: 5/10/2023 7:52:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[authorities](
	[username] [varchar](50) NULL,
	[authority] [varchar](50) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Course]    Script Date: 5/10/2023 7:52:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Course](
	[course_id] [nvarchar](255) NOT NULL,
	[course_name] [nvarchar](255) NULL,
	[credits] [int] NULL,
	[desrciption] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[course_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Department]    Script Date: 5/10/2023 7:52:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Department](
	[id_dep] [nvarchar](255) NOT NULL,
	[name_dep] [nvarchar](255) NULL,
	[noOfSeat] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_dep] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Enrollment]    Script Date: 5/10/2023 7:52:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Enrollment](
	[id_section] [nvarchar](100) NOT NULL,
	[uid] [nvarchar](255) NOT NULL,
	[dateEnrollment] [nvarchar](255) NULL,
	[gradle1] [float] NULL,
	[gradle2] [float] NULL,
	[gradle3] [float] NULL,
	[status] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_section] ASC,
	[uid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Faculty]    Script Date: 5/10/2023 7:52:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Faculty](
	[id_faculty] [nvarchar](255) NOT NULL,
	[name_faculty] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_faculty] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NominalClass]    Script Date: 5/10/2023 7:52:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NominalClass](
	[id_class] [nvarchar](255) NOT NULL,
	[name_class] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_class] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Person]    Script Date: 5/10/2023 7:52:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Person](
	[uid] [nvarchar](255) NOT NULL,
	[address] [nvarchar](255) NULL,
	[dateOfBirth] [nvarchar](50) NULL,
	[email] [nvarchar](255) NULL,
	[fristName] [nvarchar](255) NULL,
	[lastName] [nvarchar](255) NULL,
	[numCI] [nvarchar](50) NULL,
	[phone] [nvarchar](50) NULL,
	[status] [nvarchar](255) NULL,
	[password] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[uid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Prerequisite_Course]    Script Date: 5/10/2023 7:52:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Prerequisite_Course](
	[course_id] [nvarchar](255) NOT NULL,
	[prerequisite] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[course_id] ASC,
	[prerequisite] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Professor]    Script Date: 5/10/2023 7:52:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Professor](
	[degree] [nvarchar](255) NULL,
	[title] [nvarchar](255) NULL,
	[uid] [nvarchar](255) NOT NULL,
	[id_faculty] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[uid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Schedule]    Script Date: 5/10/2023 7:52:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Schedule](
	[id] [nvarchar](255) NOT NULL,
	[onDay] [varchar](255) NULL,
	[semester] [nvarchar](255) NULL,
	[shift] [varchar](255) NULL,
	[years] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Section]    Script Date: 5/10/2023 7:52:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Section](
	[section_id] [nvarchar](100) NOT NULL,
	[dayEnd] [nvarchar](255) NULL,
	[dayStart] [nvarchar](255) NULL,
	[status] [nvarchar](255) NULL,
	[course_id] [nvarchar](255) NULL,
	[uid_professor] [nvarchar](255) NULL,
	[room] [nvarchar](255) NULL,
	[schedule_id] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[section_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Student]    Script Date: 5/10/2023 7:52:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Student](
	[dateStart] [nvarchar](255) NULL,
	[major] [nvarchar](255) NULL,
	[uid] [nvarchar](255) NOT NULL,
	[id_faculty] [nvarchar](255) NULL,
	[id_class] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[uid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[authorities] ([username], [authority]) VALUES (N'john', N'ROLE_EMPLOYEE')
INSERT [dbo].[authorities] ([username], [authority]) VALUES (N'mary', N'ROLE_EMPLOYEE')
INSERT [dbo].[authorities] ([username], [authority]) VALUES (N'mary', N'ROLE_MANAGER')
INSERT [dbo].[authorities] ([username], [authority]) VALUES (N'susan', N'ROLE_EMPLOYEE')
INSERT [dbo].[authorities] ([username], [authority]) VALUES (N'susan', N'ROLE_ADMIN')
INSERT [dbo].[authorities] ([username], [authority]) VALUES (N'nguyen', N'ROLE_EMPLOYEE')
INSERT [dbo].[authorities] ([username], [authority]) VALUES (N'ADMIN', NULL)
INSERT [dbo].[authorities] ([username], [authority]) VALUES (N'nhatrang', N'ROLE_EMPLOYEE')
INSERT [dbo].[authorities] ([username], [authority]) VALUES (N'nguyen123', N'ROLE_EMPLOYEE')
INSERT [dbo].[Course] ([course_id], [course_name], [credits], [desrciption]) VALUES (N'LTHSK', N'Lap trinh huogn su kien', 23, N'Lập trình hướng sự kiện')
INSERT [dbo].[Course] ([course_id], [course_name], [credits], [desrciption]) VALUES (N'LTPT', N'Lap trinh phan tan', 23, N'lap trinh phan tan java')
INSERT [dbo].[Course] ([course_id], [course_name], [credits], [desrciption]) VALUES (N'OOP', N'Lap trinh huong doi tuong', 4, N'Lap trinh huong doit uong java')
INSERT [dbo].[Course] ([course_id], [course_name], [credits], [desrciption]) VALUES (N'TT2', N'Test addlist 2', 23, N'Lap trinh huong doi tuong')
INSERT [dbo].[Course] ([course_id], [course_name], [credits], [desrciption]) VALUES (N'TT3', N'Test update h4', 23, N'Lap trinh huong doi tuong')
INSERT [dbo].[Department] ([id_dep], [name_dep], [noOfSeat]) VALUES (N'A0401', N'Day A, lau 3, phong 11', 12000)
INSERT [dbo].[Department] ([id_dep], [name_dep], [noOfSeat]) VALUES (N'A301', N'Day A, lau 3, phong 01', 69)
INSERT [dbo].[Department] ([id_dep], [name_dep], [noOfSeat]) VALUES (N'A311', N'Day A, lau 3, phong 11', 120)
INSERT [dbo].[Department] ([id_dep], [name_dep], [noOfSeat]) VALUES (N'E605', N'Day E, lau 6, phong 05', 65)
INSERT [dbo].[Department] ([id_dep], [name_dep], [noOfSeat]) VALUES (N'X301', N'Day X, lau 3, phong 01', 120)
INSERT [dbo].[Enrollment] ([id_section], [uid], [dateEnrollment], [gradle1], [gradle2], [gradle3], [status]) VALUES (N'OOP01', N'SV009', N'2020-01-01', 7, 8, 9, N'Pass')
INSERT [dbo].[Enrollment] ([id_section], [uid], [dateEnrollment], [gradle1], [gradle2], [gradle3], [status]) VALUES (N'OOP02', N'SV009', N'Pass', 7, 8, 9, NULL)
INSERT [dbo].[Faculty] ([id_faculty], [name_faculty]) VALUES (N'CNTT', N'Cong nghe thong tin')
INSERT [dbo].[Faculty] ([id_faculty], [name_faculty]) VALUES (N'KTPM', N'Ky thuat phan mem')
INSERT [dbo].[NominalClass] ([id_class], [name_class]) VALUES (N'ATT15A', N'An toàn thông tin 15A test update')
INSERT [dbo].[NominalClass] ([id_class], [name_class]) VALUES (N'CNTT15A', N'Công nghệ thông tin 15A ')
INSERT [dbo].[NominalClass] ([id_class], [name_class]) VALUES (N'KTPM15A', N'Kỹ thuật phần mềm 15A')
INSERT [dbo].[Person] ([uid], [address], [dateOfBirth], [email], [fristName], [lastName], [numCI], [phone], [status], [password]) VALUES (N'GV001', N'quan3 ', N'2001-03-03', N'zxczxczxc@gmail.com', N'Thanh', N'Truong', N'1231231', N'012031023', N'Active', NULL)
INSERT [dbo].[Person] ([uid], [address], [dateOfBirth], [email], [fristName], [lastName], [numCI], [phone], [status], [password]) VALUES (N'GV002', N'quan3 ', N'2001-03-03', N'zxczxczxc@gmail.com', N'Hoang', N'Truong', N'1231231', N'012031023', N'Active', NULL)
INSERT [dbo].[Person] ([uid], [address], [dateOfBirth], [email], [fristName], [lastName], [numCI], [phone], [status], [password]) VALUES (N'GV003', N'quan3 ', N'2001-03-03', N'zxczxczxc@gmail.com', N'Quang', N'Dat', N'1231231', N'012031023', N'Active', NULL)
INSERT [dbo].[Person] ([uid], [address], [dateOfBirth], [email], [fristName], [lastName], [numCI], [phone], [status], [password]) VALUES (N'GV004', N'quan3 ', N'2001-03-03', N'zxczxczxc@gmail.com', N'Thanh', N'Truong', N'1231231', N'012031023', N'Active', NULL)
INSERT [dbo].[Person] ([uid], [address], [dateOfBirth], [email], [fristName], [lastName], [numCI], [phone], [status], [password]) VALUES (N'GV005', N'quan3 ', N'2001-03-03', N'zxczxczxc@gmail.com', N'Thanh 5', N'Thanh 5', N'1231231', N'012031023', N'Active', NULL)
INSERT [dbo].[Person] ([uid], [address], [dateOfBirth], [email], [fristName], [lastName], [numCI], [phone], [status], [password]) VALUES (N'GV007', N'quan3 ', N'2001-03-03', N'zxczxczxc@gmail.com', N'Thanh', N'Truong', N'1231231', N'012031023', N'Active', NULL)
INSERT [dbo].[Person] ([uid], [address], [dateOfBirth], [email], [fristName], [lastName], [numCI], [phone], [status], [password]) VALUES (N'SV005', N'quan3 ', N'2001-03-03', N'zxczxczxc@gmail.com', N'Thanh', N'Truong', N'1231231', N'012031023', N'Active', NULL)
INSERT [dbo].[Person] ([uid], [address], [dateOfBirth], [email], [fristName], [lastName], [numCI], [phone], [status], [password]) VALUES (N'SV007', N'quan 3', N'2001-03-03', N'zxczxczxc@gmail.com', N'Quang', N'Dat', N'123123132', N'0123123', N'Active', NULL)
INSERT [dbo].[Person] ([uid], [address], [dateOfBirth], [email], [fristName], [lastName], [numCI], [phone], [status], [password]) VALUES (N'SV009', N'quan 3', N'2001-03-03', N'zxczxczxc@gmail.com', N'Quang', N'Dat', N'123123132', N'0123123', N'Active', NULL)
INSERT [dbo].[Prerequisite_Course] ([course_id], [prerequisite]) VALUES (N'LTHSK', N'OOP')
INSERT [dbo].[Prerequisite_Course] ([course_id], [prerequisite]) VALUES (N'LTPT', N'LTHSK')
INSERT [dbo].[Prerequisite_Course] ([course_id], [prerequisite]) VALUES (N'OOP', N'OOP')
INSERT [dbo].[Prerequisite_Course] ([course_id], [prerequisite]) VALUES (N'TT2', N'OOP')
INSERT [dbo].[Prerequisite_Course] ([course_id], [prerequisite]) VALUES (N'TT3', N'OOP')
INSERT [dbo].[Professor] ([degree], [title], [uid], [id_faculty]) VALUES (N'Thac si', N'Giang vien bo mon', N'GV001', N'CNTT')
INSERT [dbo].[Professor] ([degree], [title], [uid], [id_faculty]) VALUES (N'Thac si', N'Giang vien bo mon', N'GV002', N'CNTT')
INSERT [dbo].[Professor] ([degree], [title], [uid], [id_faculty]) VALUES (N'Thac si', N'Giang vien bo mon', N'GV003', N'KTPM')
INSERT [dbo].[Professor] ([degree], [title], [uid], [id_faculty]) VALUES (N'Thac si', N'Giang vien bo mon', N'GV004', N'CNTT')
INSERT [dbo].[Professor] ([degree], [title], [uid], [id_faculty]) VALUES (N'Thac si', N'Giang vien bo mon', N'GV005', N'CNTT')
INSERT [dbo].[Professor] ([degree], [title], [uid], [id_faculty]) VALUES (N'Thac si', N'Giang vien bo mon', N'GV007', N'CNTT')
INSERT [dbo].[Schedule] ([id], [onDay], [semester], [shift], [years]) VALUES (N'2020HK1Mo', N'Mon', N'HK1', N'Morning', N'2020')
INSERT [dbo].[Section] ([section_id], [dayEnd], [dayStart], [status], [course_id], [uid_professor], [room], [schedule_id]) VALUES (N'OOP01', N'2020-01-01', N'2020-01-01', N'Dang ky moi', N'OOP', N'GV001', N'A311', N'2020HK1Mo')
INSERT [dbo].[Section] ([section_id], [dayEnd], [dayStart], [status], [course_id], [uid_professor], [room], [schedule_id]) VALUES (N'OOP02', N'2020-01-01', N'2020-01-01', N'Dang ky moi update test', N'OOP', N'GV001', N'A311', N'2020HK1Mo')
INSERT [dbo].[Section] ([section_id], [dayEnd], [dayStart], [status], [course_id], [uid_professor], [room], [schedule_id]) VALUES (N'OOP03', N'2020-01-01', N'2020-01-01', N'Dang ky moi', N'OOP', N'GV002', N'A311', N'2020HK1Mo')
INSERT [dbo].[Student] ([dateStart], [major], [uid], [id_faculty], [id_class]) VALUES (NULL, NULL, N'SV005', N'CNTT', N'CNTT15A')
INSERT [dbo].[Student] ([dateStart], [major], [uid], [id_faculty], [id_class]) VALUES (N'2019-03-03', N'Ky thuat phan mem', N'SV007', N'CNTT', N'CNTT15A')
INSERT [dbo].[Student] ([dateStart], [major], [uid], [id_faculty], [id_class]) VALUES (N'2019-03-03', N'Ky thuat phan mem', N'SV009', N'CNTT', N'CNTT15A')
ALTER TABLE [dbo].[Enrollment]  WITH CHECK ADD  CONSTRAINT [FKlc2upgmy8g078lqggpjy2wxkf] FOREIGN KEY([id_section])
REFERENCES [dbo].[Section] ([section_id])
GO
ALTER TABLE [dbo].[Enrollment] CHECK CONSTRAINT [FKlc2upgmy8g078lqggpjy2wxkf]
GO
ALTER TABLE [dbo].[Enrollment]  WITH CHECK ADD  CONSTRAINT [FKmuhbafaixse8e80cf6iubfle3] FOREIGN KEY([uid])
REFERENCES [dbo].[Student] ([uid])
GO
ALTER TABLE [dbo].[Enrollment] CHECK CONSTRAINT [FKmuhbafaixse8e80cf6iubfle3]
GO
ALTER TABLE [dbo].[Prerequisite_Course]  WITH CHECK ADD  CONSTRAINT [FK62xkbqtdau2u1gx9yem1mps0v] FOREIGN KEY([course_id])
REFERENCES [dbo].[Course] ([course_id])
GO
ALTER TABLE [dbo].[Prerequisite_Course] CHECK CONSTRAINT [FK62xkbqtdau2u1gx9yem1mps0v]
GO
ALTER TABLE [dbo].[Professor]  WITH CHECK ADD  CONSTRAINT [FKp76tq2ulix8khwuk2a4daspav] FOREIGN KEY([id_faculty])
REFERENCES [dbo].[Faculty] ([id_faculty])
GO
ALTER TABLE [dbo].[Professor] CHECK CONSTRAINT [FKp76tq2ulix8khwuk2a4daspav]
GO
ALTER TABLE [dbo].[Professor]  WITH CHECK ADD  CONSTRAINT [FKqahg8uvd5jwii5inpk3y0plvp] FOREIGN KEY([uid])
REFERENCES [dbo].[Person] ([uid])
GO
ALTER TABLE [dbo].[Professor] CHECK CONSTRAINT [FKqahg8uvd5jwii5inpk3y0plvp]
GO
ALTER TABLE [dbo].[Section]  WITH CHECK ADD  CONSTRAINT [FK80dxew8p7obpx0guvtvjmg5y9] FOREIGN KEY([uid_professor])
REFERENCES [dbo].[Professor] ([uid])
GO
ALTER TABLE [dbo].[Section] CHECK CONSTRAINT [FK80dxew8p7obpx0guvtvjmg5y9]
GO
ALTER TABLE [dbo].[Section]  WITH CHECK ADD  CONSTRAINT [FKo1pynipqa5v3ace3vy5ccbmy3] FOREIGN KEY([course_id])
REFERENCES [dbo].[Course] ([course_id])
GO
ALTER TABLE [dbo].[Section] CHECK CONSTRAINT [FKo1pynipqa5v3ace3vy5ccbmy3]
GO
ALTER TABLE [dbo].[Section]  WITH CHECK ADD  CONSTRAINT [FKrjmxdrbqf0396tmm6yd9vyvuv] FOREIGN KEY([room])
REFERENCES [dbo].[Department] ([id_dep])
GO
ALTER TABLE [dbo].[Section] CHECK CONSTRAINT [FKrjmxdrbqf0396tmm6yd9vyvuv]
GO
ALTER TABLE [dbo].[Section]  WITH CHECK ADD  CONSTRAINT [FKsgqq91gm84w9rwd0j8knsdva9] FOREIGN KEY([schedule_id])
REFERENCES [dbo].[Schedule] ([id])
GO
ALTER TABLE [dbo].[Section] CHECK CONSTRAINT [FKsgqq91gm84w9rwd0j8knsdva9]
GO
ALTER TABLE [dbo].[Student]  WITH CHECK ADD  CONSTRAINT [FKbfgjc8kr68m8l04fbux3bul5k] FOREIGN KEY([id_class])
REFERENCES [dbo].[NominalClass] ([id_class])
GO
ALTER TABLE [dbo].[Student] CHECK CONSTRAINT [FKbfgjc8kr68m8l04fbux3bul5k]
GO
ALTER TABLE [dbo].[Student]  WITH CHECK ADD  CONSTRAINT [FKiuycsjnioap3061btpyg12b72] FOREIGN KEY([uid])
REFERENCES [dbo].[Person] ([uid])
GO
ALTER TABLE [dbo].[Student] CHECK CONSTRAINT [FKiuycsjnioap3061btpyg12b72]
GO
ALTER TABLE [dbo].[Student]  WITH CHECK ADD  CONSTRAINT [FKqhih8c0k3pnqtdjy42v374ycx] FOREIGN KEY([id_faculty])
REFERENCES [dbo].[Faculty] ([id_faculty])
GO
ALTER TABLE [dbo].[Student] CHECK CONSTRAINT [FKqhih8c0k3pnqtdjy42v374ycx]
GO
