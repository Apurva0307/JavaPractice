package TestPackage;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String str1 = new String();
		String str2 = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to check palindrome : ");
		str1 = sc.next();
		
		char[] ch = str1.toCharArray();
		
		
		for (int i=ch.length-1 ; i>=0 ; --i)
		{
			str2 = str2 + ch[i];
		}
		System.out.println("*** Reverse String is : "+ str2);
		
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Given String is a Palindrome");
		else
			System.out.println("Given String is not a Palindrome");

	}

}
