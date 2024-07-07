package com.te.xmlandobjectconversion;

import javax.xml.bind.annotation.XmlElement;

public class Student {
	
	
	private Subjects subject;
	
	public Student() {
		super();
	}

	
	public Student(Subjects subject) {
		super();
		this.subject = subject;
	}

    @XmlElement
	public Subjects getSubject() {
		return subject;
	}


	public void setSubject(Subjects subject) {
		this.subject = subject;
	}

}
