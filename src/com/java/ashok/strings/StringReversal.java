package com.java.ashok.strings;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "HEllo";
		System.out.println("The reverse of string "+input+" :"+reverseString(input));
		System.out.println("The reverse of string "+input+" :"+reverseStringWithReverseMethod(input));
		System.out.println("The reverse of string "+input+" :"+reverseStringWithRecursiveMethod(input));
		
	}
	private static String reverseStringWithReverseMethod(String input) {
		return  new StringBuffer(input).reverse().toString();
	}

	private static String reverseString(String input) {
		// TODO Auto-generated method stub
		StringBuilder reverse = new StringBuilder();
		for(int i =input.length()-1;i>=0;i--){
			reverse.append(input.charAt(i));
		}
		return reverse.toString();
	}
	private static String reverseStringWithRecursiveMethod(String input) {
		if(input == null || input.length()<=1)
			return input;
		//System.out.println(" "+input.substring(1)+input.charAt(0));
		return reverseStringWithRecursiveMethod(input.substring(1)) + input.charAt(0);
	}
	

}
