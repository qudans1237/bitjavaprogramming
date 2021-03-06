package jb01.part05;

//package jb01.part05;

public class CastingTest {
	public static void main(String[] args) {
		byte b1 = 100;
		byte b2 = 20;
		
		//==> compile error 발생(확인요망)
		//==> 정수형의 계산은 int return 
		// 모든 정수의 계산은 int로 된다 b1+b2 ==> int 로 변경 후 계산 (자연스럽게 데이터타입이 바뀌는 현상 : 묵시적 형변환)
		//byte b3 = b1+b2;
		
		//casting 연산자를 이용한 형변환 ==> 강제로 데이터 타입을 바꾸는 것 : 명시적 형변환 
		byte b4 = (byte)(b1+b2);
		System.out.println("b4(b1+b2): " +b4);
		
		byte b5 = (byte)(b4+b1);
		//쓰레기값 출력(==>실행시 출력결과 확인 할 것)
		System.out.println("b5(b1+b4): "+b5);
		
		//==>묵시적 형변환
		int i1 = b1+b2;
		System.out.println(i1);
		int i2 = b1+b4;
		System.out.println(i2);
		
		//다른 data type 연산 ==> data type 이 큰쪽으로 묵시적 형변환
		double test01 = 100 + 0.5;
		System.out.println(test01);
		//==> compile error 발생(확인요망)
		//int test02 = 100 + 0.5;
		
		// 실수를 정수형에 대입하면 결과는 ==> ??
		int i3 = 201/2;
		System.out.println("i3(201/2): "+i3);

		// 정수의 계산을 실수형에 대입시 결과는 ===>??
		double d1 = 201/2;
		System.out.println("d1(201/2): "+d1);
		
		//정수 int DataType201을 실수 double Data Type 으로 명시적 형변환 후
		//계산 결과를 double Data Type 으로 받으면 출력 결과는 ==??
		double d2 = (double)201/2;
		System.out.println("d2(201/2): "+d2);
	}
}

