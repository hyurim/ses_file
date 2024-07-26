package utility_string;

public class SubStringTest {

	public static void main(String[] args) {
		String str = "0123456789";
		
		System.out.println(str.substring(3,7));
		
		System.out.println(str.substring(5,9));
		
		String name = "제 이름은 <김한결>입니다.";
		
		int st, ed;
		st = name.indexOf("<");
		ed = name.indexOf(">");
		
		System.out.println(name.substring(st+1,ed));

	}

}
