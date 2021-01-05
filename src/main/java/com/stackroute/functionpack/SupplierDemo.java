package com.stackroute.functionpack;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<String> getString = () -> new String("Hello");
		
		String str = getString.get();
		System.out.println("String - " + str);
		
		Supplier<String> getAnotherString = String::new;
		String s = getAnotherString.get();
		
		Supplier<Date> todayDate = Date::new;
		System.out.println("Today date - " + todayDate.get());
	}
}
