package test;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� ������ �Է����ּ���");
		int a = scanner.nextInt();
		System.out.println("�ι�° ���ڸ� ������ �Է����ּ���");
		int b = scanner.nextInt();

		if (a % 2 == 0) {
			if (a % 3 != 0) {
				System.out.println("�Է��Ͻ� 1��° ���ڰ�" + a + "�� ¦���̸�, 3�� ����� �ƴմϴ�.");
			} else {
				System.out.println("�Է��Ͻ� 1��° ���ڰ�" + a + "�� ¦���̸�, 3�� ����� �½��ϴ�.");
			}
		} else {
			if (a % 3 != 0) {
				System.out.println("�Է��Ͻ� 1��° ���ڰ�" + a + "�� Ȧ���̸�, 3�� ����� �ƴմϴ�.");
			} else {
				System.out.println("�Է��Ͻ� 1��° ���ڰ�" + a + "�� Ȧ���̸�, 3�� ����� �½��ϴ�.");
			}
		}
		if (b % 2 == 0) {
			if (b / 3 != 0) {
				System.out.println("�Է��Ͻ� 2��° ���ڰ�" + b + "�� ¦���̸�, 3�� ����� �ƴմϴ�.");
			} else {
				System.out.println("�Է��Ͻ� 2��° ���ڰ�" + b + "�� ¦���̸�, 3�� ����� �½��ϴ�.");
			}
		} else {
			if (b / 3 != 0) {
				System.out.println("�Է��Ͻ� 2��° ���ڰ�" + b + "�� Ȧ���̸�, 3�� ����� �ƴմϴ�.");
			} else {
				System.out.println("�Է��Ͻ� 2��° ���ڰ�" + b + "�� Ȧ���̸�, 3�� ����� �½��ϴ�.");
			}
		}
	}
}
