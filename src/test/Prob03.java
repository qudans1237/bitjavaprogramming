package test;

import java.util.Scanner;
public class Prob03 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���: ");
        int inputInt = keyboard.nextInt();

        int sum = 1; 
        for(int i = 1; i <= inputInt ;i++) { 
            if(inputInt < 2 || inputInt > 9) { 
                System.out.print("�߸��� ���ڰ� �ԷµǾ����ϴ�."); 
                break; 
            }//end of if
            sum = sum * i; 
            System.out.println(i + "! = " + sum); 
        }//end of for
    }//end of main
}//end of class