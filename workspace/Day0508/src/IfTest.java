import java.util.*;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 나이 입력받기.
		System.out.print("첫 번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		System.out.print("셋 번째 정수 : ");
		int c = sc.nextInt();
		
		/* 
		 * if (a > b && a > c) {
    System.out.println("a가 가장 큽니다.");
} else if (b > a && b > c) {
    System.out.println("b가 가장 큽니다.");
} else {
    System.out.println("c가 가장 큽니다.");
}
		 */
		/*
		 * int[] numbers = {a, b, c};
Arrays.sort(numbers);
int max = numbers[numbers.length - 1];
System.out.println("가장 큰 수는: " + max);
		 */
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("가장 큰 수는: " + max);
		
	}
}