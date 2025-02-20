package com.tnsif.lambdaexpression;

public class Parameterexample {
	public static void main(String[] args) {
		
		Square t=(a)->{return(a*a);};
		System.out.println("square of a number"+t.calculate(6));
	}

}
