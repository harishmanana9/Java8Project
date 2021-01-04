package com.stackroute.functionpack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {
		int data = 30;
		Predicate<Integer> predicate = i -> i > data;
		Predicate<Integer> predicate2 = i -> i > 30;
		Predicate<String> predicateCity = city -> city.equals("Hyderabad");
		
		List<Employee> allEmp = Arrays.asList(new Employee(1, "Rajesh", 25, "Hyderabad"),
				new Employee(2, "Veena", 35, "New Delhi"), new Employee(5, "Prakash", 30, "Bengaluru"),
				new Employee(4, "Mahesh", 45, "Bengaluru"), new Employee(3, "Teena", 40, "New Delhi"),
				new Employee(7, "Rajesh", 25, "New Delhi"));
		
		List<Employee> filteredEmp = getEmployees(allEmp, predicate2);		
		filteredEmp.forEach(System.out::println);
		
	}

	public static List<Employee> getEmployees(List<Employee> allEmp, Predicate<Integer> predicate) {
		List<Employee> listage = new ArrayList<Employee>();
		for (Employee emp : allEmp) {
			if (predicate.test(emp.getAge())) {
				listage.add(emp);
			}
		}
		return listage;
	}

	public static List<Employee> getEmployeesByCity(List<Employee> allEmp, Predicate<String> predicate) {
		List<Employee> listage = new ArrayList<Employee>();
		for (Employee emp : allEmp) {
			if (predicate.test(emp.getCity())) {
				listage.add(emp);
			}
		}
		return listage;
	}

}
