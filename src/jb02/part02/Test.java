package jb02.part02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1��
		System.out.println("1~9�� �Է��ϼ���");
		int a = scanner.nextInt();

		System.out.println(a + "���� ����մϴ�.");
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "x" + a + "=" + i * a);
		}
		System.out.println();

		System.out.println("\n==========================\n");
		// 2

		int x = 0, y = 0;
		int sum = 0;

		System.out.println("ù��° ���� �Է��ϼ���");
		x = scanner.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���");
		y = scanner.nextInt();

		if (x < y) {
			for (int i = x; i < y; i++)
				sum += i;
		} else if (x == y) {
			System.out.println("���� ���� ���̰���  �������� �ʽ��ϴ�.");
		} else {
			for (int i = y; i < x; i++)
				sum += i;
		}

		if (sum == 0) {
			System.out.println("���α׷��� �����մϴ�.");
		} else {
			System.out.println("�Է¹��� " + x + " �� " + y + "������ ���� " + "���� " + sum + " �Դϴ�.");
		}

		System.out.println("\n==========================\n");
		// 3��
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "���� ��� �մϴ�.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
