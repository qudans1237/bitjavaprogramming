package test;

public class Account {

	String accNo;
	int balance;
	
	public Account(){
	}
	
	public Account(String str){
		accNo=str;
		System.out.println(accNo+"���°� �����Ǿ����ϴ�.");
	}
	
	public String getAccNo(){
	
		return accNo;
	} 
	
	public int getBalance(){ 
	
		return balance;
	}
	
	public void save(int i){
		balance+=i;
		System.out.println(accNo+"���¿� "+i+"������ �ԱݵǾ����ϴ�.");
	}
	
	public void deposit(int j){ 
		balance-=j;
		System.out.println(accNo+"������ "+j+"������ ��ݵǾ����ϴ�.");
	}



	public static void main(String[] args) throws Exception{
		
		String accNo;
		int balance;
		
		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo + "������ �ܰ�� "+ balance + "�����Դϴ�.");
		
		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accObj.getAccNo()+"������ �ܰ�"+ balance+"�����Դϴ�.");
		
		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo+"������ �ܰ�"+ balance+"�����Դϴ�.");
	}
}


