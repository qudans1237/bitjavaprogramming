package jb04.part07;

public class Father {
	
	public String name = "ȫ�浿";
	protected String bank = "�Ѿ�����";
	String branch = "���ﵿ����";
	private int password = 1234;
	
	public Father() {
	}
	
	public String getBank(int pwd) {
		if(pwd != 7777) {
			return "Ket���� ��Ȯ�� �Է��ϼ���.";
		}else {
			return this.bank;
		}
	}
	public int getPassword(int key) {
		if(key != 7777) {
			return 0;
		}else {
			return this.password;
		}
	}
	public String getName() {
		return name;
	}
	public String getBranch() {
		return branch;
	}
}