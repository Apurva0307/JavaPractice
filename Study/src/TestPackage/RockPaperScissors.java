package TestPackage;

import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String CompMove = "";
		
		System.out.println("Enter R (Rock), P (Paper) or S (Scissors) : ");
		String str = sc.next();
		
		System.out.println("Your Move is : " + str);
		
		int random = (int)(Math.random()*3);
		
		if(random == 0)
			CompMove = "R";
		else if(random == 1)
			CompMove = "P";
		else if(random == 2)
			CompMove = "S";
		
		System.out.println("Computer Move is : " + CompMove);
		
		
		if (CompMove.equals(str))
			System.out.println("It's a Tie");
		else if((str.equals("R") && CompMove.equals("S")) || 
				(str.equals("S") && CompMove.equals("P")) || 
				(str.equals("P") && CompMove.equals("rock")))
			
			System.out.println("You Won !!! ");
		
		else
			System.out.println("You Lost !!!");

	}

}
