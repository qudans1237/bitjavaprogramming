package jb03.part08;

public class User03 {
	String name;
	int javaLevel;
	
	public User03() {
		System.out.println("���� ������");
		name = "ȫ�浿";
		javaLevel= 0;
	}
	public User03(String str) {
		System.out.println("���� String�� ���ڷ� �޾� name�� �ʱ�ȭ�ϴ� ������");
		name = str;
	}
	
	public User03(int i) {
		System.out.println("���� int�� ���ڷ� �޾� javaLevel�� �ʱ�ȭ�ϴ� ������");
		javaLevel = i;
	}
	
	public User03(String str,int i) {
		System.out.println("���� String,int�� ���ڷ� �޾� name,javaLevel�� �ʱ�ȭ�ϴ� ������");
		name = str;
		javaLevel = i;
	}
	
	public String getName() {
		return name;
	}
	public int getJavaLevel() {
		return javaLevel;
	}
	
	public static void main(String[] args) {
		System.out.println("============");
		User03 user01 = new User03();
		System.out.println("name: "+user01.getName());
		System.out.println("javaLevel: "+user01.getJavaLevel());
		
		System.out.println("==========");

		User03 user02 = new User03("ȫ���");
		System.out.println("name: "+user02.getName());
		System.out.println("javaLevel: "+user02.getJavaLevel());
		
		System.out.println("==========");
		User03 user03 = new User03(100);
		System.out.println("name: "+user03.getName());
		System.out.println("javaLevel: "+user03.getJavaLevel());
		
		System.out.println("===========");
		User03 user04 = new User03("�̼���",200);
		System.out.println("name: "+user04.getName());
		System.out.println("javaLever: "+user04.getJavaLevel());
	}
}








