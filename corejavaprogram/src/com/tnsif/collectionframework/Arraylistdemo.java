package com.tnsif.collectionframework;
import java.util.ArrayList;

public class Arraylistdemo {
	public static void main(String[] args) {
			ArrayList<Integer>al=new ArrayList<Integer>();
			
			al.add(8);
			al.add(8);
			al.add(9);
			al.add(7);
			
			System.out.println("size"+al.size());
			System.out.println(al);
			
			System.out.println(al.contains(2));
			System.out.println(al.isEmpty());
			System.out.println(al.remove(0));
			System.out.println(al);
			
		}

}


