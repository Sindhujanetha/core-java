package com.tnsif.streamapi;
import java.util.stream.Stream;


public class Skipmethod {
	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,10,35).filter(num->num%2==0).skip(2).forEach(num->System.out.println(num+""));
		
	}

}
