package generic;

public class BoundTypeTest {

	public static void main(String[] args) {
		int result = max(4,5);
		System.out.println(result);
		
		String str = max("abc", "z");
		System.out.println(str);
		
		Human older = max(new Human(29, "김상형"), new Human(15, "홍길동"));
		System.out.println(older);
	}
	
	static < T extends Comparable<T>> T max(T a, T b) {
		if(a.compareTo(b) > 0 ) {
			return a;
		}
		else {
			return b;
		}
	}

}
