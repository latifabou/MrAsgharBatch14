package com.syntax.class13;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: Example Output:
		 * Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
		 * boy Suggested baby name: DANRY Boy or Girl? girl Suggested baby name: MAIEL
		 * 
		 */
		String MomFirstName;
		String DadFirstName;
		String babygender;
		String firstHalf;
		String secondHalf;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter Mom's first name");
		MomFirstName=input.next();
		System.out.println("Please enter Dad's first name");
		DadFirstName=input.next();
		System.out.println("Are you expecting a boy or a girl");
		babygender=input.next();
		
		if (babygender.equals("boy")) {
			firstHalf = DadFirstName.substring(0, DadFirstName.length() / 2);
			secondHalf = MomFirstName.substring(MomFirstName.length() / 2);
		} else
		{
			firstHalf = MomFirstName.substring(0, MomFirstName.length() / 2);
			secondHalf = DadFirstName.substring(DadFirstName.length() / 2);
		}
		System.out.println(firstHalf + secondHalf);
	}
}