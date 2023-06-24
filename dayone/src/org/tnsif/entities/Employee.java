package org.tnsif.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*Below annotation ensures that the given class 
* is an entity in the database table*/
@Entity
@Table(name="Employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String name;
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}