package edu.mum.tmAttendanceReport.service;

import java.sql.Date;
import java.util.List;
import edu.mum.tmAttendanceReport.entity.TMAttendance;


public interface TMAttendanceService {

	public List<TMAttendance> findAttendanceByDates(Long student, Date startDate, Date endDate);
	public TMAttendance save(TMAttendance tma);
}
