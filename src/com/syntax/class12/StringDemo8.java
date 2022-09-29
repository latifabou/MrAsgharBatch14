package com.syntax.class12;

public class StringDemo8 {

	public static void main(String[] args) {
		String str="Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
       /*replace method replaces one String with another in a String
        * replaceAll is takes a pattern and replace all the characters
        */
		
		System.out.println(str.replace("good", "Excellent"));
        System.out.println(str.replaceAll("[a-z]", ""));

	}

}
