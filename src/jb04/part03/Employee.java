package jb04.part03;

public class Employee {
	
	String part;
	String name;
	int age;
	int baseSalary;
	
	public Employee() {
		System.out.println("Emp�� default Constructor");
	}
	public Employee(String str) {
		name=str;
		System.out.println("Emp�� name�� �޴� Constructor");
	}
	public Employee(String str1, String str2) {
		this(str1);
		part=str2;
		System.out.println("Emp�� name,part�� �޴� Constructor");
	}
	public Employee(String str1,String str2,int i) {
		this(str1,str2);
		age = i;
		System.out.println("Emp�� name,part,int �� �޴� Constructor");
	}
	
	public int salary() {
		System.out.println("Emp�� salay() method");
		baseSalary = 100;
		return baseSalary;
		
	}
}// end of class

