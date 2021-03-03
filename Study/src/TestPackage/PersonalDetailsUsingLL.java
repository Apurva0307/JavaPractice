package TestPackage;
import java.util.*;

public class PersonalDetailsUsingLL {
	
	String FirstName,LastName,EmailID,City,MobileNo;
	
	PersonalDetailsUsingLL(String FN, String LN, String email, String city, String MoNo)
	{
		FirstName = FN;
		LastName = LN;
		EmailID = email;
		City = city;
		MobileNo = MoNo;
	}
	
	public String toString() {
		return  FirstName + " " + LastName + "," + City + "\n" + EmailID + "\n" + MobileNo + "\n";
	}

	

	public static void main(String[] args) {
		
		LinkedList <PersonalDetailsUsingLL> LL1 = new LinkedList <PersonalDetailsUsingLL> ();
		
		PersonalDetailsUsingLL details1 = new PersonalDetailsUsingLL("TestFNOne","TestLNOne","One@email.com","Mumbai","9080786745");
		PersonalDetailsUsingLL details2 = new PersonalDetailsUsingLL("TestFNTwo","TestLNTwo","Two@email.com","Mumbai","9080786745");
		
		LL1.add(details1);
		LL1.add(details2);
		
		ListIterator <PersonalDetailsUsingLL> lit = LL1.listIterator();
		while(lit.hasNext())
		{
		System.out.println(lit.next());	
		}
	}

}
