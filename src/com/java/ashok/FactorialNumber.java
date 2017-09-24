package com.java.ashok;

public class FactorialNumber {

	public static void main(String[] args) {
		System.out.println("Factorial of number 5 is :"+Factorial(5));
		System.out.println("Factorial of number 5 is :"+reCursiveFactorial(5));
	}

	private static int reCursiveFactorial(int factInput) {
		if(factInput == 0){
			return 1;
		}
		return factInput*reCursiveFactorial(factInput-1);
	}

	private static int Factorial(int factInput) {
		int factOutput = 1;
		while(factInput !=0 ){
			factOutput = factOutput*factInput;
			factInput--;
		}
		return factOutput;
	}

}
