package jp01.part01;

/*
  FileName : A.java
  
  1. Java Class(API / ���������� )�� �ֻ��� class 
        ==> java.lang.Object :: Ȯ���ϸ� 
        :  API ==> Hierarchy
        :  ���������� ==>javap A   : Object.class�� �ڵ� extends
		                                            :  Fully Qualified Class Name(FQCN) 
  2.  java.lang.Object Ŭ������ �ڹ��� ��� Ŭ�������� ���� �Ϲ����� ������ �Ӽ���
       ���ǵǾ� �־�, java �� ��� Ŭ������ Object Ŭ������ Method �� Field �� ��밡��. 
  3. Object.class�� toString()�� �ǹ��� ����
*/
public class A {

	/// Field

	/// Constructor
	public A() {
	}

	// method
	// ==> �Ʒ��� toString()�� �ּ�ó�� �ϰ� ����, �ּ��� Ǯ�� ���� ���Ȯ��
	// /*
	public String toString() {
		return "�ֻ��� Object �� OverRiding ����";
	}
	// */

	/// main Method
	public static void main(String[] args) {

		A a = new A();
		String str = a.toString();

		// �Ʒ��� ��°���� Ȯ���ϸ�.....
		System.out.println("str ==> " + str);
		System.out.println("a.toString ==> " + a.toString());
		System.out.println("a ==> " + a);
	}// end of main

}// end of class
/*
 * 1. ���� 1 : ���� ���� compile �� ���� 2. ���� 2 : toString Method �� �ּ� ó���� compile �� ����
 * ==> ����� ���ϸ�....
 */