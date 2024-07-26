package poly;

public class JavaTest {
	public static void main(String[] args) {
		// 좌우의 타입이 맞는 경우 
		Animal animal = new Animal();
		animal.move();
		
		Animal dog = new Dog();
		dog.move();
		
		// 업 캐스팅 (자식 클래스를 부모 클래스 타입으로 변환)
		Animal up = (Animal)dog;
		up.move();
		
		// 다운 캐스팅(부모 클래스를 자식클래스 타입으로 변환)
		Dog down = (Dog)animal;
		down.move();
		down.bark();
		
//		Dove dove = new Animal();
//		dove.fly();
	}
}
