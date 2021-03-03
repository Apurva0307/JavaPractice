package TestPackage;
import java.util.Scanner;

public class LargestNumber {
	
	public void LargeNumber()
	{
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Enter 3 numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3)
			System.out.println("The Largest number is : " + num1);
		else if(num2 > num1 && num2 > num3)
			System.out.println("The Largest number is : " + num2);
		else
			System.out.println("The Largest number is : " + num3);
		
	}

	public static void main(String[] args) {
		LargestNumber lrgnum = new LargestNumber();
		
		lrgnum.LargeNumber();
	}

}
