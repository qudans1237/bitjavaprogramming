package jb04.part04;

class BusCharge {
	String section;

	public BusCharge() {
	}
	public BusCharge(String str) {
		section = str;
	}

	public void information() {
		System.out.println("������ݾȳ�");
	}

	public void charge() {
		System.out.println("�л�:300,�Ϲ���:500,���:��¥");
	}
}// end of class

class Student extends BusCharge {
	public Student() {
		super("�л�");
	}

	public void charge() {
		System.out.println("::300��\n");
	}
}// end of class

class Adult extends BusCharge {
	public Adult() {
		super("�Ϲ���");
	}

	public void charge() {
		System.out.println("::500��\n");
	}
}// end of class

class Old extends BusCharge {
	public Old() {
		super("���");
	}

	public void charge() {
		System.out.println("::��¥\n");
	}
}// end of class

public class Display {
	/// main method
	public static void main(String args[]) {
		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();

		b1.information();
		System.out.print(b1.section);
		b1.charge();

		b2.information();
		System.out.print(b2.section);
		b2.charge();
		
		b3.information();
		System.out.print(b3.section);
		b3.charge();
	}
}
