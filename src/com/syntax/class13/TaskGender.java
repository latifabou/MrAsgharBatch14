package com.syntax.class13;

public class TaskGender {

	public static void main(String[] args) {
		/*
		   Write a program that reads two people's first names and if they expecting boy
		  or girl? Based on the input suggests a name for a baby:
		   Example Output: 
		 Example Output:
           Mom’s first name? Mary
           Dad’s first name? Daniel
           Boy or Girl? boy
           Suggested baby name: DANRY
		   Boy or Girl? girl
           Suggested baby name: MAIEL
		
		 */
            String MomFirstName="Mary";
            String DadFirstName="Daniel";
            String isBoy="Daniel";
            String isGirl="Mary";
		if(isBoy.equals(DadFirstName)) {
			System.out.println(isBoy.substring(0, 3).concat(isGirl.substring(2, 4)));
		}
		if(isGirl.equals(MomFirstName)) {
			System.out.println((isGirl.substring(0, 2).concat(isBoy.substring(3, 6))));
	}
	}
}
