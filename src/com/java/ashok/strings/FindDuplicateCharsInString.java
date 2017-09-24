package com.java.ashok.strings;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicateCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "ashoka chakrccccccavarthy";
		findDuplicateChars(inputString);

	}
	public static void findDuplicateChars(String input){
		char[] inputArray = input.toCharArray();
		HashMap<Character, Integer> resultMap = new HashMap<>();
		for(Character ch : inputArray){
			if(resultMap.containsKey(ch)){
				resultMap.put(ch, resultMap.get(ch)+1);
			}
			else{
				resultMap.put(ch, 1);
			}
		}
		//Way to Iterate Map
		for(Entry<Character,Integer> entry : resultMap.entrySet()){
			if(entry.getValue() >1)
			System.out.println(" "+entry.getKey()+": "+entry.getValue());
		}
		//Way to interate Map in JAVA 8
		
		resultMap.forEach((key,value)->{
			if(value >1)
				System.out.println(" From Java8 :"+key+": "+value);
		});
	}

}
