package org.explicit.bean.service;

import java.util.List;
import java.util.Optional;

import org.explicit.bean.model.entity.Employee;
import org.explicit.bean.model.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


public class EmployeeService {

@Autowired
EmployeeRepo employeeRepo;
	private final String version;

	public EmployeeService(EmployeeRepo employeeRepo, String version) {
		this.employeeRepo = employeeRepo;
		this.version = version;
	}

	public long empCount() {
		return employeeRepo.count();
	}

	public Employee getEmp(Integer id) {
		Optional<Employee> emp = employeeRepo.findById(id);
		return emp.orElse(null);
	}

	public List<Employee> findAll() {
		return employeeRepo.findAll();
	}



	public List<Employee> filter(String name) {
		return employeeRepo.findByFirstName(name);
	}

	public List<Employee> filterSimilar(String name) {
		return employeeRepo.filterSimilar(name);
	}

	public ResponseEntity<Employee> insert(Employee emp) {
		return ResponseEntity.ok(employeeRepo.save(emp));
	}


	public Employee update(Employee emp) {
		return employeeRepo.save(emp);
	}

	public void delete(Integer id) {
		employeeRepo.deleteById(id);
	}

	public String getVersion() {
		return version;
	}
}
