package com.te.xmlandobjectconversion;

import javax.xml.bind.annotation.XmlElement;

public class Department {
	

	private  Student student;

	public Department() {
		super();
	}

	public Department(Student student) {
		super();
		this.student = student;
	}

	@XmlElement
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
