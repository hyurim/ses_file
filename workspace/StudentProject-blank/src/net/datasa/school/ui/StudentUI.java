package net.datasa.school.ui;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import net.datasa.school.service.StudentService;
import net.datasa.school.vo.Student;

public class StudentUI {
	Scanner sc = new Scanner(System.in);
	StudentService service = new StudentService();
	
	public StudentUI() {
		String choice;
		while(true) {
			menu();
			choice = sc.next();
			switch(choice) {
			case "1":
				studentAdd();
				break;
			case "2":
				selectByNum();
				break;
			case "3":
				selectAll();
				break;
			case "4":
				updateStudent();
				break;
			case "5":
				deleteStudent();
				break;
			case "0":
				System.out.println("* 프로그램 종료");
				return;
			default:
				System.out.println("* 메뉴에 있는 번호를 고르세요.");
			}
		}
	}

	// 학생 전학
	private void deleteStudent() {
		System.out.println("< 학생 전학 >");

        System.out.print("전학 갈 학생의 학번: ");
        int stdNum = 0;
        try {
            stdNum = sc.nextInt();
            delete(stdNum);
        } catch (InputMismatchException e) {
            System.out.println("* 학번은 정수로 입력하세요.");
            sc.nextLine();
            return;
        }
	}

	private void delete(int stdNum) {
    	Student student = service.selectByStdNum(stdNum);
    	System.out.println(student);
    	System.out.println("");
       	// 못찾은 경우
    	if (student == null) {
    		System.out.println("*해당 학번의 학생이 존재하지 않습니다.");
    		return;
    	}
        System.out.print("* 정말 학생 정보를 삭제하시겠습니까? (y/n) ");
        String deleteText = sc.next();
        if (deleteText.equals("y") || deleteText.equals("Y")) {
        	service.deleteByStdNum(stdNum);
        	System.out.println("학생 정보 삭제 완료!");
        } else {
        	System.out.println("전학 처리가 취소되었습니다.");
        }
	}
	// 학생 성적 수정
	private void updateStudent() {
		System.out.println("< 학생 성적 수정 >");
        System.out.print("수정할 학생의 학번: ");
        int stdNum = 0;
        try {
            stdNum = sc.nextInt();
            update(stdNum);
        } catch (InputMismatchException e) {
            System.out.println("* 학번은 정수로 입력하세요.");
            sc.nextLine();
            return;
        }
	}
	private void update(int stdNum) {

    	Student student = service.selectByStdNum(stdNum);
    	// 못찾은 경우
    	if (student == null) {
    		System.out.println("* 해당 학번의 학생이 존재하지 않습니다.");
    		return;
    	}
    	try {
    	System.out.println(student);
    	System.out.print("수정할 국어 점수: ");
        int newKor = sc.nextInt();
        System.out.print("수정할 영어 점수: ");
        int newEng = sc.nextInt();
        System.out.print("수정할 수학 점수: ");
        int newMath = sc.nextInt();
        boolean success = service.updateByStudent(stdNum, newKor, newEng, newMath);
        System.out.println(success ? "* 학생 성적 수정 성공!" : "* 학생 성적 수정 실패!");
    } catch (InputMismatchException e) {
    	System.out.println("* 점수는 숫자로 입력하세요.");
    	sc.nextLine();
    	return;
    }
        
	}

	// 학생 전체 조회
	private void selectAll() {
		System.out.println("< 학생 전체 조회 >");
		List<Student> list = service.selectAll();
		if(list.isEmpty()) {
			System.out.println("* 학생이 존재하지 않습니다.");
		}
		for(Student stdList : list) {
			System.out.println(stdList);
			System.out.println("");
		}
	}

	// 학생 정보 조회(1명)
	private void selectByNum() {
		System.out.println("< 학생 정보 조회(1명) >");
    	System.out.print("검색할 학생의 학번: ");
    	int stdNum = 0;
    	try {
    		stdNum = sc.nextInt();
    	} catch (InputMismatchException e) {
    		System.out.println("* 학번은 정수로 입력하세요.");
    		sc.nextLine();
    		return;
    	}
    	Student student = service.selectByStdNum(stdNum);
       	if(student == null) {
    		System.out.println("* 해당 학번의 학생이 존재하지 않습니다.");
    		return;
    		}
    	System.out.println(student);
	}

	// 학생 등록
	private void studentAdd() {
		System.out.println("< 학생 등록 >");
		System.out.print("이름: ");
		String name = sc.next();
		int kor = 0, eng = 0, math = 0;
		
        try {
        	System.out.print("국어 점수: ");
            kor = sc.nextInt();
            System.out.print("영어 점수: ");
            eng = sc.nextInt();
            System.out.print("수학 점수: ");
            math = sc.nextInt();
        } catch (InputMismatchException e) {
        	System.out.println("* 점수는 숫자로 입력하세요.");
        	sc.nextLine();
        	return;
        }
        Student student = new Student(name, kor, eng, math);
        service.insertStudent(student);
        System.out.println("* 학생 등록 성공!");
	}

	private void menu() {
		System.out.println("<< 학생 성적 관리 >>");
		System.out.println("  1. 학생 등록");
		System.out.println("  2. 학생 정보 조회(1명)");
		System.out.println("  3. 학생 전체 조회");
		System.out.println("  4. 학생 성적 수정");
		System.out.println("  5. 학생 전학");
		System.out.println("  0. 프로그램 종료");
		System.out.println("======================");
		System.out.print("  선택 > ");
	}
    public static void main(String[] args) {
        new StudentUI();
    }
}
