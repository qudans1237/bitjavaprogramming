package algorithm;

public class level3step3 {
	public static void main(String[] args) {
		int n = 10000;
		int sum = 0;
		
		if(n>=1 && n<=10000) {
			for(int i =1; i<n;i++) {
				sum +=i;
			}
			System.out.println(sum);
		}else {
			System.out.println("��Ȯ�� ���� �Է��ϼ���");
		}
	}
}
