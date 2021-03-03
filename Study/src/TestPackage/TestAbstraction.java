package TestPackage;

abstract class AbstractionParent {
	public abstract void method1();
	public void method2()
	{
		System.out.println("Inside abstract class");
	}
}

class ChildClass extends AbstractionParent{
	public void method1() 
	{
		System.out.println("Inside child class");
	}
	
}

class TestAbstraction{
	public static void main(String[] args){
		ChildClass cc = new ChildClass();
		cc.method1();
		cc.method2();
	}
}