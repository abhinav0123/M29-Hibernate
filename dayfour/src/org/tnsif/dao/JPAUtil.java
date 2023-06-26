package org.tnsif.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager em;
	
	//static block to initialize an object
	static
	{
		factory=Persistence.createEntityManagerFactory("JPA-PU");
		
	}	
	//JPA runtime LifeCycle
	public static EntityManager getEntityManager()
	{
		if(em==null || !em.isOpen())
		{
			em=factory.createEntityManager();
		}
		
		return em;
		
	}
	
	

}