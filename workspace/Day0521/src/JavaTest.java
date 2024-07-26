
class JavaTest {
	
	public static void main(String[] args) {
		// 1번째부터 5번째 까지 정거장을 호출
		Bus.printNum();
		System.out.println(Bus.GIGA);
		Bus bus1 = new Bus(1001);
		bus1.printFare(1, 5);
//		System.out.println(Bus.GIGA);
		
		
		Bus bus2 = new Bus(1002);
		bus2.printFare(2, 4);
		Bus.printNum();
		
	}

}
