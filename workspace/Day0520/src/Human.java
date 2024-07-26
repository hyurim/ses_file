
public class Human {		
		int age;
		String name;
		
		public Human() {
			System.out.println("Human의 기본 생성자");
		}
		public Human(int age, String name) {
			this(); // 생성자 호
			this.age = age;
			this.name = name;
		}
	
	void intro() {
		System.out.println("안녕. " + age + "살 " + name + "입니다.");
	}

}
