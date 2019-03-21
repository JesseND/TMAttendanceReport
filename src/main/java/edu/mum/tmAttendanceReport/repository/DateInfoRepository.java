package edu.mum.tmAttendanceReport.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.tmAttendanceReport.entity.DateInfo;

@Repository
public interface DateInfoRepository extends CrudRepository<DateInfo, DateInfo>{

	@Query(value="SELECT d FROM DateInfo d WHERE d.date=:date")
	public DateInfo getDateInfoByDate(Date date);
}
