package Day08.part06;

/*
	FileName : PackageTest01.java
	1.  rt.jar, src.zip, API  ���� , Ȱ��
	2.  package , import  Keyword �� ����
	3.  FQCN :: �ϰ��� Ŭ�����̸� :: package �� ������ className
*/
public class PackageTest01{
	
	/// Field
	String name = "ȫ���";
	//java.lang.String add = "����";

	/// Mainn Method
	public static void main(String[] args){
		String name = new String("ȫ�浿");
		//java.lang.String job = new java.lang.String("����");

		//A a = new A();

	}//end of main
}//end of class

/*
	1. A a = new A() ==> compile error �߻� ������ ?
	
	2. String.class �� ���ڿ��� �߻�ȭ�� class
	    String �� class ��� ���������� 
	    String �� �ִ°�???  ���� compile error �߻����� �ʴ� ������(A a = new A() �� ��) ?
	    
	3. Java_Home\jre\lib\rt.jar  ���ο� java\lang\String.class�� Ȯ���ϰ�...
	
	5. Compiler �Ǵ� JVM�� rt.jar������ String.class�� ��� �ν��ϴ°� ?
	    (classpath �ǹ̸� �ٽ� �ѹ� Ȯ��)
	    
	6. classpath �� �ǹ̸� �����Ѵٸ�,  rt.jar������ java\lang\String.class�� ��� ã�ư��°�.
	    (==> package/import �� ������ ��)
	    (==> java.lang.String job = new java.lang.String("����")�� �ǹ̴� ???)
	    
	7. String.class ������ Field / Method �� ����� �ִ°�...
	    ( Java_Home\src.jar  ==?  API �� ��������...)
*/