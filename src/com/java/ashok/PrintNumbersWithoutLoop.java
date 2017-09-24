package com.java.ashok;

public class PrintNumbersWithoutLoop {
	/*
	 * Printing numbers with out loops is directly user SYSOUT number of times and print it.
	 * If not, use recursive function and print it.
	 */
	public static void main(String[] args) {
		printNumber(0);
	}

	private static void printNumber(int number) {
		if(number <=100){
			System.out.println(" "+number);
			printNumber(number+1);
		}
	}

}
