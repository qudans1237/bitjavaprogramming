package algorithm;

import java.util.Scanner;

public class level3step2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ݺ��� Ƚ���� �Է����ּ���");
		int num = scanner.nextInt();
		int arr[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("ù��° ���� �Է����ּ���");
			int a = scanner.nextInt();
			System.out.println("�ι�° ���� �Է����ּ���");
			int b = scanner.nextInt();
			arr[i] = a+b;
		}
		
		for (int k : arr) {
			System.out.println(k);
		}
	}
}
