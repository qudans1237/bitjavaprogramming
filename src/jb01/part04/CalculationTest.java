package jb01.part04;
/*
  FileName: CalculationTest
 */
public class CalculationTest {
	public static void main(String[] args) {
		int a; // int data type cariable a declaration
		a = 0;  // int data type variable a�� value ����
		int b = 1; //int data type variable b declaration�� ���ÿ� value ����
		int c = 2;
		// ������ ���� ��� (���� + ������ ��� =>append)
		System.out.println("a= " +a+" b= "+b+" c= "+c);
		
		//���� + ������ ���(���)
		int sum = a+b+c;
		System.out.println("sum= "+sum);
		System.out.println("a+b+c= "+(a+b+c)); // ==> �Ʒ� ���๮�� ��� ����� ��
		System.out.println("a+b+c= "+a+b+c); //==> ���� ���๮�� ��� ����� ��
		
		c = c+10;
		System.out.println("c=(c+10): "+c);
		
		//������ ���Կ�����(+=)��� (c=c+10 ������ �ǹ�)
		c+=10;
		System.out.println("c+10= " +c);
		
		//������������
		boolean boo1 = true;
		boolean boo2 = !boo1;
		
		System.out.println("boo1: "+ boo1);
		System.out.println("boo2: "+ boo2);
		
	}
}
