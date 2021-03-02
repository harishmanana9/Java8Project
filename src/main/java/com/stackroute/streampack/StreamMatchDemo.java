package com.stackroute.streampack;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.stackroute.functionpack.Employee;

public class StreamMatchDemo {
	public static void main(String[] args) {
		List<Employee> allEmp = Arrays.asList(new Employee(1, "Rajesh", 25, "Hyderabad"),
				new Employee(2, "Veena", 35, "New Delhi"), new Employee(5, "Prakash", 30, "Bengaluru"),
				new Employee(4, "Mahesh", 55, "Bengaluru"), new Employee(3, "Teena", 40, "New Delhi"),
				new Employee(7, "Rajesh", 25, "New Delhi"), new Employee(1, "Rajesh", 25, "Hyderabad"),
				new Employee(1, "Rajesh", 25, "Hyderabad"), new Employee(4, "Mahesh", 45, "Bengaluru"));
		
//		boolean allMorethan21 = allEmp.stream()
//								.allMatch(e -> e.getAge() > 21);
//		
//		Predicate<Employee> ee = e->e.getCity().equals("New Delhi");
//		boolean allNewDelhiMoreThan30 = allEmp.stream()
//								.allMatch(ee.and(e -> e.getAge() > 30));
		
		List<Employee> empData = allEmp.stream()
								.filter(e -> e.getAge() > 10)
								.limit(1)
								.collect(Collectors.toList());
		
		if(empData.size() != 0) {	
			System.out.println("Employee more than 50 - " + empData);
		} else {
			System.out.println("No employee more than 50");
		}
		
		Optional<Employee> empSr = allEmp.stream()
								.filter(e -> e.getAge() > 10)
								.findAny();
		if(empSr.isPresent()) {
			System.out.println("Employee more than 50 - " + empSr.get());
		} else {
			System.out.println("No employee more than 50");
		}
		
	}
}


interface a {	
	default int add() { return 0; }
	default int add2() { return 0; }
	default int add3() { return 0; }
}

interface b {
	default int add() { return 100; }
	default int abcd() { return 0; }
}

interface c extends a, b {
	default int add() {
		return a.super.add();
	}
}
class X {
	public int add() { return 1000; }	
}
class XYZ extends X implements a, b {

}














