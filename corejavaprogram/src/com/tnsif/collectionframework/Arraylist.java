package com.tnsif.collectionframework;
import java.util.ArrayList;
import java.util.Iterator;
public class Arraylist {
	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("apple");
		al.add("mango");
		al.add("orange");
		al.add("orange");
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
