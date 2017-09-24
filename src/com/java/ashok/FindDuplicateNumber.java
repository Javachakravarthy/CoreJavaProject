package com.java.ashok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindDuplicateNumber {
	
	public int findDuplicateNumber(List<Integer> series){
		int heigestNumber = Collections.max(series);
		int sum = series.stream().mapToInt(Integer::intValue).sum();
		int duplicateNumber = sum - (heigestNumber *(heigestNumber+1)/2);
		System.out.println(heigestNumber+" and sum of total number is "+sum + "The duplicate number is: "+duplicateNumber);
		return 0;
	}
	
	public static void main(String ... args){
		List<Integer> listOfNumbers = new ArrayList<>();
		FindDuplicateNumber obj = new FindDuplicateNumber();
		for(int i=0;i<30;i++){
			listOfNumbers.add(i);
		}
		listOfNumbers.add(13);
		System.out.println("ListOfNumbers "+listOfNumbers.toString());
		obj.findDuplicateNumber(listOfNumbers);
	}
/*
 * Defalut interfaces:
 * 
 */
}
