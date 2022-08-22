package edu.kh.objectarray.view;

import java.util.Scanner;

import edu.kh.objectarray.model.service.StudentManagementService;

// 화면 제공용 클래스(입/출력)
public class StudentManagementView {
	
	// 필드 == 멤버변수
	private Scanner sc = new Scanner(System.in);
	
	private StudentManagementService service = new StudentManagementService();
	
	// alt + shift + j : 툴팁용 주석
	/**
	 * 메뉴 출력용 메서드
	 */
	public void displayMenu() {
		
		int input = 0; // 메뉴 선택용 변수
		
		do {
			System.out.println("----- [학생 관리 프로그램] -----");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체 정보 조회");
			System.out.println("3. 학생 1명 정보 조회(인덱스)");
			System.out.println("4. 학생 정보 조회(이름 검색)");
			System.out.println("5. 학생 정보 수정(인덱스)");
			System.out.println("0. 종료");
			System.out.println("---------------------------");
			
			System.out.println("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine();
			
			System.out.println(); // 줄 바꿈
			
			switch(input) {
			case 1: addStudent(); break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 0: System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력 하셨습니다.");
			}
			
			System.out.println(); // 줄 바꿈
			
			
		}while(input != 0);
		
		
	}
	
	/**
	 * 추가할 학생 정보 입력용 메서드
	 */
	public void addStudent() { 
		System.out.println("[학생 추가]");
		
		System.out.println("학년 : ");
		int grade = sc.nextInt();
		
		System.out.println("반 : ");
		int classRoom = sc.nextInt();
		
		System.out.println("번호 : ");
		int number = sc.nextInt();
		
		System.out.println("이름 : ");
		String name = sc.next();
		
		// 학생 추가 서비스 메서드 호출
		int result = service.addStudent(grade, classRoom, number, name);
		
		if(result == 0) {
			System.out.println("더 이상 학생을 추가할 수 없습니다.");
		} else {
			System.out.println("학생 정보가 추가되었습니다.");
		}
		
		
	}
	
	
	
	
	
	
}

