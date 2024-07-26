
public class Car {
	String name;
	boolean gasoline;
	static int carNum; // 차 출고 대 수;
	
	// 명시적으로 초기화가 어려운 복잡한 정보라면 static {} 형태의 정적 초기화 블록을 사용해도 동일한 효과가 나타난다. 
	static {
		carNum = 1000;
	}
	
	
	public Car(String name, boolean gasoline) {
		this.name = name;
		this.gasoline = gasoline;
		carNum++;
		// 생성자가 단 하나도 없으면 디파일러를 만들어 줌.
	}
	
	void run() {
		System.out.println(gasoline ? "부릉부릉" : "덜컹덜컹");
	}
	
	void stop() {
		System.out.println("끼이익");
	}
}
