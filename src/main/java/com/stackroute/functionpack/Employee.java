package com.stackroute.functionpack;

public class Employee {
	private int empNo;
	private String empName;
	private int age;
	private String city;
	
	public Employee() {
		
	}

	public Employee(int empNo, String empName, int age, String city) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.city = city;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", age=" + age + ", city=" + city + "]";
	}
}
