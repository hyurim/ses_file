package interfacetest;

public class HandPhone {
	void call() {
		System.out.println("전화 걸기");
	}
	
	void receive() {
		System.out.println("전화 받기");
		// 상속받은 자식 클래스가 접근 범위를 좁히는건 안됨.
	}
	

}
