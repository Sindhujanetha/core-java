package com.tnsif.setdemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Setoperations {
	
public static void operations() {
	

	Set<Integer>num=new HashSet<Integer>();
	num.add(12);
	num.add(13);
	
	num.addAll(Arrays.asList(new Integer[]{1,2,3,4}));
	System.out.println(num);
	
	Set<Integer>Oddset=new HashSet<Integer>();
	Oddset.addAll(Arrays.asList(new Integer[] {5,6,7,2}));
	
	Set<Integer>intersection=new HashSet<Integer>(num);
	intersection.retainAll(Oddset);
	System.out.println("intersection"+intersection);
	
	Set<Integer>union=new HashSet<Integer>(num);
	union.addAll(Oddset);
	System.out.println("union"+union);
	
	}
}

