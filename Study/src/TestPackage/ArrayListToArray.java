package TestPackage;

import java.util.*;

public class ArrayListToArray {

	public static void main(String[] args) 
	{
		int rand = (int)(Math.random()*3);
		System.out.println(rand);
		/*ArrayList<Integer> arrList1 = new ArrayList<Integer> ();
		
		arrList1.add(10);
		arrList1.add(20);
		arrList1.add(30);
		arrList1.add(40);
		arrList1.add(50);
		
		
		System.out.println("ArrayList1 is : " + arrList1);
		
		
		Integer array[] = new Integer [arrList1.size()];
		array = arrList1.toArray(array);
		
		
		System.out.println("converted array is : ");
		for(int i=0 ; i<array.length ; i++)
		{
			System.out.print(array[i]+"\t");
		}
		System.out.println("\n");*/
		
		
		ArrayList<String> arrListStr = new ArrayList<String> ();
		
		arrListStr.add("ABC");
		arrListStr.add("PQR");
		
		
		System.out.println("ArrayListStr is : " + arrListStr);
		
		
		//String arrStr[] = new String [arrListStr.size()];
		
		Object arrStr[] = arrListStr.toArray();
		
		System.out.println("converted array is : ");
		for(int i=0 ; i<arrStr.length ; i++)
		{
			System.out.print(arrStr[i]+"\t");
		}
		
	}

}
