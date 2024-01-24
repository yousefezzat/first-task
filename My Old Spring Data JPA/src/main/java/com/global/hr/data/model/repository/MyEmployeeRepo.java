package com.global.hr.data.model.repository;

import com.global.hr.data.model.entity.MyEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MyEmployeeRepo extends JpaRepository<MyEmployee, Integer>  {
	public List<MyEmployee> findByFirstName(String name);

	@Query(value = "select emp from MyEmployee emp where emp.firstName like :empName")
	List<MyEmployee> filterSimilar(@Param("empName") String name);






}
