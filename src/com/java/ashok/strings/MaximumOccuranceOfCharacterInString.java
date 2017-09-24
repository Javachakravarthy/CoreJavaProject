package com.java.ashok.strings;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaximumOccuranceOfCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxAccuredCharacter("Asssdhasoksdasddfklsdjfalks");

	}
	private static void maxAccuredCharacter(String inputString) {
		// TODO Auto-generated method stub
		int maximum = 0;
		char maximumOccuredCharacter =0;
		char[] inputArray = inputString.toCharArray();
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
		for(Entry<Character,Integer> entry:resultMap.entrySet()){
			if(maximum < entry.getValue()){
				maximum = entry.getValue();
				maximumOccuredCharacter = entry.getKey();
			}
		}
		System.out.println("Maximum occured character is: "+maximumOccuredCharacter +" -repeated count is: "+maximum);
		
	}
}
