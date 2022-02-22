package jp02.part02;

public class ExceptionTest04 {
	
	private int sum;
	private int avg;
	
	public ExceptionTest04(){
	}
	
	public void sum(int x, int y) {
		System.out.println("1.==>sum 시작");
		sum = x + y;
		System.out.println("1.==>합:" + sum);
		System.out.println("1.==>sum 끝");
	}
	
	public void avg(int z) throws ArithmeticException{
		System.out.println("2.==> avg 시작");
		avg = sum /z ;
		System.out.println("2.==>평균: " + avg);
		System.out.println("2==> 끝");
	}
	
	public static void main(String[] args) {

		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
	
		ExceptionTest04 et = new ExceptionTest04();
		et.sum(i,j);
		
		try {
			et.avg(k);
		}catch(ArithmeticException e) {
			System.out.println("1.>>=================");
			System.out.println("z값이 0인 모양 입니다. 나누기 불가");
			System.out.println("2.>>=================");
			System.out.println(e);
			System.out.println("3.>>=================");
			e.printStackTrace();
			System.out.println("4.>>=================");
		}
		System.out.println("main Method End...");
	}
}
