package jb05.part09;

/*
 	FileName : NullTest.java 
 	
 		1. Garbage Collection ����
			�� null �ǹ̸� ���� : �׳� ���°�
			�� garbage  : �ĺ��� ���� �޸�
			�� garbage collector : �ĺ��� ���� �޸� ������
			�� garbage collecting : �����ִ� ����
			�� garbage collection :
		2. Field ( Member Variable) �� Local Variable �ʱ�ȭ ���� 
*/
public class NullTest{
	
	///Field
	private int number;
	
	///Constructor
	public NullTest(){
	}
	
	///Method
	public int getNumber(){
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	///Main Method
	public static void main(String[] args){
		//==> localVariable �ʱ�ȭ
		//==> �Ʒ��� �ּ��� ������ Ǯ��� �����Ͻ� ������ Ȯ������. 
		int i = 0;
		//int i;
		System.out.println(" i : "+i);
		
		System.out.println("=================");
		// ��ü�� ���� �� �ܰ�(null�� �ʱ�ȭ��.)
		NullTest nt = null;
		System.out.println("nt : "+nt);
		
		//���� ���� �ܰ� 
		nt = new NullTest();
		System.out.println("nt : "+nt);
		System.out.println("nt.getNumber() : "+nt.getNumber());
		
		//�������� ���� �ܰ�	
		nt = null;
		System.out.println("nt : "+nt);
		System.out.println("nt.getNumber() : "+nt.getNumber()); // Garbage collection
	}//end of main
	
}//end of class