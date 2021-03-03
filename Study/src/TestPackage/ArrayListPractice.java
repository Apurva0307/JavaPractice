package TestPackage;

import java.util.*;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		//Interger Arraylist
		/*ArrayList <Integer> Intlist1  = new ArrayList<Integer>();
		Intlist1.add(1);
		Intlist1.add(3);
		Intlist1.add(5);
		Intlist1.add(7);
		Intlist1.add(9);
		System.out.println("Length of Array list is : " + Intlist1.size());
		System.out.println("2nd element in list is : " + Intlist1.get(1));
		System.out.println("Arrar list is as follows : ");
		for(int i = 0 ; i < Intlist1.size() ; i++)
		{
			System.out.print("\t" + Intlist1.get(i));
		}
		
		System.out.println("\n");*/
		
		//Character Arraylist
		ArrayList <Character> Charlist1  = new ArrayList<Character>();
		Charlist1.add('A');
		Charlist1.add('E');
		Charlist1.add('I');
		Charlist1.add('O');
		Charlist1.add('U');
		System.out.println("Length of Array list is : " + Charlist1.size());
		System.out.println("1st element in list is : " + Charlist1.get(0));
		System.out.println("Arrar list is as follows : ");
		for(int i = 0 ; i < Charlist1.size() ; i++)
		{
			System.out.print(Charlist1.get(i) + "\t");
		}
		
		System.out.println("\n");

		//String Arraylist
		ArrayList <String> Stringlist1  = new ArrayList<String>();
		Stringlist1.add("Java");
		Stringlist1.add("Is");
		Stringlist1.add("Very");
		Stringlist1.add("Useful");
		Stringlist1.add("Programing Language");
		System.out.println("Length of Array list is : " + Stringlist1.size());
		System.out.println("1st element in list is : " + Stringlist1.get(0));
		System.out.println("Arrar list is as follows : ");
		for(int i = 0 ; i < Stringlist1.size() ; i++)
		{
			System.out.print(Stringlist1.get(i) + "\t");
		}
	}

}