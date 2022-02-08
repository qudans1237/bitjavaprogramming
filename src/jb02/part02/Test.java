package jb02.part02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1번
		System.out.println("1~9를 입력하세요");
		int a = scanner.nextInt();

		System.out.println(a + "단을 출력합니다.");
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "x" + a + "=" + i * a);
		}
		System.out.println();

		System.out.println("\n==========================\n");
		// 2

		int x = 0, y = 0;
		int sum = 0;

		System.out.println("첫번째 수를 입력하세요");
		x = scanner.nextInt();
		System.out.println("두번째 수를 입력하세요");
		y = scanner.nextInt();

		if (x < y) {
			for (int i = x; i < y; i++)
				sum += i;
		} else if (x == y) {
			System.out.println("같은 수는 사이값이  존재하지 않습니다.");
		} else {
			for (int i = y; i < x; i++)
				sum += i;
		}

		if (sum == 0) {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("입력받은 " + x + " 와 " + y + "사이의 수의 " + "합은 " + sum + " 입니다.");
		}

		System.out.println("\n==========================\n");
		// 3번
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단을 출력 합니다.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
