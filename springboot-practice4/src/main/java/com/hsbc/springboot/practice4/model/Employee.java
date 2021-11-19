package com.hsbc.springboot.practice4.model;

public class Employee {
	private int eId;
	private String eName;
	private int eAge;
	private String eQualification;
	private int eSarlary;

	public Employee() {

	}

	public Employee(int eId, String eName, int eAge, String eQualification, int esalary) {
		this.eId = eId;
		this.eName = eName;
		this.eAge = eAge;
		this.eQualification = eQualification;
		this.eSarlary = esalary;

	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	public String geteQualification() {
		return eQualification;
	}

	public void seteQualification(String eQualification) {
		this.eQualification = eQualification;
	}

	public int geteSarlary() {
		return eSarlary;
	}

	public void seteSarlary(int eSarlary) {
		this.eSarlary = eSarlary;
	}

}
