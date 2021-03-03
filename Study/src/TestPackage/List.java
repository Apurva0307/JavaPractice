package TestPackage;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList <Integer> Intlist1  = new ArrayList<Integer>();
		Intlist1.add(1);
		Intlist1.add(3);
		Intlist1.add(5);
		
		System.out.println("Integer List : " + Intlist1);
		
		ArrayList <String> Strlist1  = new ArrayList<String>();
		Strlist1.add("One");
		Strlist1.add("Three");
		Strlist1.add("Five");
		
		System.out.println("String List : " + Strlist1);
		
		Strlist1.add(Intlist1.toString());
		
		System.out.println("String List after adding Intlist1 : " + Strlist1);

	}

	
}
