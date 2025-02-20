package com.tnsif.lambdaexpression;
import java.util.ArrayList;

public class ArrayListdemo {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(2);
		a.add(5);
		a.add(7);
		a.add(8);
		
		a.forEach(list->System.out.println(list));
	}

}
