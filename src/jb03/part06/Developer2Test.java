package jb03.part06;

public class Developer2Test {
	
	public static void main(String[] args) {
		
		Developer2 developer = new Developer2();
		
		System.out.println("�̸���: "+developer.name);
		System.out.println("������: "+developer.job);
		System.out.println("��ռ�����: "+developer.avgIncome);
		System.out.println("PJT�����: "+developer.projectCareer);
		
		System.out.println("\n=====================");
		
		String name = developer.getName();
		String job  = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		System.out.println("�̸���: "+name);
		System.out.println("������: "+job);
		System.out.println("��ռ�����: "+avgIncome);
		System.out.println("��ռ�����: "+developer.getProjectCareer());
	}//end of main
}//end of class
