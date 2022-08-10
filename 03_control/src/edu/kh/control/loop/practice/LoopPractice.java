package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	public void LoopPractice1() {
		
//		메소드 명 : public void practice1(){}
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) { 
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}
		for(int i = 1; i <= input; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
	}
	
	public void LoopPractice2() {
		
		
//		메소드 명 : public void practice2(){}
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) { 
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}
		for(int i = input; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();		
		
	}

	public void LoopPractice3() {

//		메소드 명 : public void practice3(){}
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.		
		
		Scanner sc = new Scanner(System.in);

		int sum = 0; // 합계 저장용 변수

		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		

		for(int i = 1; i <= input; i++) {
			
			System.out.printf(i + " + ");
		// 입력 버퍼에서 다음 정수를 얻어와 sum 변수에 누적
			sum += i;
	}		

		System.out.println(": " + sum);
		
	}
	
	public void LoopPractice4() {
		
//		메소드 명 : public void practice4(){}
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 <= 0 || num2 <= 0) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		} else
		
			for(int x=num1 ; x<=num2; x++) { // 4번 반복
				
				// 12345
				for(int i=num1; i<=num2; i++) {
				System.out.print(i + " ");
				}	
				System.out.println(); // 줄 바꿈 (개행)
				
			}		
		
	}
	
	public void LoopPractice5() {
		
//		메소드 명 : public void practice5(){}
//		사용자로부터 입력 받은 숫자의 단을 출력하세요.		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();		
		
		if(dan < 1 || dan > 9) { // dan이 2~9사이가 아니라면
			System.out.println("잘못 입력하셨습니다.");
			} else {
				System.out.println("====="+dan+" 단 "+"=====");
			}
		{ for(int i = 1; i <= 9; i++) {
				

				System.out.printf("%d X %d = %d \n" , dan, i, dan * i);
			}
			System.out.println(); // 줄 바꿈 (개행)
			
		}		
		
		
		
		
		
		
		
	}
	
	public void LoopPractice6() {
		
		
//		메소드 명 : public void practice6(){}
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();			
		
		if(dan < 2 || dan > 9) { // dan이 2~9사이가 아니라면
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			System.out.println("====="+dan+" 단 "+"=====");
			}
		{
			for(int i = 1; i <= 9; i++) {
				
				System.out.printf("%d X %d = %d \n" , dan, i, dan * i);
			}
		
		
		
			
		
	}
		
}
	
	
	public void LoopPractice7() {
		
//		메소드 명 : public void practice7(){}
//		다음과 같은 실행 예제를 구현하세요.
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();			
		
		for(int row = 1; row <= input; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println(); // 줄 바꿈 (개행)
		}		
		
		
	}
	public void LoopPractice8() {
		
//		메소드 명 : public void practice8(){}
//		다음과 같은 실행 예제를 구현하세요.
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();			
		
		for(int x = input; x >= 1; x--) {
			for(int i = x; i >= 1; i--) {
				System.out.print("*");
			}
			System.out.println(); // 줄 바꿈 (개행)
		}			
		
		
		
	}
	public void LoopPractice9() {
		
//		메소드 명 : public void practice9(){}
//		다음과 같은 실행 예제를 구현하세요.		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();			
		
		for(int row = 1; row <= input; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println(); // 줄 바꿈 (개행)
		}
		

		
		
	}
	
	
	
	
//	public void LoopPractice10()
//	public void LoopPractice11()
//	public void LoopPractice12()
	public void LoopPractice13() {
		
//		메소드 명 : public void practice13(){}
//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();		
		
		int count = 0;		
		
		if(i % 2 == 0 && i % 3 == 0) {
			
			
		}
		
		
	}
	
	
	
	
	
	
	
}