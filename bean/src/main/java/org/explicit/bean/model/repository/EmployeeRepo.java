package org.explicit.bean.model.repository;

import java.util.List;

import org.explicit.bean.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>  {
	public List<Employee> findByFirstName(String name);

	// JPQL (to make out code independent on database)
	@Query(value = "select emp from Employee emp where emp.firstName like :empName")
	List<Employee> filterSimilar(@Param("empName") String name);
	


	// we can write sql native to (@query)
	


}
