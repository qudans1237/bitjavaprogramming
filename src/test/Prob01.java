package test;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("2~9를 입력하세요");
		int a = scanner.nextInt();
		if (a > 1 && a < 10) {
			System.out.println(a + "단을 출력합니다.");
			for (int i = 1; i < 10; i++) {
				System.out.println(i + "x" + a + "=" + i * a);
			}
			System.out.println("\n==========================\n");
		}else {
			System.out.println("잘못된 숫자가 입력되었습니다.\n2~9사이 숫자를 입력하세요");
		}
	}
}