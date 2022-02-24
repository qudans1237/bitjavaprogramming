package test;

import java.util.Vector;

public class ArrayCopy {

	public Vector<String> moveToVector(String[] datas){
		Vector<String> vector = new Vector<String>(10,10);

		for(int i = 0 ; i<datas.length;i++) {
		vector.insertElementAt(datas[i],0);
		}
//		for(String datas : value )
//		System.out.println("입력 배열: \n"++"\n 리턴되는 Vector : "+vector);
		return vector;
	}
	
	public static void main(String args[]) {
		ArrayCopy ac = new ArrayCopy();
		String datas[] = {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
	}
}
