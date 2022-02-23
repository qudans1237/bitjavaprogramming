package jp03.part02;

import java.io.*;

public class WriterTest {
	public static void main(String[] args) {
		
		try{
			InputStream inputStream = System.in;
			
			Reader reader = new InputStreamReader(inputStream);
			
			OutputStream outputStream = System.out;
			
			Writer writer = new OutputStreamWriter(outputStream);
			
			System.out.println("�Է��� ��ٸ��ϴ�...");
			
			while(true) {
				int i = reader.read();
				writer.write(i);
				writer.flush();
				
				if((char)i =='x') {
					break;
				}
			}
			
			reader.close();
			writer.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
