package jb04.part02;

public class Son extends Iam {

	String school;

	public Son() {
		System.out.println("Son class default Consructor");
	}

	public void setSchool(String str) {
		school = str;
	}

	public String getSchool() {
		return school;
	}

	public static void main(String[] args) {

		Son son = new Son();

		son.setName("ȫ�浿�Ƶ�");
		son.setAge(50);
		son.setJob("�������غ���");
		son.setSchool("����Ƽ��������");

		System.out.println("�̸�: " + son.getName());
		System.out.println("����: " + son.getAge());
		System.out.println("����: " + son.getJob());
		System.out.println("�б�: " + son.getSchool());

	}// end of main
}// end of class
