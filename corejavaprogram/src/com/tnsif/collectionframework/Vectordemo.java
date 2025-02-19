package com.tnsif.collectionframework;
import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		Vector<String>v=new Vector<String>();
		
		int size=v.size();
		System.out.println(size);
		v.add("blue");
		v.add("white");
		v.add("orange");
		v.add("red");
		
		int cap=v.capacity();
		System.out.println(cap);
		
		v.add(null);
		v.add("blue");
		v.add("white");
		v.add("orange");
		v.add("red");
		v.add("blue");
		v.add("white");
		v.add("orange");
		v.add("red");
		
		int cap1=v.capacity();
		System.out.println(cap1);
		
	}

}
