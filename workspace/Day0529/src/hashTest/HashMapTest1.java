package hashTest;

import java.util.HashMap;

public class HashMapTest1 {

	public static void main(String[] args) {
		HashMap<String, Integer> snack = new HashMap<>();
		snack.put("오징어땅콩", 2500);
		snack.put("죠리퐁", 1900);
		snack.put("핫브레이크", 400);
		snack.put("빼뺴로", 900);
		
		String MySnack = "죠리퐁";
		System.out.println(MySnack + "의 가격은 " + snack.get(MySnack));
	}

}
