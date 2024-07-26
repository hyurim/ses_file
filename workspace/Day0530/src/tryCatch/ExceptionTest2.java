package tryCatch;

public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
		

	}

}
