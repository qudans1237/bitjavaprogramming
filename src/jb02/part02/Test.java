package jb02.part02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1��
//		System.out.println("1~9�� �Է��ϼ���");
//		int a = scanner.nextInt();
//
//		System.out.println(a + "���� ����մϴ�.");
//		for (int i = 1; i < 10; i++) {
//			System.out.println(i + "x" + a + "=" + i * a);
//		}
//		System.out.println();
//
//		System.out.println("\n==========================\n");
		// 2



		System.out.println("ù��° ���� �Է��ϼ���");
		int x = scanner.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���");
		int y = scanner.nextInt();
		int sum = 0;
		int change = 0;
		
		if (x > y) {
			change = x;
			x = y;
			y = change;
		}
		if (x < y) {
			for (int i = x; i < y; i++)
				sum += i;
			System.out.println("�Է¹��� " + x + " �� " + y + "������ ���� " + "���� " + sum + " �Դϴ�.");
		} else {
			System.out.println("���� ���� ���̰���  �������� �ʽ��ϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
}
//if (x < y) {
//for (int i = x; i < y; i++)
//	sum += i;
//} else if (x == y) {
//System.out.println("���� ���� ���̰���  �������� �ʽ��ϴ�.");
//} else {
//for (int i = y; i < x; i++)
//	sum += i;
//}
//
//if (sum == 0) {
//System.out.println("���α׷��� �����մϴ�.");
//} else {
//System.out.println("�Է¹��� " + x + " �� " + y + "������ ���� " + "���� " + sum + " �Դϴ�.");
//}
//
//System.out.println("\n==========================\n");
//}
