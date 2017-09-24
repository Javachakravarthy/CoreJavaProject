package com.java.ashok;

public class AmstrongNumber {

	public static void main(String[] args) {
		/*
		 * 153 - the sum of cubes of each number is equals to Same number (1*1*1 + 5*5*5 + 3*3*3 =153) 
		 */
		int number =153;
		AmstrongNumber obj = new AmstrongNumber();
		if(obj.checkAmstrongNumberOrnot(number))
			System.out.println("It is amstrong number");
		else
			System.out.println("It is not amstrong number");
	}

	private boolean checkAmstrongNumberOrnot(int number) {
		int resultSum = 0;
		int originalNumber = number;
		while(number > 0){
			int singleDigit = number%10;
			resultSum += singleDigit*singleDigit*singleDigit;
			number = number/10;
		}
		if(originalNumber == resultSum)
			return true;
		else
			return false;
	}
}
