package test;

//import java.util.Scanner;
public class Prob02 {
    public static void main(String[] args) {
		
		//limit������ ���� ����
		int limit = 50;
		//prime�� ������ ����
		boolean prime = false;
		
		//
		for (int i = 2; i < limit; i++){
			prime = true;

			for (int j = 1; j <= i; j++){
				if(i % j == 0){
					prime = false;
					break;
				}
			}
			if(prime){
				System.out.println(i);
			}
		}

		/*
		boolean�� true�϶� ���� �Է¹޾� �ڵ� �ۼ��غ�

		System.out.print("���ڸ� �Է����ּ���: ");
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

		//��������̹Ƿ� 2�� �־���
		int i = 2;
        boolean Prime = true;

	    while (i <= inputNum) {
		    Prime = true;

            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    Prime = false;
                }
                continue;
		    }
		    if (Prime == true){
                System.out.println(i);
            }
		i++;
	    }
		*/

    }//end of main
}//end of class