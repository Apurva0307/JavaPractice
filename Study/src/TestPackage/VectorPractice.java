package TestPackage;

import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(4);  
       
        vec.add("Yellow");  
        vec.add("Red");  
        vec.add("Black");  
        vec.add("White");  
        
        System.out.println("Size is: "+vec.size());  
        System.out.println("Default capacity is: "+vec.capacity());
        System.out.println("Vector element is: "+vec);  
        
        vec.addElement("Green");  
        vec.addElement("Blue");  
        vec.addElement("Purple");  
        vec.add("Pink");
        vec.add(0, "Indigo");
        
        System.out.println("Size after addition: "+vec.size());  
        System.out.println("Capacity after addition is: "+vec.capacity());
        System.out.println("Elements are: "+vec);  
             
          if(vec.contains("White"))  
          {  
             System.out.println("White is present at the index " +vec.indexOf("White"));  
          }  
          else  
          {  
             System.out.println("Tiger is not present in the list.");  
          } 
          
        System.out.println("The first color of the vector is = "+vec.firstElement());   
        System.out.println("The last color of the vector is = "+vec.lastElement());   

	}

}
