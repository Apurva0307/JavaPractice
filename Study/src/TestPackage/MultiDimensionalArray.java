package TestPackage;
import java.util.*;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
	
		int rowLength, columnLength;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row Length :");
		rowLength = sc.nextInt();
		System.out.println("Enter column Length :");
		columnLength = sc.nextInt();
		
		int arr[][] = new int[rowLength][columnLength];
		
		//Accepting Array
		for(int i=0; i<rowLength ; i++)
		{
			for(int j=0 ; j<columnLength ; j++)
			{
				System.out.println("Enter Value for ["+i+"] ["+j+"] position :");
				arr[i][j] = sc.nextInt();
			}
		}
	
		//Printing Array
		System.out.println("\n2 dimensional Array is : ");
		for(int i=0; i<rowLength ; i++)
		{
			System.out.print("\n");
			
			for(int j=0 ; j<columnLength ; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
		}
	}
}
