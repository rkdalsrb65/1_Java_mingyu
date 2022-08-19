package edu.kh.oop.method.view;

import java.util.Scanner;

// 콘솔에 보여지는 내용 출력, 입력 받는 용도의 클래스
public class MethodExampleView {
	private Scanner sc = new Scanner(System.in); //클래스 내 어디서든 사용 가능한 Scanner 객체 생성
	// 캡슐화 원칙에 따라서 private
	// 멤버 변수 (위)/(아래) 지역 변수 
	
	// void : 반환 값이 없음
	public void displayMenu() {
		
		int input = 0; // 메뉴 번호를 입력 받을 변수
		
		do {
			System.out.println("-----------------");
			System.out.println("1. 매개변수 X, 리턴 값 X");
			System.out.println("2. 매개변수 O, 리턴 값 X");
			System.out.println("3. 매개변수 X, 리턴 값 O");
			System.out.println("4. 매개변수 O, 리턴 값 O");
			System.out.println("O. 종료");
			System.out.println("-----------------");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine(); // 입력 버퍼 개행문자 제거
			
			System.out.println(); // 줄 바꿈
			
			switch(input) {
			case 1: ; break;
			case 2: ; break;
			case 3: ; break;
			case 4: ; break;
			case 0: System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못 입력하셨습니다");
			}
			
		} while(input != 0); // input이 0이면 참(반복 종료), 아니면(반복)
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
