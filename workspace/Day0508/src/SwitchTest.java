import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
//		double a = 10.0/4 ;
//		System.out.println(a);
		Scanner sc = new Scanner(System.in);

		System.out.print("나라를 입력하세요 : ");
		String a = sc.nextLine();
		
		switch(a) {
		case "Korea":
			System.out.println("한국");
			
		}
	}

}
