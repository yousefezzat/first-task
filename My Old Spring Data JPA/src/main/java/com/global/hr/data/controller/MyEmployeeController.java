package com.global.hr.data.controller;

import org.explicit.bean.model.entity.Employee;
import org.explicit.bean.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mainController")
public class MyEmployeeController {

    @Autowired
    @Qualifier("employeeService")

    private EmployeeService myEmployeeServiceV1;

    @GetMapping("/employeeCount")
    public long getEmployeeCount() {
        return myEmployeeServiceV1.empCount();
    }

    @GetMapping("/getEmployee/{id}")
    Employee getEmployee(@PathVariable Integer id) {
        return myEmployeeServiceV1.getEmp(id);
    }

    @GetMapping("/findAllEmployees")
    public List<Employee> getAllEmployees() {
        return myEmployeeServiceV1.findAll();
    }

    @GetMapping("/filterEmployees")
    public List<Employee> filterEmployees(@RequestParam String name) {
        return myEmployeeServiceV1.filter(name);
    }

    @GetMapping("/filterSimilarEmployees")
    public List<Employee> filterSimilarEmployees(@RequestParam String name) {
        return myEmployeeServiceV1.filterSimilar(name);
    }

    @PostMapping("/insertEmployee")
    public ResponseEntity<Employee> insertEmployee(@RequestBody Employee employee) {
        return myEmployeeServiceV1.insert(employee);
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee myEmployee) {
        return myEmployeeServiceV1.update(myEmployee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        myEmployeeServiceV1.delete(id);
    }
    @GetMapping("/getVersion")
    public String getVersion() {
      return  myEmployeeServiceV1.getVersion();
    }
}
