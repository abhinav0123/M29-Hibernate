package org.tnsif.tableperclassinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.tnsif.singleinheritance.Employee;
import org.tnsif.singleinheritance.Manager;

public class TablePerClassInheritance {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//Create Citizen 1
		Citizen c1 = new Citizen();
		c1.setAadhar(358189209671L);
		c1.setCity("Mumbai");
		c1.setArea("Borivali");
		em.persist(c1);
		
		//Create Citizen 2
		Citizen c2 = new Citizen();
		c2.setAadhar(691371947832L);
		c2.setCity("Pune");
		c2.setArea("Krishna Nagar");
		em.persist(c2);
		
		//Create Person
		Person p =new Person();
		p.setAadhar(846191648301L);
		p.setCity("Nashik");
		p.setArea("Ganagapur Road");
		p.setName("Dishant Tare");
		p.setContactNo(9975481901L);
		em.persist(p);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();

	}

}


