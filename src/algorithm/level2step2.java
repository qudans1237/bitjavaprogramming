package algorithm;

public class level2step2 {
	public static void main(String[] args) {
		int score = 100;
		
		if(score >= 0 && score <=100) {
			// �Էµ� ������ �ùٸ� �����̹Ƿ�
			// ��� ����ϴ� if�� ����
			
			if (score <= 59) {
				System.out.println("F");
			} else if(score <=69) {
				System.out.println("D");
			} else if(score <=79) {
				System.out.println("C");
			} else if(score <= 89) {
				System.out.println("B");
			} else {
				System.out.println("A");
			}
			
		} else {
			// �Էµ� ������ �ùٸ��� ���� �����̹Ƿ�
			// ��� �޼����� ���
			System.out.println("�߸��� ������ �����Դϴ�.");
		}
	}
}
