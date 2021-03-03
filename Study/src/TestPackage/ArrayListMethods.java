package TestPackage;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		//Integer Arraylist1
		ArrayList <Integer> Intlist1  = new ArrayList<Integer>();
		Intlist1.add(1);
		Intlist1.add(3);
		Intlist1.add(4);
		Intlist1.add(8);
		Intlist1.add(5);
		
		System.out.println("Array list1 is as follows : ");
		for(int i = 0 ; i < Intlist1.size() ; i++)
		{
			System.out.print("\t" + Intlist1.get(i));
		}
		
		System.out.println("\n");
		//Integer Arraylist2
		ArrayList <Integer> Intlist2  = new ArrayList<Integer>();
				
		Intlist2.add(3);
		Intlist2.add(5);
		Intlist2.add(9);
		
		System.out.println("Array list2 is as follows : ");
		for(int i = 0 ; i < Intlist2.size() ; i++)
		{
			System.out.print("\t" + Intlist2.get(i));
		}
		
		System.out.println("\n");
		//RetainAll
		Intlist1.retainAll(Intlist2);
		
		System.out.println("Array list1 is as follows : ");
		for(int i = 0 ; i < Intlist1.size() ; i++)
		{
			System.out.print("\t" + Intlist1.get(i));
		}

		
		System.out.println("\n");
		//RetainAll
		Intlist2.retainAll(Intlist1);
		
		System.out.println("Array list2 is as follows : ");
		for(int i = 0 ; i < Intlist2.size() ; i++)
		{
			System.out.print("\t" + Intlist2.get(i));
		}
		
		System.out.println("\n");
		
		System.out.println("List toString : "+Intlist1.toString());

	}

}
