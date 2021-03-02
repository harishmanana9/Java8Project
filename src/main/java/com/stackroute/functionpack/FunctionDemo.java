package com.stackroute.functionpack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class EmployeeUtils {
	public static List<String> extractEmpNames(List<Employee> allEmp, Function<Employee, String> function) {
		List<String> allNames = new ArrayList<String>();
		for(Employee emp : allEmp) {
			allNames.add(function.apply(emp));
		}
		return allNames;
	}	
}

public class FunctionDemo {
	public static void main(String[] args) {		
		Function<Employee, String> funEmployeeToStr = e -> e.getEmpName();
		Function<Employee, String> funEmployeeToCity = e -> e.getCity();

		List<Employee> allEmp = Arrays.asList(new Employee(1, "Rajesh", 25, "Hyderabad"),
				new Employee(2, "Veena", 35, "New Delhi"), new Employee(5, "Prakash", 30, "Bengaluru"),
				new Employee(4, "Mahesh", 45, "Bengaluru"), new Employee(3, "Teena", 40, "New Delhi"),
				new Employee(7, "Rajesh", 25, "New Delhi"));
		
		List<String> allEmpNames = EmployeeUtils.extractEmpNames(allEmp, 
				                      funEmployeeToStr.andThen((name) -> name.substring(0, 2)));
		
		allEmpNames.forEach(System.out::println);	
	}
}
