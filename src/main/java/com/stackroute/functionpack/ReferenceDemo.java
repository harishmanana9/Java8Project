package com.stackroute.functionpack;

@FunctionalInterface
interface EmployeeFactory {
	public abstract Employee getEmployee(int empNo, String name, int age, String city);
}

public class ReferenceDemo {
	public static void main(String[] args) {
		EmployeeFactory empFactory = Employee::new;
		
		Employee e1 = empFactory.getEmployee(1,  "Rajesh", 25, "Hyderabad");
		Employee e2 = empFactory.getEmployee(2,  "Prakash", 25, "Bengaluru");
		
		System.out.println("e1 - " + e1);
		System.out.println("e2 - " + e2);
	}
}
