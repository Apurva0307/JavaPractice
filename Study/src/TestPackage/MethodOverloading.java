package TestPackage;

public class MethodOverloading {
	
	public void Method1(int a, char b)
	{
		System.out.println("Inside Method 1 :"+ a + b );
	}

	public void Method1(int a)
	{
		System.out.println("Inside Method 2 :"+ a);
	}
	
	public void Method1(char a, int b)
	{
		System.out.println("Inside Method 3 :" + a + b);
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		
		mo.Method1(1,'a');
		mo.Method1(2);
		mo.Method1('b', 3);

	}

}
