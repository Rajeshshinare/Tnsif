package com.tnsif.singleinheritance;

// 	Child Class
public class Student extends Citizen{

	
//		Data Member
	private int rollNo;
	private String collegeName;
	
//	parameterized constructor
	public Student() {
		super();
	}

//	non parameterized constructor
	public Student(String name, String adharNo, String address, long phone, int rollNo, String collegeName) {
		super(name, adharNo, address, phone);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	
	
// 		Getter Setter method
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	
//	toString Method
	@Override
	public String toString() {
		return "Student [rollNo= " + rollNo + ", collegeName= " + collegeName + ", getName()= " + getName()
				+ ", getAdharNo()= " + getAdharNo() + ", getAddress()= " + getAddress() + ", getPhone()= " + getPhone()
				+ "]";
	}
	
	
	
	
}
