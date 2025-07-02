package com.tnsif.day4;

public class OopsConceptDemo {

	
	private int serialNumber;
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSerialName() {
		return serialNumber;
	}

	public void setSerialName(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return "OopsConceptDemo [serialNumber= " + serialNumber + ", name= " + name + ", age= " + age + "]";
	}
	
	
}
