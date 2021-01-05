package com.stackroute.functionpack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Employee> consumer = emp -> System.out.println("Employee Data - " + emp);

		Consumer<Employee> ageCheck = emp -> {
            if (emp.getAge() > 40) {
                System.out.println("Sr. Resource");
            } else {
                System.out.println("Jr. Resource");
            }
        };


		
		List<Employee> allEmp = Arrays.asList(new Employee(1, "Rajesh", 25, "Hyderabad"),
				new Employee(2, "Veena", 35, "New Delhi"), new Employee(5, "Prakash", 30, "Bengaluru"),
				new Employee(4, "Mahesh", 45, "Bengaluru"), new Employee(3, "Teena", 40, "New Delhi"),
				new Employee(7, "Rajesh", 25, "New Delhi"));
		
		printEmployees(allEmp, ageCheck);
		allEmp.forEach(System.out::println);
	}

	public static void printEmployees(List<Employee> allEmp, Consumer consumer) {
		for (Employee emp : allEmp) {
			consumer.accept(emp);
		}
	}
}
