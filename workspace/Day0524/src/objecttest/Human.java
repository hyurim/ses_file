package objecttest;

public class Human {
	int age;
	String name;
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Human other) {
			// Human other = (Human)obj;
			//나이가 같고 이름이 같으면 동일 인물
			if (age == other.age && name.equals(other.name)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return age + "세의" + name;
	}
}
