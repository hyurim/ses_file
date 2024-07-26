
public class CastTest {

	public static void main(String[] args) {
		int kor = 85;
		int eng = 92;
		int math = 76;
		
		int sum = kor + eng + math;
		double avg = (double) sum / 3;
		
		System.out.println("총점 : " + sum + " 평균 : " + avg);

	}

}
