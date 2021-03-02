package com.stackroute.streampack;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.stackroute.functionpack.Employee;

public class StreamDemo {
	public static void main(String[] args) {
		List<Employee> allEmp = Arrays.asList(new Employee(1, "Rajesh", 25, "Hyderabad"),
				new Employee(2, "Veena", 35, "New Delhi"), new Employee(5, "Prakash", 30, "Bengaluru"),
				new Employee(4, "Mahesh", 45, "Bengaluru"), new Employee(3, "Teena", 40, "New Delhi"),
				new Employee(7, "Rajesh", 25, "New Delhi"), new Employee(1, "Rajesh", 25, "Hyderabad"),
				new Employee(1, "Rajesh", 25, "Hyderabad"), new Employee(4, "Mahesh", 45, "Bengaluru"));

		List<Employee> emp = allEmp.stream()
							.filter(e -> e.getAge() > 20)
							.distinct()
							.collect(Collectors.toList());
		emp.forEach(System.out::println);
	}

}
