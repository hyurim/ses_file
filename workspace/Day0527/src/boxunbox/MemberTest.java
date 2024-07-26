package boxunbox;

public class MemberTest {

	public static void main(String[] args) {
		System.out.printf("int 타입의 크기 = %d, 최솟값 = %d, 최댓값 = %d\n",
				Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(333));
		
		Double d = 1234.11;
		System.out.println(d.isNaN());
	}

}