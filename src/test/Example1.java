package test;

//import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("1~100 ������ �Ѱ����� �Է����ּ���");
//		int score = scanner.nextInt();
//		
//		if(score<=59 && score >= 0) {
//			System.out.println("�Է��Ͻ� �� "+score+"�� �����Դϴ�.");
//		}else if(score>59 && score<=69) {
//			System.out.println("�Է��Ͻ� �� "+score+"�� ���Դϴ�.");
//		}else if(score>69 && score<=79) {
//			System.out.println("�Է��Ͻ� �� "+score+"�� ���Դϴ�.");
//		}else if(score>79 && score<=89) {
//				System.out.println("�Է��Ͻ� �� "+score+"�� ���Դϴ�.");
//		}else if(score>89 && score<=100) {
//			System.out.println("�Է��Ͻ� �� "+score+"�� ���Դϴ�.");
//		}else {
//			System.out.println("��Ȯ�� ���� �Է����ּ���");
//		}
		
	
		int inputData = Integer.parseInt(args[0]);
		if(args.length !=1) {
			System.out.println("0~100 �� �Է�");
			return;
		}
		if(inputData>100 || inputData<0) {
			System.out.println("0~100 �� �Է�");
			return;
		}
		String grade = "��";
		switch(inputData/10) {
		case 10:
		case 9:
			break;
		case 8:
			grade="��";
			break;
		case 7:
			grade="��";
			break;
		case 6:
			grade="��";
			break;
		default:
			grade="��";
		}//end of switch
		System.out.print("�Է��Ͻ�"+inputData+"�� ������ "+grade+"�Դϴ�.");
	}//end of main
}//end of class
