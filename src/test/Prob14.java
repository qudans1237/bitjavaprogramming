package test;

public class Prob14 {
	public Prob14() {
	}
	
	public static void printGugudan(int no) {
		if(no<1||no>9) {
			System.out.println("1 �̻� 9 ������ ���� �Է��ϼž� �մϴ�.");
		}else {
			for(int i= 1; i<10; i++) {
				for(int j=1; j<=no; j++) {
					System.out.print(j + "*" + i + "=" + j*i+"\t");
					
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("�־��� ���ڱ����� �������� ����ϴ�.");
		System.out.println("---------- Sample 1 -----------");
		printGugudan(4);
		
		System.out.println("---------- Sample 2 -----------");
		printGugudan(9);
		
		System.out.println("---------- Sample 3 -----------");
		printGugudan(-1);
		
		System.out.println("---------- Sample 1 -----------");
		printGugudan(10);
	}
	
}
