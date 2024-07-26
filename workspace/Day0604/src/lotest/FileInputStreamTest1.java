package lotest;

import java.io.FileInputStream;

public class FileInputStreamTest1 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("Test.bin");
		int size = fis.available();
		byte[] data = new byte[size];
		
		fis.read(data);
		fis.close();
		
		for(byte b : data) {
			System.out.print(b);
		}
	}

}
