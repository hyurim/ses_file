package tryCatch;

public class ExceptionTest1 {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		int c = 0;
		try {
			c = a / b;
			
		} catch (ArithmeticException e){
			System.out.println("0으로 나눌 수 없다.");
		}
		System.out.println(c);
		
		System.out.println("프로그램 종료");
	}

}
