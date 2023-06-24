package org.tnsif.joinedtableinheritance;
import javax.persistence.Table;
import javax.persistence.Entity;
@Entity
@Table(name="Car")
public class Car extends Vehicle{
	private String brandName;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	
	
	
	

}
