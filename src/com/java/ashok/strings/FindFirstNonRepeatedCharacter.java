package com.java.ashok.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFirstnonRepeatedChar("heleloh"));
		//Using Linked Hashmap because it maintains the order
		System.out.println(findFirstnonRepeatedCharUsingLinkedHasmap("heleloho"));

	}
	private static char findFirstnonRepeatedCharUsingLinkedHasmap(String string) {
		Map<Character,Integer> linkedHashmap = new LinkedHashMap<>();
		char[] charArray = string.toCharArray();
		for(char ch : charArray){
			if(linkedHashmap.containsKey(ch)){
				linkedHashmap.put(ch, linkedHashmap.get(ch)+1);
			}else{
				linkedHashmap.put(ch, 1);
			}
		}for(Entry<Character,Integer> entry: linkedHashmap.entrySet()){
			if(entry.getValue() ==1)
				return entry.getKey();
		}
	 throw new RuntimeException("Didn't find the non repeated character");
	}
	
	private static char findFirstnonRepeatedChar(String string1) {
		// TODO Auto-generated method stub
		char[] stringArray = string1.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for(char ch : stringArray){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}
			else{
				map.put(ch, 1);
			}
		}
		for(char ch : stringArray){
			if(map.get(ch) == 1){
				System.out.println("The first Non repeated character: "+ch);
				return ch;
			}
		}
		return 0;
			
	}

}
