package tryCatch;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) throws Exception {
/*
		String name = null;
		printScore(name);

	}

	private static void printScore(String name) {
		try {
		System.out.println(name.length());
		} catch(NullPointerException e) {
			System.out.println("이름이 무효합니다.");
		}
		*/
/*		
		String name = null;
		try {
			printScore(name);
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void printScore(String name) throws NullPointerException {
		if (name == null) {
			throw new NullPointerException("이름이 무효합니다.");
		}
		System.out.println(name.length());
*/
	/*
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		printScore(name);
	}

	private static void printScore(String name) throws Exception{
		if (name == null) {
			throw new NullPointerException("이름이 무효합니다.");
		}
		System.out.println(name.length());
	*/
		/*
		System.out.println("이름 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		try {
			printScore(name);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void printScore(String name) {
		if (name == null || name.equals("")) {
			throw new NullPointerException("이름이 무효합니다.");
		}
		System.out.println(name.length());
		*/
		String name = null;
		while(true) {
			System.out.println("이름 : ");
			Scanner sc = new Scanner(System.in);
			if(name.equals("")) {
				System.out.println(" * 이름을 입력하세요.");
			}
			else {
				break;
			}
			try {
				printScore(name);
			}
			catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
		}
			
		}
		private static void printScore(String name) {
			if (name == null || name.equals("")) {
				throw new NullPointerException("이름이 무효합니다.");
			}
			System.out.println(name.length());
		
	}

		

}
