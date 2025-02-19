package com.tnsif.setdemo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Setoperation {
	public static void operation() {
		Set<Integer>nu=new HashSet<Integer>();
		
		nu.add(3);
		nu.add(5);
		nu.add(7);
		nu.add(8);
		
		System.out.println(nu);
		
		nu.addAll(Arrays.asList(new Integer[] {1,5,6}));
		System.out.println(nu);
		System.out.println(nu.size());
		
		Set<Integer> oddset=new HashSet<Integer>();
		oddset.addAll(Arrays.asList(new Integer[] {3,5,9}));
		System.out.println("odd set"+oddset);
		
		Set<Integer> intersection=new HashSet<>(nu);
		intersection.retainAll(oddset);
		
		System.out.println(intersection);
		
	}

}
