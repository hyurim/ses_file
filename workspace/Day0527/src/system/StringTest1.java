package system;

public class StringTest1 {

	public static void main(String[] args) {
		String str = new String("아름다운");
		System.out.println(str);
		
		String str2 = "우리나라";
		System.out.println(str2);
		
		char[] ar = {'K', 'o', 'r', 'e', 'a'};
		System.out.println(ar.length);
		
		String str3 = new String(ar);
		System.out.println(str3);
		
		System.out.println(str3.length());
	}

}
