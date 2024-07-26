class JavaTest {
	public static void main(String[] args) {
		Car korando = new Car("코란도", true);
		System.out.println(korando.name + " : " + Car.carNum);
		
		Car equus = new Car("에쿠스", false);
		System.out.println(equus.name + " : " + Car.carNum);
		
		Car pride = new Car("프라이드", false);
		System.out.println(pride.name + " : " + Car.carNum);
		
	}
}