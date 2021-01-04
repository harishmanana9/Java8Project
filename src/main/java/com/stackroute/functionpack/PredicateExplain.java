package com.stackroute.functionpack;

import java.util.function.Predicate;

public class PredicateExplain {
	public static void main(String[] args) {
		Predicate<Integer> t = age -> age > 3;
		
		Integer[] no = {1,2,3,4,5,6,7,8,9,10};
		
		for(Integer num : no) {
			if(t.test(num)) {
				System.out.println("No - " + num);
			}
		}
	}
}
