package Day08.part04;

/*
	FileName : OverRidingTest.java
	1. Method OverLoading 	
		: 1���� class ���� Method  Ȱ�� :: Polymorphism 
	2. Method OverRiding 
		: class ��  ���迡���� Method Ȱ�� :: Polymorphism 
		: ���� Method ������( ���� class �뵵�� �µ���...)
*/
class FatherGeneration{
  ///Field
  ///Constructor
  public FatherGeneration(){  
  }
  ///Method
  public void returnHomeTimeRule(){
    System.out.println("���� 10�� �Ͱ�");
  }
  public void getUpTime(){
    System.out.println("���� 6�ñ��");
  }
}//end of class


class SonGeneration extends FatherGeneration{
  ///Field
  ///Constructor
  public SonGeneration(){
  }
  ///Method
  //����� �����鼭 ������ ������ method �� ������ ( Method OverRiding )
  public void returnHomeTimeRule(){
    System.out.println("�ڱⰡ �˾Ƽ� å������.");
  }
}//end of class


public class OverRidingTest{
   ///Main Method
  public static void main(String[] args){
    SonGeneration sg = new SonGeneration();
   //==> ��°��Ȯ�� ( ����Ŭ������ Method �Ǵ� ����Ŭ������ Method �ΰ�...)
    sg.getUpTime();
    sg.returnHomeTimeRule();
  }//end of main
}//end of class