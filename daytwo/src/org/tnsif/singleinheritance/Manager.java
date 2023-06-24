package org.tnsif.singleinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//Child Class
@Entity
@DiscriminatorValue("MNG")
public class Manager extends Employee {
	//private data members
	private String deptName;

	
	//getters and setters
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	
}
