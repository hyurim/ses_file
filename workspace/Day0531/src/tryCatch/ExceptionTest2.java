package tryCatch;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int result = calcSum(100);
		System.out.println(result);
		

	}

	private static int calcSum(int num) {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

}
