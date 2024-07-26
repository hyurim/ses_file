package generic;

public class Human implements Comparable<Human> {
	int myCode;
	int age;
	String name;
	int donate;
	static int code = 100; 
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
		this.donate = donate;
		this.myCode = ++code;
	}
	
	public Human(int age, String name, int conate) {
		this.age = age;
		this.name = name;
		this.donate = donate;
		this.myCode = ++code;
	}

	@Override
	public String toString() {
		return "나이는 " + age + "살이고, 이름은 " + name + "이고, 기부금은 " + donate + "원";
	}

	@Override
	public int compareTo(Human other) {
		if(this.age > other.age) {
			return 1;
		} 
		else if(this.age == other.age) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	
}
