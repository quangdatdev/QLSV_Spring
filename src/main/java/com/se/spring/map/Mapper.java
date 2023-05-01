package com.se.spring.map;

import com.se.spring.dto.EnrollmentDTO;
import com.se.spring.dto.SectionDTO;
import com.se.spring.dto.StudentDTO;
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
				secDTO.getRoom(), secDTO.getCourse(), secDTO.getProfessor(), secDTO.getSchedule());
	}

	public EnrollmentDTO toEnrollmentDTO(Enrollment enroll) {
		StudentDTO st = new StudentDTO(enroll.getStudent().getUid(), enroll.getStudent().getFristName(),
				enroll.getStudent().getLastName(), enroll.getStudent().getNumCI(), enroll.getStudent().getDateOfBirth(),
				enroll.getStudent().getPhone(), enroll.getStudent().getEmail(), enroll.getStudent().getAddress(),
				enroll.getStudent().getStatus(), enroll.getStudent().getMajor(), enroll.getStudent().getDateStart());
		st.setFaculty(enroll.getStudent().getFaculty());
		st.setNominalClass(enroll.getStudent().getNominalClass());

//		StudentDTO st1 = new StudentDTO(enroll.getStudent().getUid(), enroll.getStudent().getFristName(),
//				enroll.getStudent().getLastName(), enroll.getStudent().getMajor());
		SectionDTO sec = new SectionDTO(enroll.getSection().getId_section(), enroll.getSection().getDayStart(),
				enroll.getSection().getDayEnd(), enroll.getSection().getStatus(), enroll.getSection().getRoom(),
				enroll.getSection().getCourse(), enroll.getSection().getProfessor(), enroll.getSection().getSchedule());
		float gr1 = enroll.getGradle1();
		float gr2 = enroll.getGradle2();
		float gr3 = enroll.getGradle3();
		String date = enroll.getDateEnrollment();
		String status = enroll.getStatus();
		EnrollmentDTO en = new EnrollmentDTO(st, sec, gr1, gr2, gr3, date, status);
		return en;

	}

	public Enrollment toEnrollment(EnrollmentDTO edto) {
		StudentDTO s = edto.getStudent();
		Student st = new Student(s.getUid(), s.getFristName(), s.getLastName(), s.getNumCI(), s.getDateOfBirth(),
				s.getPhone(), s.getEmail(), s.getAddress(), s.getStatus(), s.getMajor(), s.getDateStart());

		SectionDTO se = edto.getSection();
		Section sec = new Section(se.getId_section(), se.getDayStart(), se.getDayEnd(), se.getStatus(), se.getRoom(),
				se.getCourse(), se.getProfessor(), se.getSchedule());

		Enrollment e = new Enrollment(st, sec, edto.getGradle1(), edto.getGradle2(), edto.getGradle3(),
				edto.getStatus());
		e.setStatus(edto.getStatus());

		return e;
	}
}