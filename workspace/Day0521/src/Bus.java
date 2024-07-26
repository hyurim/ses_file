
public class Bus {
	static final long GIGA = 10000000000L;
	final int BUS_OF_NUMBER;
	boolean gasoline;
	static int busNum;
	static Station[] arInfo;
	
	public Bus(int busOfNumber) {
		this.BUS_OF_NUMBER = busOfNumber;
	}
	
	// arInfo 배열에 정거랑 이름 / 누적 거리 / 요금을 입력함. 출발점은 경희대학교.
	static {
		arInfo = new Station[7];
		arInfo[0] = new Station("경희대학교", 0, 0);
		arInfo[1] = new Station("청량리", 4, 200);
		arInfo[2] = new Station("제기동", 7, 100);
		arInfo[3] = new Station("답십리", 12, 200);
		arInfo[4] = new Station("금호동", 16, 200);
		arInfo[5] = new Station("옥수", 18, 150);
		arInfo[6] = new Station("압구정" , 23, 300);
	}
	
	static void printNum() { 
		busNum++;
		System.out.println(Bus.busNum);
//		printFare(1,5);
		method1();
	}
	// 정적 메서드는 일반 메서드로 호출할 수 없음.
	static void method1() {
		System.out.println("정적 메서드");
	}

	// 기본 요금은 500원을 시작으로 거리마다 금액을 추가로 더하고 시작 정거장과 종료 정거장을 출력 후 요금도 같이 출력.
	void printFare(int from, int to) {
		int fare = 500;
		for(int i = from; i <= to; i++) {
			fare += arInfo[i].fare;
		}
		System.out.println(arInfo[from].name + " ~ " + arInfo[to].name + "까지의 요금은 " + fare + "원입니다.");
	}
}