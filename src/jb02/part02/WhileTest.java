package jb02.part02;

public class WhileTest {
	public static void main(String[] args) {
		int i = 0;
		while(i<10) {
			System.out.println("����� while�� ���ξ��� i = " +i);
			i++;
		}
		
		int j = 0;
		do {
			System.out.println("\n\t ����� do�� ������ j= "+j);
			j++;
		} while(j<1);
		System.out.println("\n====================\n");
		
		int k=1;
		while(k<10) {
			System.out.println("5* "+k+"="+5*k);
		}
		
		while(true) {
			System.out.println("����� �ݺ��������� ���� ����");
		}
	}
}