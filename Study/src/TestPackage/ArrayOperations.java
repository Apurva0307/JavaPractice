package TestPackage;

import java.util.Scanner;

public class ArrayOperations {

	public static void main(String[] args) {
		int RowLength, ColumnLength;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row Length:");
		RowLength = sc.nextInt();
		System.out.println("Enter column Length:");
		ColumnLength = sc.nextInt();
		
		int arr1[][] = new int[RowLength][ColumnLength];
		int arr2[][] = new int[RowLength][ColumnLength];
		int FinalArr[][] = new int[RowLength][ColumnLength];
		
		//Accepting Array1
		System.out.println("Enter values for array 1 : ");
		for(int i=0; i<RowLength ; i++)
		{
			for(int j=0 ; j<ColumnLength ; j++)
			{
				//System.out.println("Enter Value for ["+i+"] ["+j+"] position :");
				arr1[i][j] = sc.nextInt();
			}
		}
		
		//Accepting Array2
		System.out.println("Enter values for array 2 : ");
		for(int i=0; i<RowLength ; i++)
		{
			for(int j=0 ; j<ColumnLength ; j++)
			{
				//System.out.println("Enter Value for ["+i+"] ["+j+"] position :");
				arr2[i][j] = sc.nextInt();
			}
		}
		
		//performing addition of arrays
		for(int i=0; i<RowLength ; i++)
		{
			for(int j=0 ; j<ColumnLength ; j++)
			{
				FinalArr[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		
		//Printing Final Result
		System.out.println("After Addition Matrix will be : ");
		
		for(int i=0; i<RowLength ; i++)
		{
			System.out.print("\n");
			for(int j=0 ; j<ColumnLength ; j++)
			{
				System.out.print(FinalArr[i][j]+"\t");
			}
		}

	}

}
