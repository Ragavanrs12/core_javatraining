package com.tw.employee;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeController {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
	EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
	
	//@GetMapping("/student")
	@RequestMapping(value = "/employee", method = RequestMethod.GET, produces = "application/json")
	public List<Employee> getList(){
		return employeeDao.getEmployeeList();
	}
	
	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeDao.addEmployee(employee);
	}
	
	@GetMapping("/employee/{id}")
	Employee findEmployee(@PathVariable Integer id) throws Exception{
		Employee employee = employeeDao.findEmployeeByID(id);
		if(employee == null) {
			throw new Exception("No employee Found with ID number: "+id);
		}
		return employee;
	}
	
	@PutMapping("/employee/{id}")
	Employee updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		return employeeDao.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public void delete(@PathVariable int id) {
		employeeDao.deleteEmployee(id);
	}
	
	
	

}
