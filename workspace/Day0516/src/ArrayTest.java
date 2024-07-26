import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학급 인원 : ");
		int stdNum = sc.nextInt();
		int []student = new int[stdNum];
		
		for(int i = 0; i < student.length; i++) {
			System.out.print((i+1) + "번 학생의 등급 : ");
			student[i] = sc.nextInt();
		}
		
		String[] message = { "",
				"1 성적",
				"2 성적",
				"3 성적",
				"4 성적",
				"5 성적",
		};
		for(int rank : student) {
			System.out.println(message[rank]);
		}
	}

}
