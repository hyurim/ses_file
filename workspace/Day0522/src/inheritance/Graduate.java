package inheritance;

public class Graduate extends Student {

	String thesis;
	Graduate(int age, String name, int stNum, String major, String thesis) {
		super(age, name, stNum, major);
		this.thesis = thesis;
	}
	
	void research() {
		System.out.println("궁시렁 궁시렁. 뭘 연구해야 떼돈을 벌까?");
	}
	
}
