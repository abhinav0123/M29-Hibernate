package org.tnsif.dao;
import javax.persistence.EntityManager;
import org.tnsif.entities.Employee;
public class EmployeeDaoImpl implements EmployeeDao {
	
	/*all the CRUD methods are inside an Entity Manager
	 * Interface*/
	private EntityManager em;

	//default constructor
	public EmployeeDaoImpl() {
		em=JPAUtil.getEntityManager();
	}

	//create or add
	@Override
	public void addEmployee(Employee emp) {
		em.persist(emp);
		
	}
	//Retrieve
	@Override
	public Employee getEmployee(int id) {
		Employee emp=em.find(Employee.class,id);
		return emp;
	}
	//update
	@Override
	public void updateEmployee(Employee emp) {
		em.merge(emp);
	}

	//delete
	@Override
	public void deleteEmployee(Employee emp) {
		em.remove(emp);
		
	}
	//begin the transaction
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}
	//close the transaction
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();	
	}
	
	

}