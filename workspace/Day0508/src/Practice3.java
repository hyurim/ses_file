import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
        double result = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("사칙연산을 입력하세요. (+, -, *, /): ");
            String tool = sc.next();

            System.out.print("첫 번째 숫자를 입력하세요. : ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요. : ");
            int num2 = sc.nextInt();

            switch (tool) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = (double) num1 / num2;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                        return;
                    }
                    break;
                default:
                    System.out.println("올바른 연산 기호를 입력하세요.");
                    return;
            }
            System.out.println("결과: " + result);
        }
    }
}
