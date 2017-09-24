package com.java.ashok;

public class FibinocciSeries {
	
	public static void main(String... args){
		int fibonacciNumbers = 15;
		int[] fibinocci = new int[15];
		fibinocci[0] = 0;
		fibinocci[1] = 1;
		System.out.println(fibinocci[0]+" "+fibinocci[1] );
		for(int i =2; i<fibonacciNumbers; i++){
			fibinocci[i] = fibinocci[i-1] + fibinocci[i-2];
			System.out.println(fibinocci[i-1]+" "+fibinocci[i] );
		}
	}
}
