package MethodOverloadOverride;

public class OverridingPractice {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		Person t1 = new Teacher();
		
		Person e1 = new Engineer();
		
		Teacher MT1 = new MathsTeacher();
		
		Engineer SE1 = new SoftwareEngineer();
		SoftwareEngineer SE11 = new SoftwareEngineer();
		
		SE1.Eat();
		SE11.Eat();
		
		p1.Salary();

	}

}
