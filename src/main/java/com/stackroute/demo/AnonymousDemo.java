package com.stackroute.demo;


interface Calculator {
	private int no;
	public int add(int a, int b);
	public default int subtract(int a, int b) {
		return a-b;
	}
	public default int multiply(int a, int b) {
		return a*b;
	}
	public static int divide (int a, int b) {
		return a/b;
	}
}

public class AnonymousDemo {
	public static void main(String[] args) {
		//Anonymous class
		Calculator c = new Calculator() {
			public int add(int x, int b) {
				return x+b;
			}
		};
		System.out.println("Result = " + c.add(10,20));
		
		//Lambda Expression
		Calculator c2 = (int x, int b) -> {return x+b; };
		Calculator c3 = (x, b) -> {return x+b; };
		Calculator c4 = (x, b) -> x+b;
		
		System.out.println(c2.add(10, 20));
		System.out.println(c3.add(10, 20));
		System.out.println(c4.add(10, 20));
		
		System.out.println("SUbtraction " + c2.subtract(10, 2));
		System.out.println("Divide = " + Calculator.divide(3, 1));
	}
}
