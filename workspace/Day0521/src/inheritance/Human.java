package inheritance;

public class Human {
	String name;
	int age;
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	Human(float birth, String name){
		this(0,name);
		java.time.LocalDate now = java.time.LocalDate.now();
		this.age = now.getYear() - (int)birth + 1;
	}
	
	void intro() {
		System.out.println(age + "살 " + name + "입니다.");
	}
	
	void study() {
		System.out.println("공부한다.");
	}
}
