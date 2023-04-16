use master
go

Create database [QLSV]
go


USE [QLSV]
GO
/****** Object:  Table [dbo].[Course]    Script Date: 4/16/2023 10:06:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Course](
	[course_id] [varchar](255) NOT NULL,
	[course_name] [varchar](255) NULL,
	[credits] [int] NULL,
	[desrciption] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[course_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Department]    Script Date: 4/16/2023 10:06:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Department](
	[id_dep] [varchar](255) NOT NULL,
	[name_dep] [varchar](255) NULL,
	[noOfSeat] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_dep] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Enrollment]    Script Date: 4/16/2023 10:06:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Enrollment](
	[id_section] [varchar](255) NOT NULL,
	[uid] [varchar](255) NOT NULL,
	[gradle] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_section] ASC,
	[uid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Faculty]    Script Date: 4/16/2023 10:06:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Faculty](
	[id_faculty] [varchar](255) NOT NULL,
	[name_faculty] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_faculty] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[NominalClass]    Script Date: 4/16/2023 10:06:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[NominalClass](
	[id_class] [varchar](255) NOT NULL,
	[name_class] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_class] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Person]    Script Date: 4/16/2023 10:06:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Person](
	[uid] [varchar](255) NOT NULL,
	[address] [varchar](255) NULL,
	[dateOfBirth] [varchar](255) NULL,
	[email] [varchar](255) NULL,
	[fristName] [varchar](255) NULL,
	[lastName] [varchar](255) NULL,
	[numCI] [varchar](255) NULL,
	[phone] [varchar](255) NULL,
	[status] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[uid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Prerequisite_Course]    Script Date: 4/16/2023 10:06:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Prerequisite_Course](
	[course_id] [varchar](255) NOT NULL,
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
/****** Object:  Table [dbo].[Professor]    Script Date: 4/16/2023 10:06:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Professor](
	[degree] [varchar](255) NULL,
	[title] [varchar](255) NULL,
	[uid] [varchar](255) NOT NULL,
	[id_faculty] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[uid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Section]    Script Date: 4/16/2023 10:06:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Section](
	[section_id] [varchar](255) NOT NULL,
	[dayEnd] [varchar](255) NULL,
	[dayStart] [varchar](255) NULL,
	[status] [varchar](255) NULL,
	[course_id] [varchar](255) NULL,
	[uid_professor] [varchar](255) NULL,
	[room] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[section_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[SinhVien]    Script Date: 4/16/2023 10:06:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SinhVien](
	[masv] [int] NOT NULL,
	[email] [varchar](255) NULL,
	[tensv] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[masv] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Student]    Script Date: 4/16/2023 10:06:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Student](
	[dateStart] [varchar](255) NULL,
	[major] [varchar](255) NULL,
	[uid] [varchar](255) NOT NULL,
	[id_faculty] [varchar](255) NULL,
	[id_class] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[uid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Course] ([course_id], [course_name], [credits], [desrciption]) VALUES (N'LTHSK', N'Lap trinh huong su kien', 4, N'Lap trinh huong su kien java')
INSERT [dbo].[Course] ([course_id], [course_name], [credits], [desrciption]) VALUES (N'LTPT', N'Lap trinh phan tan', 4, N'Lap trinh phan tan java')
INSERT [dbo].[Course] ([course_id], [course_name], [credits], [desrciption]) VALUES (N'OOP', N'Lap trinh huong doi tuong', 3, N'Lap trinh huong doi tu java')
INSERT [dbo].[Department] ([id_dep], [name_dep], [noOfSeat]) VALUES (N'X01.01', N'Nha X Phong 01', 60)
INSERT [dbo].[Enrollment] ([id_section], [uid], [gradle]) VALUES (N'LTPT0001', N'SV001', 10)
INSERT [dbo].[Faculty] ([id_faculty], [name_faculty]) VALUES (N'CNTT', N'Cong nghe thong tin')
INSERT [dbo].[NominalClass] ([id_class], [name_class]) VALUES (N'CNTT15A', N'Cong nghe thong tin 15A')
INSERT [dbo].[Person] ([uid], [address], [dateOfBirth], [email], [fristName], [lastName], [numCI], [phone], [status]) VALUES (N'GV001', N'quan3', N'1978', N'zxczc@gmail.com', N'Nguyen Hoang', N'Khanh', N'123123123', N'090902130', N'Active')
INSERT [dbo].[Person] ([uid], [address], [dateOfBirth], [email], [fristName], [lastName], [numCI], [phone], [status]) VALUES (N'SV001', N'quan3', N'1978', N'zxczc@gmail.com', N'Le Quang', N'Dat', N'123123123', N'090902130', N'Active')
INSERT [dbo].[Prerequisite_Course] ([course_id], [prerequisite]) VALUES (N'LTHSK', N'OOP')
INSERT [dbo].[Prerequisite_Course] ([course_id], [prerequisite]) VALUES (N'LTPT', N'LTHSK')
INSERT [dbo].[Prerequisite_Course] ([course_id], [prerequisite]) VALUES (N'OOP', N'OOP')
INSERT [dbo].[Professor] ([degree], [title], [uid], [id_faculty]) VALUES (N'Thac si', N'Giang vien bo mon', N'GV001', N'CNTT')
INSERT [dbo].[Section] ([section_id], [dayEnd], [dayStart], [status], [course_id], [uid_professor], [room]) VALUES (N'LTPT0001', N'2023-05-18', N'2023-04-16', N'Cho sinh vien dang ky', N'LTPT', N'GV001', N'X01.01')
INSERT [dbo].[Student] ([dateStart], [major], [uid], [id_faculty], [id_class]) VALUES (N'2019-05-16', N'Ky thuat phan mem', N'SV001', N'CNTT', N'CNTT15A')
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
