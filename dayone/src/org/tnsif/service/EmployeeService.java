package org.tnsif.service;

import org.tnsif.entities.Employee;

public interface EmployeeService {
	//User defined methods
	void createEmployee(Employee emp); //create
	Employee retrieveEmployee(int id); //retrieve
	void updateEmployee(Employee emp); //update
	void removeEmployee(Employee emp); //delete
}

