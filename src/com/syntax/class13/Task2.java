package com.syntax.class13;

public class Task2 {
	public static void main(String[] args) {
		// 2-Create a String and print it in reverse order (Sunday → yadnuS).
		String str = "Sunday";

		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));

		}
		System.out.println();
char []c=str.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
		
		
	}
}