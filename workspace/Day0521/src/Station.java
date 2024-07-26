
class Station {
	String name; // 정거장 이름
	int distance; // 누적 거리
	int fare; // 구간 요금
	
	//	this를 사용함으로써 클래스의 인스턴스 변수에 생성자 매개변수의 값을 할당
	// 위에서 정의한 타입 값을 바탕으로 입력받은 값을 this.name / distance / fare에 대입.
	// this를 사용하여 생성자의 매개변수 값을 클래스의 인스턴스 변수에 대입합니다.
	Station (String name, int distance, int fare){
		this.name = name;
		this.distance = distance;
		this.fare = fare;
	}
}
