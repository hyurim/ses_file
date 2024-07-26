package objecttest;

public class ToStringTest {

	public static void main(String[] args) {
		int i = 1234;
		System.out.println(i);
		
		Human kim = new Human(29, "김상형");
		System.out.println(kim);
		// objecttest.Human@5479e3f 이건 뭘까.
		
		Human hong = new Human(15, "홍길동");
		System.out.println(hong);
		
		int[] ar = {1,2,3};
		System.out.println(ar);
	}
	
}
