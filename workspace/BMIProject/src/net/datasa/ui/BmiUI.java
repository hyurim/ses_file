package net.datasa.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import net.datasa.service.BmiService;
import net.datasa.vo.Member;

public class BmiUI {
    Scanner sc = new Scanner(System.in);
    BmiService service = new BmiService();  // BmiService 객체 생성

    public BmiUI() {
        while (true) {
            menu();
            String choice = sc.next();
            switch (choice) {
                case "1":
                    insertMember();
                    break;
                case "2":
                    selectByCode();
                    break;
                case "3":
                    selectAll();
                    break;
                case "4":
                    updateMember();
                    break;
                case "5":
                	deleteMember();
                	break;
                case "0":
                    System.out.println(" * 프로그램 종료 ");
                    return;
                default:
                    System.out.println("* 메뉴에 있는 번호를 선택하세요.");
            }
        }
    }

    private void deleteMember() {
    	System.out.print("탈퇴할 회원의 코드: ");
    	int code = 0;
    	try {
    		code = sc.nextInt();
    		delete(code);
    	} catch (InputMismatchException e) {
    		System.out.println("* 코드는 정수로 입력하세요.");
    		sc.nextLine();
    		return;
    	}
	}

	private void delete(int code) {
        Member member = service.selectByCode(code);
        // 못찾은 경우
        if (member == null) {
            System.out.println("* 해당 코드의 회원이 존재하지 않습니다.");
            return;
        }
        System.out.print("* 정말 탈퇴하시겠습니까? (y/n) ");
        String deleteText = sc.next();
        if (deleteText.equals("y") || deleteText.equals("Y")) {
        	service.deleteByCode(code);
        } else {
        	System.out.println("탈퇴 처리가 취소되었습니다.");
        }
        
	}

	private void updateMember() {
        // 회원 수정
        System.out.println("< 회원 수정 >");
        System.out.print("회원 코드: ");
        int code = 0;
        try {
            code = sc.nextInt();
            update(code);
        } catch (InputMismatchException e) {
            System.out.println("* 코드는 정수로 입력하세요.");
            sc.nextLine();
        }
    }

    private void update(int code) {
        Member member = service.selectByCode(code);
        // 못찾은 경우
        if (member == null) {
            System.out.println("* 해당 코드의 회원이 존재하지 않습니다.");
            return;
        }
        System.out.print("새 키(cm): ");
        double newHeight = sc.nextDouble();
        System.out.print("새 몸무게(kg): ");
        double newWeight = sc.nextDouble();
        boolean success = service.updateByCode(code, newHeight, newWeight);
        System.out.println(success ? "* 회원 정보 수정 성공!" : "* 회원 정보 수정 실패!");
    }

	private void selectAll() {
		// 회원 전체 조회
    	System.out.println("< 회원 전체 조회 >");
    	ArrayList<Member> list = service.selectAll();
    	if(list.isEmpty()) {
    		System.out.println("* 회원이 존재하지 않습니다.");
    	}
		
	}

	private void selectByCode() {
    	// 회원 조회 1명
    	System.out.println("< 회원 조회 > ");
    	System.out.print("조회할 회원의 코드: ");
    	int code = 0;
    	try {
    		code = sc.nextInt();
    	} catch (InputMismatchException e) {
    		System.out.println("* 코드는 정수로 입력하세요.");
    		sc.nextLine();
    		return;
    	}
    	Member member = service.selectByCode(code);
    	// 못찾은 경우
    	if(member == null) {
    		System.out.println("* 해당 코드의 회원이 존재하지 않습니다.");
    		return;
    		}
    	System.out.println(member);
    	}
	
    private void insertMember() {
        // 멤버 등록
        System.out.println("< 회원 등록 >");
        System.out.print("이름 : ");
        String name = sc.next();
        double height = 0;
        double weight = 0;
        try {
        	System.out.print("키(cm) : ");
            height = sc.nextDouble();
            System.out.print("몸무게(kg) : ");
            weight = sc.nextDouble();
        } catch (InputMismatchException e) {
        	System.out.println("* 키나 몸무게는 숫자로 입력하세요.");
        	sc.nextLine();
        	return;
        }
        Member member = new Member(name, height, weight);
        service.insertMember(member);  // insertMember 메서드에 Member 객체 전달
        System.out.println("* 회원 등록 성공!");
    }
    
    private void menu() {
        System.out.println("<< 회원 관리 프로그램 >>");
        System.out.println("  1. 회원 등록");
        System.out.println("  2. 회원 조회(1명)");
        System.out.println("  3. 회원 전체 조회");
        System.out.println("  4. 회원 정보 수정");
        System.out.println("  5. 회원 탈퇴");
        System.out.println("  0. 프로그램 종료");
        System.out.println("=====================");
        System.out.print(">> ");
    }

    public static void main(String[] args) {
        new BmiUI();
    }
}
