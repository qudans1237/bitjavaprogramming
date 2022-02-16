package jb05.part02;

public class ObjectTest {
	
	int i;
	static int j;
	
	static {
		System.out.println("A>:j="+j);
		j=1;
		System.out.println("B>j="+j);
	}
	
	public ObjectTest() {
		System.out.println("ObjectTest default Constructor::C>:i= "+i);
	}
	
	public void printlnstanceInt() {
		System.out.println("D>:i="+i);
	}
	
	public void printClassInt() {
		System.out.println("E>:j="+j);
	}
	
	public static void main(String args[]) {
		System.out.println("|========================|");
		ObjectTest obj1 = new ObjectTest();
		obj1.printlnstanceInt();
		obj1.printClassInt();
		System.out.println("|========================|");
//		ObjectTest.printClassInt();
		
		System.out.println("|========================|");
		ObjectTest obj2 = new ObjectTest();
		obj2.i = 100;
		System.out.println("obj2.i="+obj2.i+": obj1.i="+obj1.i);
		
		System.out.println("|========================|");
		obj2.j=3333;
		System.out.println("obj2.j="+obj2.j+":obj1.j="+obj1.j);
		System.out.println("ObjectTest.j = "+ObjectTest.j);
	}
}
