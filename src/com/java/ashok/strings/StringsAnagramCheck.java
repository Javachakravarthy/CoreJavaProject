package com.java.ashok.strings;

import java.util.Arrays;

public class StringsAnagramCheck {
	/*	Two strings are anagrams if they are written using the same exact letters,
	 *  ignoring space, punctuation and capitalization. Each letter should have the same count in both strings.
	 *   For example, Army and Mary are anagram of each other.
		Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4tZBCnFL3
	*/
	public static void main(String[] args) {
		System.out.println(checkAnagram("Hello","olleH"));
		System.out.println(checkAnagramWithoutUsingArraysClassMethods("Hello","elloH"));
		
	}

	private static boolean checkAnagramWithoutUsingArraysClassMethods(String string1, String string2) {
		// TODO Auto-generated method stub
		char[] string1Array = string1.toCharArray();
		StringBuilder s2String = new StringBuilder(string2);
		for(char ch : string1Array){
			//String builder IndexOf(expects String argument, that is why
			int index = s2String.indexOf(""+ch);
			if(index !=-1){
				//Only String Builider has DeleteCharAt(index) method. This operation can't be done at String because that is immutable
				s2String.deleteCharAt(index);
			}else
				return false;
		}
		return s2String.length() ==0?true:false;
	}

	private static boolean checkAnagram(String string1, String string2) {
		// TODO Auto-generated method stub
		char[] string1Array = string1.toCharArray();
		char[] string2Array = string2.toCharArray();
		Arrays.sort(string1Array);
		Arrays.sort(string2Array);
		return Arrays.equals(string1Array, string2Array);
	}
	

}
