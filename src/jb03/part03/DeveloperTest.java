package jb03.part03;

public class DeveloperTest {
	public static void main(String[] args) {
		
		Developer developer = new Developer();
		
		System.out.println("�̸�: "+developer.name);
		System.out.println("����: "+developer.job);
		System.out.println("��ռ�����: "+developer.avgIncome);
		System.out.println("PJT�����: "+developer.projectCareer);
		
		System.out.println("=============");
		
		developer.participateProject();
		System.out.println("��ռ�����: "+developer.avgIncome);
		System.out.println("project ���� �����: "+developer.projectCareer);
		
		developer.instruct();
		System.out.println("��ռ�����: "+developer.avgIncome);
	}//end of main
}//end of class