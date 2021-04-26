package com.cg.spc.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.Student;
@Repository
public interface IAttendanceRepository extends JpaRepository<Attendance,String>
{
//	public Attendance addAttendance(Attendance attendance);
//	public Attendance updateAttendance(Attendance attendance);
//	public List<Attendance> listAttendanceByMonth(LocalDate month);
//	public List<Attendance> listAttendanceByStudent(Student student);
	
}
