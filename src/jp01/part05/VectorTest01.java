package jp01.part05;

import java.util.*;

public class VectorTest01 {
	public static void main(String[] args) {
		
		Vector vector = new Vector(10,10);
		
		String s1 = new String("1.ȫ");
		vector.add(s1);
		vector.add(new String("2.��"));
		vector.add("3.�� �ȳ��ϼ���");
		
		for(int i=0; i<vector.size(); i++) {
			Object obj = vector.elementAt(i);
			String s = (String)obj;
			//Stirng s = (Stirng)vector.elementAt(i);
			System.out.print(s);;
			//System.out.print((String)vector.elementAt(i));
		}
		
		System.out.println("\n ==> API Ȯ��");
		vector.insertElementAt("4.��", 1);
		for(int i = 0; i<vector.size();i++) {
			System.out.print((String)vector.elementAt(i));
		}
		
		System.out.println("\n ==> API Ȯ��");
		vector.setElementAt("5.ȫ���", 3);
		for(int i = 0; i<vector.size();i++) {
			System.out.print((String)vector.elementAt(i));
		}
		
		System.out.println("\n ==> API Ȯ��");
		vector.removeElementAt(3);
		for(int i = 0; i<vector.size();i++) {
			System.out.print((String)vector.elementAt(i));
		}
		
	}
}
