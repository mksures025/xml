package com.te.xmlandobjectconversion;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class College {
	
	
	private  Department department;

	public College() {
		super();
	}

	public College(Department department) {
		super();
		this.department = department;
	}
	@XmlElement
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "College [department=" + department + "]";
	}
	
	

}
