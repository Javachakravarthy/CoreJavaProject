package com.java.ashok.strings;

public class CountVowelAndConsonentsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countVowelsAndConsonents("Ashoka Chakravarthy Ganipineni");
		countDigits("12345");
		countDigitsWithoutBuiltInMethod("Ashoka");

	}

	private static void countDigitsWithoutBuiltInMethod(String string) {
		// TODO Auto-generated method stub
		int count =0;
		for(char ch: string.toCharArray()){
			if(ch >= '0' && ch <='9'){
				count ++;
			}
		}
		System.out.println("Number of digits in String are"+count);
		
	}

	private static void countDigits(String string) {
		int count = 0;
		for(char ch : string.toCharArray()){
			if(Character.isDigit(ch))
				count++;
		}
		if(string.length() == count)
			System.out.println("String cotains all digits");
		else
			System.out.println("String contains not only digits");
	}

	private static void countVowelsAndConsonents(String string1) {
		// TODO Auto-generated method stub
		char[] charArray = string1.toCharArray();
		int vowelsCount = 0;
		for(char ch : charArray){
			switch(ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelsCount++;
			}
		}
		System.out.println("consonets in string is "+(string1.length()-vowelsCount) +"and vowels count :"+vowelsCount);
		
	}

}
