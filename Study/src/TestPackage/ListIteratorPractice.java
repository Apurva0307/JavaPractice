package TestPackage;

import java.util.*;

public class ListIteratorPractice {

	public static void main(String[] args) {
		
		LinkedList <Integer> list = new LinkedList<Integer>();
		
		list.add(20);
		list.add(9);
		list.add(23);
		list.add(54);
		list.add(78);

		ListIterator <Integer> lit = list.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println("First Iterator : "+lit.next());
		}
		
		lit.add(99);
		System.out.println("Adding 99 with the help of List iterator : "+list);
		
		list.remove();
		System.out.println("After using remove() method from list : "+list);
		
		while(lit.hasNext())
		{
			Integer temp = new Integer(lit.next());
			
			if(temp.equals(23))
			{
				lit.remove();
				break;
			}
		}
		
		System.out.println("After using remove() method from list iterator : "+list);

	}

}
