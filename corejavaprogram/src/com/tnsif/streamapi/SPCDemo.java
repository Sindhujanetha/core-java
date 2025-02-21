package com.tnsif.streamapi;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SPCDemo {
	public static void main(String[] args) {
		Predicate<Integer>iseven=number->number%2==0;
		{
			int testnumber=11;
			if(iseven.test(testnumber)) {
				System.out.println(testnumber+"iseven");
			}
			else {
				System.out.println("is odd");
			}
		}
	}

}
