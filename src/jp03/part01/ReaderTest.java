package jp03.part01;

import java.io.*;

public class ReaderTest {
	
	public static void main(String args[]) {
		
		try {
			InputStream inputStream = System.in;
			
			Reader reader = new InputStreamReader(inputStream);
			
			System.out.println("�Է��� ��ٸ��ϴ�...");
			
			while(true) {
				int i = reader.read();
				char c = (char)i;
				
				System.out.println("�Է��Ͻ� ��: "+c);
				
				if(c=='x') {
					inputStream.close();
					break;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}