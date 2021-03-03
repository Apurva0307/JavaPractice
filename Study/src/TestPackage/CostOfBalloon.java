package TestPackage;
import java.util.*;

public class CostOfBalloon {

	public static void main(String[] args) {
		
		int GreenBlnCost,PurpleBlnCost,MinSpent,ParticipantCount,temp1=0,temp2=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the cost of Green balloons :");
		GreenBlnCost = sc.nextInt();
		
		System.out.println("Enter the cost of Purple balloons :");
		PurpleBlnCost = sc.nextInt();
		
		System.out.println("Enter the number of participants :");
		ParticipantCount = sc.nextInt();
		
		int arr[][] = new int[ParticipantCount][2];
		
		for(int i=0; i<ParticipantCount ; i++)
		{
			System.out.println("Enter the participation status for "+ (i+1) +" user (1 or 0) :");
			for(int j=0 ; j<2 ; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<ParticipantCount ; i++)
		{
			if(arr[i][0] == 1)
				temp1=temp1+1;
		}
		
		for(int i=0; i<ParticipantCount ; i++)
		{
			if(arr[i][1] == 1)
				temp2=temp2+1;
		}
		
		int x,y;
		
		x = temp1*GreenBlnCost + temp2*PurpleBlnCost;
		y = temp1*PurpleBlnCost + temp2*GreenBlnCost;
		
		if (x<y)
			System.out.println("Minimum cost for balloons is : "+x);
		else
			System.out.println("Minimum cost for balloons is : "+y);

	}

}
