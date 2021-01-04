package com.stackroute.demo;

class Temp {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method exected ...");
	}
}

public class GCDemo {
	public static void main(String[] args) {
		System.out.println("Begining of program...");

		for(int i=0; i<1000000; i++ ) {
			new Temp();
		}
//		System.gc();
		System.out.println("\nBye .........");
	}
}
