package TestPackage;
import java.util.*;

public class SimpleCalculator {
	
	public int addition(int x, int y)
	{
		return (x+y);
	}
	
	public int addition(int x, int y, int z)
	{
		return (x+y+z);
	}

	public int subtract(int x, int y)
	{
		return (x-y);
	}
	
	public int subtract(int x, int y, int z)
	{
		return (x-y-z);
	}
	
	public int multiply(int x, int y)
	{
		return (x*y);
	}
	
	public int multiply(int x, int y, int z)
	{
		return (x*y*z);
	}
	
	public int divide(int x, int y)
	{
		return (x/y);
	}
	
	public int divide(int x, int y, int z)
	{
		return (x/y/z);
	}
	
	public static void main(String[] args) {
		
		SimpleCalculator calculate = new SimpleCalculator();
		Scanner sc = new Scanner(System.in);
		int Result;
		char operator;
		ArrayList <Integer> Intlist1  = new ArrayList<Integer>(); 
		
		System.out.println("Enter the operation you want to perform :");
		operator = sc.next().charAt(0);
		
		System.out.println("How many numbers you want to enter  (2 or 3)? :");
		int count = sc.nextInt();
		
		for (int i = 1; i <= count; i++)
		{
			System.out.println("Enter "+i+" number :");
			Intlist1.add(sc.nextInt());
		}
		
		System.out.println("You Entered : "+Intlist1);
		
	
		switch(operator)
		{
			case '+' : 
				if(count == 2)
				{
					Result = calculate.addition(Intlist1.get(0), Intlist1.get(1));
					System.out.println("Addition of 2 numbers is : " + Result);
				}
	  
				if(count == 3)
				{
					Result = calculate.addition(Intlist1.get(0), Intlist1.get(1),Intlist1.get(2));
					System.out.println("Addition of 3 numbers is : " + Result);
				}
				
				break;
				
			case '-' : 
				if(count == 2)
				{
					Result = calculate.subtract(Intlist1.get(0), Intlist1.get(1));
					System.out.println("Subtraction of 2 numbers is : " + Result);
				}
	  
				if(count == 3)
				{
					Result = calculate.subtract(Intlist1.get(0), Intlist1.get(1),Intlist1.get(2));
					System.out.println("Subtraction of 3 numbers is : " + Result);
				}
				
				break;
				
			case '*' : 
				if(count == 2)
				{
					Result = calculate.multiply(Intlist1.get(0), Intlist1.get(1));
					System.out.println("Multiplication of 2 numbers is : " + Result);
				}
	  
				if(count == 3)
				{
					Result = calculate.multiply(Intlist1.get(0), Intlist1.get(1),Intlist1.get(2));
					System.out.println("multiplication of 3 numbers is : " + Result);
				}
				
				break;
				
			case '/' : 
				if(count == 2)
				{
					Result = calculate.divide(Intlist1.get(0), Intlist1.get(1));
					System.out.println("division of 2 numbers is : " + Result);
				}
	  
				if(count == 3)
				{
					Result = calculate.divide(Intlist1.get(0), Intlist1.get(1),Intlist1.get(2));
					System.out.println("division of 3 numbers is : " + Result);
				}
				
				break;
				
			default : 
				System.out.println("You entered invalid operator...");
				break;
		
		}
		

	}

}
