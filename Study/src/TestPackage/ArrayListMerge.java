package TestPackage;

import java.util.ArrayList;

public class ArrayListMerge {

	public static void main(String[] args) {
		
		//Interger Arraylist1
		ArrayList <Integer> Intlist1  = new ArrayList<Integer>();
		Intlist1.add(1);
		Intlist1.add(3);
		Intlist1.add(5);
				
		//System.out.println("Length of Array list is : " + Intlist1.size());			

		System.out.println("Arrar list is as follows : ");		
		for(int i = 0 ; i < Intlist1.size() ; i++)		
		{		
			System.out.print("\t" + Intlist1.get(i));	
		}

		System.out.println("\n");
		//Interger Arraylist2
		ArrayList <Integer> Intlist2  = new ArrayList<Integer>();
				
		Intlist2.add(2);
		Intlist2.add(4);
		Intlist2.add(6);
		
		//adding arraylist2 in arraylist1
		Intlist1.addAll(1,Intlist2);
		
		//System.out.println("Now the Length of Array list 1 is : " + Intlist1.size());			

		System.out.println("After mering arraylist2 in arraylist1, Arraylist 1 is as follows : ");		
		for(int i = 0 ; i < Intlist1.size() ; i++)		
		{		
			System.out.print("\t" + Intlist1.get(i));	
		}
		
	}

}
