package com.syntax.class14;

public class Task1 {

	public static void main(String[] args) {
		/*Create a String that will hold a sentence. 
		Write a program to get a new String without any spaces.
*/
	String str="it feels good to be home";
	str=str.replaceAll("\\s", "");
	
	System.out.println(str);
	
	
	}

}
