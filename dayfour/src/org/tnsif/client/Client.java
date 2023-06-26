package org.tnsif.client;

import org.tnsif.service.BookService;
import org.tnsif.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service = new BookServiceImpl();
	    System.out.println("Book with specific ID: ");
	    System.out.println(service.getBookByID(0));
	    
	    System.out.println("Book with specific Author: ");
	    System.out.println(service.getAuthorBooks("Dennis Ritchie"));
	    
	    System.out.println("Book with specific title: ");
	    System.out.println(service.getAuthorBooks("AI"));
	    
	    System.out.println("Book count: ");
	    System.out.println(service.getBookCount());
	    
	    System.out.println("Book with specific price range: ");
	    System.out.println(service.getBookByPrice(100,1000 ));



	    
	}

}
