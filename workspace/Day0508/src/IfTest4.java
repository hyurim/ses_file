import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println(age >= 19 ? "성인입니다." : "미성년자입니다." );

	}

}
