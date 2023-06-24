package org.tnsif.singleinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceExecutor {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//Create Employee 1
		Employee emp = new Employee();
		emp.setEmpName("Dishant Tare");
		emp.setSalary(41345.4f);
		em.persist(emp);
		
		//Create Employee 2
		Employee emp1 = new Employee();
		emp1.setEmpName("Abhinav Rawat");
		emp1.setSalary(60368.5f);
		em.persist(emp1);
		
		//Create Manager
		Manager mng = new Manager();
		mng.setEmpName("Shiwani K.");
		mng.setSalary(903124.5f);
		mng.setDeptName("Human Resource");
		em.persist(mng);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();

	}

}
