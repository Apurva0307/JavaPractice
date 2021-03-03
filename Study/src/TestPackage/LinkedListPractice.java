package TestPackage;
import java.util.*;

public class LinkedListPractice {
	public static void main(String[] args) {
		
		//Linked List1
		LinkedList<String> ll=new LinkedList<String>();  
        System.out.println("Initial list of elements: "+ll);  
        ll.add("Alpha");  
        ll.add("Beta");  
        ll.add("Gamma");  
        System.out.println("After invoking add method: "+ll);  
        
        //Add element at index 1
        ll.add(1, "Theta");  
        System.out.println("After invoking add(int index, E element) method: "+ll); 
        
        //LinkedList2
        LinkedList<String> ll2=new LinkedList<String>();  
        ll2.add("Lambda");  
        ll2.add("Delta");  
        
        //Add LinkedList2 in LinkedList1
        ll.addAll(ll2);  
        System.out.println("After invoking addAll method: "+ll);  
  
        
        //Add element in first position
        ll.addFirst("Mu"); 
        System.out.println("After invoking addFirst method: "+ll);  
        
        //Add Element in last position
        ll.addLast("Omega");  
        System.out.println("After invoking addLast method: "+ll);  

	}

}
