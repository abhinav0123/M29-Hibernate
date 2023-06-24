//driver class
//program to demonstrate on ManyToMany bidirectional
package org.tnsif.bidirectional;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class ManyToManyBidirectionalExecutor {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Product p=new Product();
		p.setProductid(231);
		p.setProductname("Sanitizer");
		p.setPrice(60.50f);
		
		Product p1=new Product();
		p1.setProductid(331);
		p1.setProductname("Camphor");
		p1.setPrice(40.30f);
		
		Order o=new Order();
		o.setOrderid(3311);
		o.setPurchasedate(new Date());
		
		Order o1=new Order();
		o1.setOrderid(4411);
		o1.setPurchasedate(new Date());
		
		
		o.addOrder(p1);
		o1.addOrder(p1);
		
		em.persist(o);
		em.persist(o1);

		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();
	}

}