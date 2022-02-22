package jp01.part01;

/*
   FileName : ObjectTest.java
   
     1.  equals() method  ����
     2.  equals() Method  �ʿ伺 
      �� instance ��(�ĺ�����) ==> false
      �� ���¸� ���ϰ� �ʹٸ� ==> �̸�(��������)�� ������ ��� true �� ���� ��������
     3. equeals(Object obj) ==> ���ڷ� Object Data Type  �޴´ٴ� �ǹ̴� ?
                                                       ( Object obj = new JavaAllClass() �� �ٽ��ѹ� ����)  
     3. ObjectTest.java�� ����...
         : Method OverRidng, this, ������, �����, �������� OOP�� OOPL�� ���� Ȯ��
*/
class B{
	
    ///Field
    int no;
    String name;
    
    ///Constructor
    public B(){
    }
    public B(int no,String name){
      this.no = no;
      this.name = name;
    }
    
    ///method
	public String toString(){		
      return "no : "+no+" name : " +name+" �� A class �Դϴ�.";
    }

	//�Ʒ��� �ּ��� ó���ϰ�, �ּ��� Ǯ�� ����� Ȯ��
	//==> equals(Object obj)�� �ǹ̸� �ٽ��ѹ� ����
	
	public boolean equals(Object obj){
		boolean equal = ( this.no == ( (B)obj ).no );
		return equal;
	}
	
}//end of class


public class ObjectTest{
	
	///main method
	public static void main(String[] args){
		B b1 = new B(1,"ȫ�浿");
		B b2 = new B(1,"ȫ�浿");

        //equals / ==�� �ǹ�����
        System.out.println("b1,b2�� ���� ��ü �ΰ�");
		System.out.println("b1==b2() : "+ (b1==b2));
        System.out.println("b1,b2�� ���� equals�� �ΰ�");
		System.out.println("b1.equals(b2) : "+b1.equals(b2));
		
		System.out.println("========================");

        //�������� ��������.
		b1 = b2;
        System.out.println("b1,b2�� ���� ��ü �ΰ�");
		System.out.println("b1==b2() : "+ (b1==b2));
        System.out.println("b1,b2�� ���� equals�� �ΰ�");
		System.out.println("b1.equals(b2) : "+b1.equals(b2));
	}//end of main
	
}//end of class