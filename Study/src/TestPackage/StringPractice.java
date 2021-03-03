package TestPackage;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		
		String gender = new String();
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.println("Enter your gender (male/female) : ");
		gender = sc.next();
		
		System.out.println("Enter your age : ");
		age = sc.nextInt();
		
		if (gender.equalsIgnoreCase("male") && age >= 21)
			System.out.println("*** You  are eligible for marriage***");
		
		else if (gender.equalsIgnoreCase("male") && age <= 21)
			System.out.println("*** You  are NOT eligible for marriage***");
		
		else if (gender.equalsIgnoreCase("female") && age >= 18)
			System.out.println("*** You  are eligible for marriage***");
		
		else if (gender.equalsIgnoreCase("female") && age <= 18)
			System.out.println("*** You  are NOT eligible for marriage***");
		
		else
			System.out.println("*** Invalid Input ***");

	}

}
