package test;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~100 ������ �Ѱ����� �Է����ּ���");
		int score = scanner.nextInt();
		
		if(score<=59 && score >= 0) {
			System.out.println("�Է��Ͻ� �� "+score+"�� �����Դϴ�.");
		}else if(score>59 && score<=69) {
			System.out.println("�Է��Ͻ� �� "+score+"�� ���Դϴ�.");
		}else if(score>69 && score<=79) {
			System.out.println("�Է��Ͻ� �� "+score+"�� ���Դϴ�.");
		}else if(score>79 && score<=89) {
				System.out.println("�Է��Ͻ� �� "+score+"�� ���Դϴ�.");
		}else if(score>89 && score<=100) {
			System.out.println("�Է��Ͻ� �� "+score+"�� ���Դϴ�.");
		}else {
			System.out.println("��Ȯ�� ���� �Է����ּ���");
		}
	}
}
