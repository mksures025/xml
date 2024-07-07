package com.te.xmlandobjectconversion;

import javax.xml.bind.annotation.XmlElement;

public class Subjects {

	
	private String dataBase;
	private String serverLanguage;
	private String frontEnd;

	public Subjects() {
		super();
	}

	public Subjects(String dataBase, String serverLanguage, String frontEnd) {
		super();
		this.dataBase = dataBase;
		this.serverLanguage = serverLanguage;
		this.frontEnd = frontEnd;
	}

	@XmlElement
	public String getDataBase() {
		return dataBase;
	}

	public void setDataBase(String dataBase) {
		this.dataBase = dataBase;
	}

	@XmlElement
	public String getServerLanguage() {
		return serverLanguage;
	}

	public void setServerLanguage(String serverLanguage) {
		this.serverLanguage = serverLanguage;
	}
	@XmlElement
	public String getFrontEnd() {
		return frontEnd;
	}

	public void setFrontEnd(String frontEnd) {
		this.frontEnd = frontEnd;
	}
}
