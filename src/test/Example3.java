package test;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("첫번째 수를 입력하세요");
		int x = scanner.nextInt();
		System.out.println("두번째 수를 입력하세요");
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
			System.out.println("입력받은 " + x + " 와 " + y + "사이의 수의 " + "합은 " + sum + " 입니다.");
		} else {
			System.out.println("같은 수는 사이값이  존재하지 않습니다.");
			System.out.println("프로그램을 종료합니다.");
		}
	}
}
// if (x < y) {
// for (int i = x; i < y; i++)
//		sum += i;
// } else if (x == y) {
// System.out.println("같은 수는 사이값이 존재하지 않습니다.");
// } else {
// for (int i = y; i < x; i++)
//		sum += i;
// }
//
// if (sum == 0) {
// System.out.println("프로그램을 종료합니다.");
// } else {
// System.out.println("입력받은 " + x + " 와 " + y + "사이의 수의 " + "합은 " + sum + "
// 입니다.");
// }
//
// System.out.println("\n==========================\n");
// }
