package Day08.part06;

/*
	FileName : PackageTest02.java
	1. ����� ���� package �� ���
	2. javac -d . PackageTest02.java              <== �����Ͻ� -d �ɼ��� ���
	3. java jp05.part02.PackageTest02          <== package ��� Application �� ������
	                                                                               ( classpath �� �ٽ��ѹ� ��������. )
*/
public class PackageTest02{
	
	///Field
	String str1 = "ȫ���";

	///main Method
	public static void main(String[] args){
		PackageTest02 pt = new PackageTest02();
		System.out.println(pt.str1);
	}//end of main

}//end of class

/*
	1. package : ���� Ư¡�� Ư���� ���� class ����
*/