package test;

public class Prob11 {

	public static void main(String[] args) {

		int[] ia = new int[] { 3, 7, 1, 8, 10, 2, 15, 2, 10 };
		int[] ib = new int[] { 1, 2, 3, 4, 5 };
		int aodd = 0;
		int aeven = 0;
		int bodd = 0;
		int beven = 0;

		for (int i = 0; i < ia.length; i++) {
			if (ia[i] % 2 == 0) {
				aeven += ia[i];
			} else {
				aodd += ia[i];
			}
		}
		for (int i = 0; i < ib.length; i++) {
			if (ib[i] % 2 == 0) {
				beven += ib[i];
			} else {
				bodd += ib[i];
			}
		}

		System.out.println("(�迭ia)");
		System.out.println("Ȧ���� ��:  " + aodd);
		System.out.println("¦���� ��:  " + aeven);
		System.out.println("(�迭ib)");
		System.out.println("Ȧ���� ��:  " + bodd);
		System.out.println("¦���� ��:  " + beven);

	}
}