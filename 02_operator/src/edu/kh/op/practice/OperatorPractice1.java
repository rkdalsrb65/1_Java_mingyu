package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		/* 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		[실행화면]
        인원 수 : 29
        사탕 개수 : 100
        1인당 사탕 개수 : 3
        남는 사탕 개수 : 13                                                  */

		
		int a = 29;
		int b = 100;
		
		
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + b/a);
		
		System.out.println("남는 사탕 개수 : " + b%a);
		
		
		
	}

}
