package jp01.part08;

import java.util.*;

/*
	FileName : AutoBoxingUnBoxingTest.java
	
	::JDK 1.5�߰���� AutoBoxing/Auto-unBoxing
	1. primitive / Reference �� ��ȣ ����ȯ �Ұ�
	2. primitive / Reference ���� ȣȯ�� ���� Wrapper class ����
	    ==> int i = 1;
		==> Integer integer = new Integer(i);
		==> int j = integer.intValue();

		==> JDK 1.5������ ���� �ν��Ͻ� ������ ���������� �ڵ�(?)���� �̷�� ����.
		==> Integer integer = 1    
				( ����������  Integer integer = new Integer(i); ���� :: autoboxing )
		==> int j = integer
				( ����������  int j = integer.intValue(); ���� :: autounboxing )
		==> ��� Wrapper class���� �����
*/
public class AutoBoxingUnBoxingTest{
	
	///Field
	
	///Constructor
	
	///Method
	//==>jdk1.4�� ���
	public void add14(int intValue,double doubleValue,boolean boo){
		Integer i = new Integer(intValue);
		Double d = new Double(doubleValue);
		Boolean b = new Boolean(boo);

		//==>������ ����ϸ�...
		System.out.println("i.toString() : "+i);
		System.out.println("i.intValue() : "+i.intValue());
		System.out.println("d.toString() : "+d);
		System.out.println("d.doubleValue() : "+d.doubleValue());
		System.out.println("b.toString () : "+ b);
		System.out.println("b.booleanValue() : "+ b.booleanValue());
		
		double result = i.intValue()+d.doubleValue();
		System.out.println("�� : "+result);
	}
	
	//==>jdk1.5�� ���
	public void add15(int intValue,double doubleValue,boolean boo){
		//==> Autoboxing ��� ���� ::  Method add14() ��
		Integer i = intValue;			//���������� ==>Integer i = new Integer(intValue); 
		Double d = doubleValue; //���������� ==>Double d = new Double(doubleValue); 
		Boolean b = boo;				//���������� ==>Boolean b = new Boolean(boo);

		//==>������ ����ϸ�...
		System.out.println("i.toString() : "+i);
		System.out.println("i.intValue() : "+i.intValue());
		System.out.println("d.toString() : "+d);
		System.out.println("d.doubleValue() : "+d.doubleValue());
		System.out.println("b.toString () : "+ b);
		System.out.println("b.booleanValue() : "+ b.booleanValue());
		
		//==> Auto-unboxing ��� ����.
		double result = i+d;          //���������� ==>i.intValue()+d.doubleValue();
		System.out.println("�� : "+result);
	}
	
	//==>jdk1.4�� ���
	public void addArrayList14(int intValue){
		ArrayList arryList = new ArrayList();
		arryList.add(new Integer(intValue));
		Integer i = (Integer)arryList.get(0);
		System.out.println(i.intValue());
	}
	
	//==>jdk1.5�� ���
	//==>�Ʒ��� �ڵ����� generic/autoboxing/auto unboxing ���� ����
	public void addArrayList15(int intValue){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(intValue);      //==>autoboxing
		int i = arrayList.get(0); 		//==>autounboxing
		System.out.println(i);
	}
	
	///Main Method
	public static void main(String args[]){
		
		AutoBoxingUnBoxingTest test = new AutoBoxingUnBoxingTest();
		test.add14(1,1.2,true);
		
		System.out.println("===================");

		test.add15(1,1.2,true);
		
		System.out.println("===================");

		test.addArrayList14(10);
		
		System.out.println("===================");
		
		test.addArrayList15(10);
		
	}//end of main
	
}//end of class