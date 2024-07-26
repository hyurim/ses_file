import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("카드가 있다면 1, 없다면 0을 입력해주세요 : ");
		int card = sc.nextInt();
		System.out.print("금액을 입력해주세요 : ");
		int money = sc.nextInt();
		
		System.out.println(card == 1 ? "탕수육을 주문했습니다." : "카드가 없습니다.");
		
		System.out.println(money >= 5000 ? "짬뽕을 주문했습니다." : "짜장면을 주문했습다.");
	}

}
