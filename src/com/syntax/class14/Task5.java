package com.syntax.class14;

public class Task5 {

	public static void main(String[] args) {
		/*How would you check if String is palindrome or not? aba=> true
				Abbc =>false
*/
	String s="Madam";
	int len=s.length();
	String rev="";
	for(int i=len-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
		
		if(rev.equalsIgnoreCase(s)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	
	
	}

}
