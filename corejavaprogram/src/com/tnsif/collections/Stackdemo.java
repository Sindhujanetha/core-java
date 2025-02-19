
package com.tnsif.collections;
import java.util.Stack;

public class Stackdemo {
	
	public static void main(String[] args) {
			
	Stack<Integer>ob=new Stack<Integer>();
	
	ob.push(1);
	ob.push(7);
	ob.push(5);
	ob.push(3);
	
	System.out.println("stack elements"+ob);
	
	System.out.println(ob.peek());
	if(ob.isEmpty())
	{
		System.out.println("stack is empty");
	}
	else {
		System.out.println("not empty");
	}
	
	System.out.println(ob.search(7));
	System.out.println(ob.pop());
	
	
	}

}
