package test;

public class Prob10 {
	public void printSeason(int month) {

		if (month < 0 || month > 12) {
			System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
			return;
		} else {
			String season;
			switch (month) {
			case 3:
			case 4:
			case 5:
				season = "��";
				break;
			case 6:
			case 7:
			case 8:
				season = "����";
				break;
			case 9:
			case 10:
			case 11:
				season = "����";
				break;
			default:
				season = "�ܿ�";
			}
			System.out.println(season+"�� �¾�̳׿�");
		}
	}

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		new Prob10().printSeason(month);
	}
}
