package jb05.part07;

class BusCharge{
	
	String section;
	public BusCharge() {
	}
	public BusCharge(String section) {
		this.section=section;
	}
	public void information() {
		System.out.println("������ݾȳ�");
	}
}
interface Fee{
	char[] section = null;

	public void charge();

	public void information();
}

class Student extends BusCharge implements Fee{
	public Student() {
		super("�л�");
	}
	public void charge() {
		System.out.println("300��");
	}
}

class Adult extends BusCharge implements Fee{
	public Adult() {
		super("�Ϲ���");
	}
	public void charge() {
		System.out.println("500��");
	}
}

class Old extends BusCharge implements Fee{
	public Old() {
		super("���");
	}
	public void charge() {
		System.out.println("��¥");
	}
}

public class Display {
	public void main(String[] args) {
		Student bc1 = new Student();
		Adult bc2 = new Adult();
		Old bc3 = new Old();
		
//		bc1.information();
//		System.out.print(bc1.section);
//		bc1.charge();
//		
//		bc2.information();
//		System.out.print(bc2.section);
//		bc2.charge();
//		
//		bc3.information();
//		System.out.print(bc3.section);
//		bc3.charge();
//		
//		Fee[] fee = new Fee[3];
//		fee[0] = new Student();
//		fee[1] = new Adult();
//		fee[2] = new Old();
//		
//		for(int i =0;i<fee.length;i++) {
//			fee[i].information();
//			System.out.print(fee[i].section);
//			fee[i].charge();
//		}
	}
}
