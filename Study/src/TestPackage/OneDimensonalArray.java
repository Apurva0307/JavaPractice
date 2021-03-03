package TestPackage;
import java.util.*;
public class OneDimensonalArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array length : ");
		int arrlength = sc.nextInt();
		
		int arr1[] = new int[arrlength];
		
		for (int i=0 ; i<arrlength ; i++)
		{
			System.out.println("Enter "+i+"th element in array : ");
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("You have entered : ");
		for (int i=0 ; i<arrlength ; i++)
		{
			System.out.print("\t"+arr1[i]);
		}

	}

}
