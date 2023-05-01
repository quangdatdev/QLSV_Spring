USE [QLSV]
GO
/****** Object:  Table [dbo].[Course]    Script Date: 5/1/2023 7:05:41 PM ******/
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
/****** Object:  Table [dbo].[Department]    Script Date: 5/1/2023 7:05:41 PM ******/
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
/****** Object:  Table [dbo].[Enrollment]    Script Date: 5/1/2023 7:05:41 PM ******/
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
/****** Object:  Table [dbo].[Faculty]    Script Date: 5/1/2023 7:05:41 PM ******/
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
/****** Object:  Table [dbo].[NominalClass]    Script Date: 5/1/2023 7:05:41 PM ******/
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
/****** Object:  Table [dbo].[Person]    Script Date: 5/1/2023 7:05:41 PM ******/
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
PRIMARY KEY CLUSTERED 
(
	[uid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Prerequisite_Course]    Script Date: 5/1/2023 7:05:41 PM ******/
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
/****** Object:  Table [dbo].[Professor]    Script Date: 5/1/2023 7:05:41 PM ******/
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
/****** Object:  Table [dbo].[Schedule]    Script Date: 5/1/2023 7:05:41 PM ******/
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
/****** Object:  Table [dbo].[Section]    Script Date: 5/1/2023 7:05:41 PM ******/
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
/****** Object:  Table [dbo].[Student]    Script Date: 5/1/2023 7:05:41 PM ******/
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
