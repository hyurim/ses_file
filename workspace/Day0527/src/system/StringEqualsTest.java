package system;

public class StringEqualsTest {

	public static void main(String[] args) {
		String str1 = "KOREA";
		String str2 = "korea";
		
		System.out.println((str1.equals(str2) ? "같다. " : "다르다."));
		System.out.println((str1.equalsIgnoreCase(str2) ? "같다. " : "다르다."));

	}

}
