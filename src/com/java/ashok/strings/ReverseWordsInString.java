package com.java.ashok.strings;

public class ReverseWordsInString {

	public static void main(String[] args) {
		reverseStringWords("Ashoka Chakravarthy Ganipineni");
	}

	private static void reverseStringWords(String string) {
		String[] stirngArray = string.trim().split(" ");
		StringBuilder sb = new StringBuilder();
		for(String s:stirngArray){
			sb.append(reverse(s));
			sb.append(" ");
		}
		System.out.println(sb);
	}

	private static String reverse(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int i =s.length()-1;i>=0;i--)
			sb.append(s.charAt(i));
		return sb.toString();
	}
	

}
