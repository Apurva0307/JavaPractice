package BankingSystem;
import java.util.*;


public class Bank {

	private String name, surname, branch;
	private int accountno;
	public int AccntBalance, depositeAmt, withdrawAmt;
	
	public void setAccntBalance(int AccntBalance) {
		this.AccntBalance = 0;
	}
	public void setDepositeAmt(int depositeAmt) {
		this.depositeAmt = 0;
	}
	public void setWithdrawAmt(int withdrawAmt) {
		this.withdrawAmt = 0;
	}
	
	Scanner sc = new Scanner(System.in);
	Random randomno = new Random();
	
	public void CreateAccount()
	{
		System.out.print("Enter Customer Name : ");
		name = sc.next();
		
		System.out.print("Enter Customer Surname : ");
		surname = sc.next();
		
		System.out.print("Enter Nearest Branch : ");
		branch = sc.next();
		
		accountno = randomno.nextInt(100000);
		System.out.println("Account number for "+ name +" "+ surname + " is  :" + accountno);
	}
	
}
