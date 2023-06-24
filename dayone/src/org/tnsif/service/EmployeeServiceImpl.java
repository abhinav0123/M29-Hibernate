package org.tnsif.service;
import org.tnsif.dao.EmployeeDao;
import org.tnsif.dao.EmployeeDaoImpl;
import org.tnsif.entities.Employee;
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao dao;
	
	public EmployeeServiceImpl() {
		dao=new EmployeeDaoImpl();
	}
	
	@Override
	public void createEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
	}
	
	@Override
	public Employee retrieveEmployee(int id) {
		Employee emp=dao.getEmployee(id);
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void removeEmployee(Employee emp) {
		dao.beginTransaction();
		dao.deleteEmployee(emp);
		dao.commitTransaction();
		
	}

}