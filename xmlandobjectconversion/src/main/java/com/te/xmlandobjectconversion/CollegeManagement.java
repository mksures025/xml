package com.te.xmlandobjectconversion;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class CollegeManagement {
	
	public static void main(String[] args) {
		
		Subjects subjects=new Subjects();
		subjects.setDataBase("SQL");
		subjects.setFrontEnd("HTML");
		subjects.setServerLanguage("JAVA");
		
		Student student=new Student();
		student.setSubject(subjects);
		
		Department department=new Department();
		department.setStudent(student);
		
		College  college=new College();
		college.setDepartment(department);
		
		try {
			
			JAXBContext  context = JAXBContext.newInstance(College.class);
			File file = new File("D:\\college.xml");
			Marshaller marshaller = context.createMarshaller();
			
			marshaller.marshal(college, file);
			
			System.out.println("file created");
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
