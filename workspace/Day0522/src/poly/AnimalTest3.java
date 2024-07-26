package poly;

public class AnimalTest3 {

	public static void main(String[] args) {
		// 다형성
		// 상속관계 있을 때 나타남.
		// 부모타입 변수명 = new 자식타입();
		// 업캐스팅은 항상 ok
		// 다운 캐스팅은 원칙적으로 쓸 이유가 없으나 instanceof와 함께
		
		Dog happy = new Dog();
		testAnimal(happy);
		Dove dove = new Dove();
		testAnimal(dove);

	}

	private static void testAnimal(Animal animal) {
		animal.move();
		
		if (animal instanceof Dog) {
			Dog mydog = (Dog)animal;
			mydog.bark();
		}
		if(animal instanceof Dove) {
			Dove dove = (Dove)animal;
			dove.fly();
		}
	}
}
