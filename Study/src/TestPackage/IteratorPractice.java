package TestPackage;
import java.util.*;

public class IteratorPractice {

	public static void main(String[] args) {
		
		LinkedList <Integer> list = new LinkedList<Integer>();
		
		list.add(20);
		list.add(9);
		list.add(23);
		list.add(54);
		list.add(78);
		
		Iterator <Integer> it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println("first iterator : "+it.next());
		}
		
		System.out.println(it.getClass());

	}

}
