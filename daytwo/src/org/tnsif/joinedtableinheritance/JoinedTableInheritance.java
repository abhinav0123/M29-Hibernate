package org.tnsif.joinedtableinheritance;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JoinedTableInheritance {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//Create Vehicle 1
		Vehicle v = new Vehicle();
		v.setVehicleNo(7263);
		v.setSpeed(45);
		v.setPrice(4385628.5f);
		v.setType("Four-Wheeler");
		em.persist(v);
		
		//Create Vehicle 2
		Vehicle v1 = new Vehicle();
		v1.setVehicleNo(6234);
		v1.setSpeed(60);
		v1.setPrice(985628.5f);
		v1.setType("Four-Wheeler");
		em.persist(v1);
		
		//Create Car
		Car c = new Car();
		c.setBrandName("BMW");
		c.setVehicleNo(9046);
		c.setSpeed(100);
		c.setPrice(3242672.8f);
		c.setType("Four-Wheeler");
		em.persist(c);
		
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();
		
	}

}