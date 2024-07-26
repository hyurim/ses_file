package lotest;

import java.io.FileInputStream;

public class FileInputStreamTest2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("Test.bin");
		
		int data = 0;
		
		while(true) {
			data = fis.read();
			if(data == -1) break;
			System.out.print(data);
		}
	}

}
