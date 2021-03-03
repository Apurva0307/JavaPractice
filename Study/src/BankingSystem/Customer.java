package BankingSystem;
import java.util.*;

public class Customer extends Bank {
	
	public void DepositAmount()
	{
		System.out.print("\n\nEnter the Deposit Amount : ");
		depositeAmt = sc.nextInt();
		
		int temp = AccntBalance + depositeAmt;
		
		if (temp <= 0 )
			System.out.print("\n***Invalid Deposit Amount***");
		else
		{
			System.out.print("\nAmount Successfully Deposited");
			AccntBalance = temp;
		}
		
		ChkBalance();
	}
	
	
	public void WithdrawAmount()
	{
		System.out.print("\n\nEnter the Amount you want to Withdraw : ");
		withdrawAmt = sc.nextInt();
		
		int temp = AccntBalance - withdrawAmt;
		
		if (temp < 0 )
			System.out.print("\n***Insufficient account balance***");
		else
		{
			System.out.print("\nAmount Successfully Withdrawn");
			AccntBalance = temp;
		}
		
		ChkBalance();
	}
	
	
	public void ChkBalance()
	{
		System.out.print("\nYour Current Balance is : "+ AccntBalance);
	}

	
	
	public static void main(String[] args) {
		
		//Bank newCustomer = new Bank();
		Customer customer1 = new Customer();
		
		customer1.CreateAccount();
		
		customer1.DepositAmount();
		
		customer1.WithdrawAmount();
		
		//customer1.ChkBalance();
			
	}

}
