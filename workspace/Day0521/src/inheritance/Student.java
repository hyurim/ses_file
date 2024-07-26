package inheritance;

public class Student extends Human {
	int stNum;
	String major;
	
	Student(int age, String name, int stNum, String major) {
		super(age, name);
		this.stNum = stNum;
		this.major = major;
	}
	void study() {
		System.out.println("하늘천 따지 검을현 누를황");
	}

}
