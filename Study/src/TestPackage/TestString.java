package TestPackage;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		
		String s1 = new String();
		s1 = "Hello";
		System.out.println("*** String 1 is : "+s1);
		
		char[] ch = s1.toCharArray();
		
		for (int i = 0 ; i < ch.length ; i++)
			System.out.println("Character at "+i+"th position is : "+ch[i]);
		

		String s2 = new String();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String 2 :");
		s2=sc.next();
		System.out.println("*** You have entered string 2 as : "+s2);
		
		String s3 = new String();
		s3 = s1 + s2;
		System.out.println("*** String 1 + String 2 is : " + s3);
		//String s4 = new String();
		String s4=s1.concat(s2);
		System.out.println("*** After Concatinating String 1 and string 2 : " + s4);
		
		if(s3.equals(s4))
			System.out.println("*** String 3 and String 4 are equal");
		else
			System.out.println("*** String 3 and String 4 are not equal");
		
		if(s1.equals(s2))
			System.out.println("*** String 1 and String 2 are equal");
		else
			System.out.println("*** String 1 and String 2 are not equal");
		
		System.out.println("*** String 4 and  String 4 after comparison : " + s3.compareTo(s4));
		System.out.println("*** Character at 0th location of string 3 is : " + s3.charAt(0));
		System.out.println("*** String 1 contains World : " + s1.contains("World"));
		System.out.println("*** String 3 contains World : " + s3.contains("World"));
		System.out.println("*** Length of string 4 is : "+ s4.length());
		
	}

}
