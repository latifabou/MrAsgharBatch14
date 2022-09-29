package com.syntax.class14;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * How would you reverse a String word by word? for example input=>This is
		 * sentence i want to reverse output=>sihT si ecnetnes i tnaw ot esrever
		 */
	
		String s="This is sentence i want to reverse";
		String []ar=s.split(" ");
     String reverseString="";
		for(String a:ar) {
			String reverseword="";
		for(int i=a.length()-1;i>=0;i--) {
			reverseword=reverseword+a.charAt(i);
		}
     reverseString=reverseString+reverseword+" ";
     }
	System.out.println(reverseString);
	
	
	
	
	}

}
