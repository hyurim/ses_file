package objecttest;

public class EqualsTest {

	public static void main(String[] args) {
		int num = 9;
		
		if(num == 10) {
			System.out.println("true");
		}
		
		Human kim = new Human(29,"김상형");
		Human kim2 = kim;
		
		if(kim == kim2) {
			System.out.println("kim1, kim2는 같다");
		}
		Human hong = new Human(15, "홍길동");
		Human hong2 = new Human(15, "홍길동");
		
		if(hong == hong2) {
			System.out.println("같다");
		}
		
	}

}
