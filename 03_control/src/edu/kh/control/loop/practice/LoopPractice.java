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
		
		if(input >= 1) { 
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void LoopPractice2() {
		
		
//		메소드 명 : public void practice2(){}
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input >= 1) {
			for (int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void LoopPractice3() {

//		메소드 명 : public void practice3(){}
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1 ; i <= num ; i++) {
			sum += i;
			
			if(i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.println(i + " = " + sum);
			}
		}
	}
	
	public void LoopPractice4() {
		
//		메소드 명 : public void practice4(){}
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		/*사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		ex.
		첫 번째 숫자 : 8	첫 번째 숫자 : 4	첫 번째 숫자 : 9
		두 번째 숫자 : 4 	두 번째 숫자 : 8 	두 번째 숫자 : 0
		4 5 6 7 8 			4 5 6 7 8 			1 이상의 숫자를 입력해주세요.*/

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if( num1 < 1  ||  num2 < 1 ) { // num1, num2 중에 1 미만이 있는가?
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else { // 둘 다 1 미만이 아니다
			//  8       4
			if(num1 > num2) { 
				
				// 두 변수의 값 교환
				int temp = num1;  //  temp : 8 / num1 : 8 / num2 : 4
				num1 = num2; //  temp : 8 / num1 : 4 / num2 : 4
				num2 = temp; //  temp : 8 / num1 : 4 / num2 : 8
			}
			
			for(int i=num1 ; i<=num2 ; i++) {
				System.out.print(i + " ");
			}
			
			
			/*int start = num1;
			int end = num2;
			
			if(num1 > num2) { // 먼저 입력한 숫자가 크면 start / end를 바꿈
				start = num2;
				end = num1;
			}
			
			for(int i = start ; i <= end ; i++) {
				System.out.print(i + " ");
			}*/
			
			
			
			/*if(num1 < num2) {
				for(int i=num1 ; i<=num2 ; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int i=num2 ; i<=num1 ; i++) {
					System.out.print(i + " ");
				}
			}*/
			
		}
		
	}
	
	public void LoopPractice5() {
		
//		메소드 명 : public void practice5(){}
//		사용자로부터 입력 받은 숫자의 단을 출력하세요.		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();		
		
		System.out.printf("===== %d단 =====\n", dan);
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d%n", dan, i, (dan * i));
		}
	}
		
	
	public void LoopPractice6() {
		
		
//		메소드 명 : public void practice6(){}
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if( num >= 2 && num <=9 ) {
			
			for(int dan = num ; dan <= 9 ; dan++) {
				
				System.out.println("===== " + dan + "단 =====");
				
				for(int i = 1 ; i<=9 ; i++) {
					System.out.printf("%d X %d = %2d \n" , dan , i , dan * i);
				}
				
				System.out.println(); // 단 사이 줄 바꿈
			}
			
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요");
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
		
		for(int x = input; x > 0; x--) {
			for(int i = x; i > 0; i--) {
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
		
		for(int row = 1 ; row <= input ; row++ ) {
			
			// for문을 이용한 풀이
			//for(int i = input-row ; i >= 1 ; i--) {
//			for(int i = input-1 ; i >= row ; i--) {
//				System.out.print(" ");
//			}
			
//			for(int col = 1 ; col <= row ; col++) {
//				System.out.print("*");
//			}
			
			
			// if문을 이용한 풀이
			for(int col = 1 ; col <= input ; col++) {
				
				if(col <= input - row) {
					System.out.print(" ");
					
				}else {
					System.out.print("*");
				}
				
			}
			
			
			System.out.println(); // 줄바꿈
		}

	}
	
	public void LoopPractice10() {
		
//		메소드 명 : public void practice10(){}
//		다음과 같은 실행 예제를 구현하세요.
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 위쪽 삼각형
		for(int row = 1; row <= input; row++) {
			
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		// 아랫쪽 삼각형
		for(int row = input-1; row >= 1; row--) {
			
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		System.out.println("=================");
		
		for(int row = 1; row <= input*2-1; row++) {
			if(row<input) {
				
				for(int col=1; col <= row; col++) {
					System.out.print("*");
				}
			} else {
				for(int col=input; col > row-input; col--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}
	public void LoopPractice11() {
//		메소드 명 : public void practice11(){}
//		다음과 같은 실행 예제를 구현하세요.
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1 ; row <= input ; row++ ) {
			
			// for문을 이용한 풀이
//			for(int i = input-row ; i >= 1 ; i--) {
/*			for(int i = input-1 ; i >= row ; i--) {
				System.out.print(" ");
			}
			
			for(int col = 1 ; col <= row * 2-1; col++) {
				System.out.print("*");
			}                                            */
			
			// if문을 이용한 풀이
			for(int col = 1 ; col <= input * 2-1 ; col++) {
				
				if(input-row>=col||input+row<=col) {
					System.out.print(" ");
					
				}else {
					System.out.print("*");
				}
				
			}
			
			
			System.out.println(); // 줄바꿈
		}
		
		
		
		
	}
	public void LoopPractice12() {
		
//		메소드 명 : public void practice12(){}
//		다음과 같은 실행 예제를 구현하세요.	
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();				
		
		for(int row = 1; row <= input; row++) {
			for(int col = 1; col <= input; col++) {
				
				// 첫 번째 / 마지막 줄, 칸일 때만 * 출력
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				} else {
				System.out.print(" ");
			}
		}
			System.out.println();
		
	}
}
	public void LoopPractice13() {
		
//		메소드 명 : public void practice13(){}
//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();	
		
		int sum = 0;
		int count = 0;
		
		
		for(int i = 1; i <= input; i++) {
			
			if(i % 2 == 0 || i % 3 == 0) { // 2의 배수 또는 3의 배수인 경우 출력
				System.out.print(i + " ");
				
				// 2와 3의 공배수 == 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다
				if(i % 2 == 0 && i % 3 == 0) {
				count++; // 1증가		
				}
		}
		
			
	}
		System.out.println("\ncount : " + count);
		
}
	
	
	
}