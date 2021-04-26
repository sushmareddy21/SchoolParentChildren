package com.cg.spc.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.Student;

public interface IAttendanceService {
	public Attendance addAttendance(Attendance attendance);
	public Attendance updateAttendance(Attendance attendance);
	public List<Attendance> listAttendanceByMonth(LocalDate month);
	public List<Attendance> listAttendanceByStudent(Student student);
	
	
}
