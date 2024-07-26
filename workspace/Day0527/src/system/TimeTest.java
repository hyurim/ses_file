package system;

public class TimeTest {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 1000000; i++) {
			System.out.println(i + " 번째 줄");
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println((end - start) / 1000.0);

	}

}
