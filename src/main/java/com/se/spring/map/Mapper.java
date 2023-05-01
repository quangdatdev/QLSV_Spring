package com.se.spring.map;

import com.se.spring.dto.EnrollmentDTO;
import com.se.spring.dto.SectionDTO;
import com.se.spring.entity.Course;
import com.se.spring.entity.Department;
import com.se.spring.entity.Enrollment;
import com.se.spring.entity.Professor;
import com.se.spring.entity.Schedule;
import com.se.spring.entity.Section;
import com.se.spring.entity.Student;

public class Mapper {

	public SectionDTO toSectionDto(Section section) {

		String secId = section.getId_section();
		String daystart = section.getDayStart();
		String dayend = section.getDayEnd();
		String status = section.getStatus();
		Department room = section.getRoom();
		Course course = section.getCourse();
		Professor profes = section.getProfessor();
		Schedule schedule = section.getSchedule();

		return new SectionDTO(secId, daystart, dayend, status, room, course, profes, schedule);
	}

	public Section toSection(SectionDTO secDTO) {

		return new Section(secDTO.getId_section(), secDTO.getDayStart(), secDTO.getDayEnd(), secDTO.getStatus(),
				secDTO.getRoom(), secDTO.getCourse(), secDTO.getProfessor(),
				secDTO.getSchedule());
	}
	
	public EnrollmentDTO toEnrollmentDTO(Enrollment enroll) {
		 Student st = enroll.getStudent();
		  SectionDTO sec = toSectionDto(enroll.getSection());
		  float gr1 = enroll.getGradle1();
		  float gr2 = enroll.getGradle2();
		  float gr3 = enroll.getGradle3();
		  String date = enroll.getDateEnrollment();
		 String status = enroll.getStatus();
		 return new EnrollmentDTO(st, sec, gr1, gr2, gr3, date, status);
				
	}
	
}