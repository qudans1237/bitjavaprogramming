package jb03.part05;

public class Developer1Test {
	public static void main(String[] args) {
		Developer1 developer = new Developer1();
		
		System.out.println("�̸���: "+developer.name);
		System.out.println("������: "+developer.job);
		System.out.println("��ռ�����: "+developer.avgIncome);
		System.out.println("PJT�����: "+developer.projectCareer);
			
		System.out.println("===============");
		
		developer.participateProject();
		System.out.println("��ռ�����: "+developer.avgIncome);
		System.out.println("project ���� �����: "+developer.projectCareer);
		
		System.out.println("\n=============");
		developer.instruct();
		System.out.println("��ռ�����: "+developer.avgIncome);
		
		System.out.println("\n=============");
		String projectName= "�ѹ�����";
		developer.participateProject(projectName);
		
		System.out.println("��ռ�����:" + developer.avgIncome);
		System.out.println("project���� �����: "+developer.projectCareer);
		
		System.out.println("\n=============");
		int lectureCount = 2;
		developer.instruct(lectureCount);
		System.out.println("��ռ�����: "+developer.avgIncome);
	}//end of main
}//end of class