package TestPackage;

import java.util.*;

public class HashSetPractice {

	public static void main(String[] args) {
		HashSet <Integer> set = new HashSet();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(90);
		
		System.out.println("Set Size is : "+set.size()+" and Set is : "+set);
		
		set.remove(20);
		
		System.out.println("Now the set is : "+set);

	}

}
