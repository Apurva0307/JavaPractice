package TestPackage;

import java.util.Scanner;

public class EvenOddSeries {
	
	public void EvenNumbers()
	{
		System.out.println("Even numbers between 0 to 20 are :");
		
		for(int i = 0 ; i <= 20 ; i++)
		{
			if (i % 2 == 0)
				System.out.println(i);
		}
	}

	public void OddNumbers()
	{
		System.out.println("Odd numbers between 0 to 20 are :");
		
		for(int i = 0 ; i <= 20 ; i++)
		{
			if (i % 2 == 1)
				System.out.println(i);
		}
	}
	
	public void Tables()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want to print table :");
		int num1 = sc.nextInt();
		
		int i = 1;
		
		System.out.println("The table is : ");
		
		while ( i <= 10)
		{
			int tableValue = i * num1;
			System.out.println(num1 + " * " + i + " = " +tableValue);
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		
		EvenOddSeries obj1 = new EvenOddSeries();
		
		obj1.EvenNumbers();
		obj1.OddNumbers();
		obj1.Tables();

	}

}
