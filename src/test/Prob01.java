package test;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("2~9�� �Է��ϼ���");
		int a = scanner.nextInt();
		if (a > 1 && a < 10) {
			System.out.println(a + "���� ����մϴ�.");
			for (int i = 1; i < 10; i++) {
				System.out.println(i + "x" + a + "=" + i * a);
			}
			System.out.println("\n==========================\n");
		}else {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.\n2~9���� ���ڸ� �Է��ϼ���");
		}
	}
}