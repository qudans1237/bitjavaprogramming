package test;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1~9�� �Է��ϼ���");
		int a = scanner.nextInt();
		
		System.out.println(a + "���� ����մϴ�.");
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "x" + a + "=" + i * a);
		}
		System.out.println();

		System.out.println("\n==========================\n");
	}
}
