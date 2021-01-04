package com.stackroute.demo;

import java.util.Comparator;

//Java Bean
class Emp {
	private int empNo;
	private String empName;
}

public class ComperatorDemo {
	public static void main(String[] args) {
		Emp[] allEmps = new Emp[10];
		Comparator c = new Comparator<Emp>() {

			@Override
			public int compare(Emp e1, Emp e2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}
}
