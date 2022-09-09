package com.Inher;

public class ParentClass   {
	private String Name = "Rajesh";
	private int Age = 34;
	private double Salary = 50000;
	
	public static void main(String[] args) {
		
		ParentClass pc= new ParentClass();
		System.out.println("The employee name is: " +pc.Name);
		System.out.println("The employee name is: " +pc.Age);
		System.out.println("The employee name is: " +pc.Salary);
		
		ChildClass1 cc = new ChildClass1();
		cc.Handling();;
		
		ChildClass2 cc2 = new ChildClass2();
		cc2.Strings();
	
	}

}
