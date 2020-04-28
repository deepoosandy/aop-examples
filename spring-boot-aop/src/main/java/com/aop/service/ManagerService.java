package com.aop.service;

import org.springframework.stereotype.Service;

import com.aop.model.Employee;
import com.aop.model.NoLogging;

@Service

public class ManagerService {

	@NoLogging
	public Employee createEmployee(String name, String empId) {
        System.out.println("In the manager Service :");
		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmpId(empId);
		return emp;
	}
	
	public Employee modifyEmployee(String name, String empId) {
        System.out.println("In add employee the manager Service :");
		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmpId(empId);
		return emp;
	}

	public void deleteEmployee(String empId) {
		
	}
}