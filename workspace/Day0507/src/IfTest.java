import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 나이 입력받기.
		System.out.print("정수 : ");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("1을 입력했다.");
		}
	}
}
