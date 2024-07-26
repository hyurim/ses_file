import java.util.*;

public class Practice2 {

	public static void main(String[] args) {
//		double a = 10.0/4 ;
//		System.out.println(a);
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		/*
		 * if (num % 2 == 0) {
            System.out.println("입력한 수 " + num + "은(는) 짝수입니다.");
        } else {
            System.out.println("입력한 수 " + num + "은(는) 홀수입니다.");
        }
		 */
		System.out.println((a % 2 == 0) ? "짝수입니다." : "홀수입니다.");
	}

}
