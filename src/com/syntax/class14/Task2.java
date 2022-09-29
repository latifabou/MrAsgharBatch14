package com.syntax.class14;

public class Task2 {

	public static void main(String[] args) {
		/*Create a String that should be combination of letters,
		numbers and special characters. Find out how many Alphanumeric(abd AZ 284) 
		characters are there in the String.
       */
		String str="Batch 14 is good 81247818!@##%#ASAKBSAKJSBN kajbjakfdnb";
	String str1=str.replaceAll("[^a-zA-z0-9]", "");
	System.out.println(str1);
    char []arr=str1.toCharArray();
	System.out.println(arr.length);
	
	}

}
