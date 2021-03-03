package TestPackage;

import java.util.Scanner;

public class CountOfCharOccurance {

	public static void main(String[] args) {
		
		String str1 = new String();
		char toBeChkChar;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		str1 = sc.next();
		
		System.out.println("Enter the character : ");
		toBeChkChar = sc.next().charAt(0);
		
		char[] ch = str1.toCharArray();
		
		for (int i=0 ; i < ch.length ; i++ )
		{
			if (toBeChkChar == ch[i])
				count++;
		}
		
		System.out.println("Character "+ toBeChkChar + " appeared " + count + " times in the given string");

	}

}
