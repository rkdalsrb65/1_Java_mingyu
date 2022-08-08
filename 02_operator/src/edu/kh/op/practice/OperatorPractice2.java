package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		/* 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.

		ex.
		이름 : 홍길동
		학년(정수) : 3
		반(정수) : 4
		번호(정수) : 15
		성별(남학생/여학생) : 남학생
		성적(소수점 아래 둘째 자리까지) : 85.75
		3학년 4반 15번 홍길동 남학생의 성적은 85.75점 입니다. */
		
		
		System.out.print("이름을 입력해주세요 : ");
		String name = "홍길동";
		
		
		System.out.print("학년을 입력해주세요 : ");
		int year = 3;
		int input2 = sc.nextInt();
		
		System.out.print("반을 입력해주세요 : ");
		int group = 4;
		int input3 = sc.nextInt();
		
		System.out.print("번호을 입력해주세요 : ");
		int number = 15;
		int input4 = sc.nextInt();
		
		System.out.print("성별을 입력해주세요 : ");
		char gender = '남';
		
		System.out.print("성적을 입력해주세요 : ");
		double grade = 85.75;
		
		boolean tf = true;
		
		System.out.println(year +"학년 " + group + "반 " + number +"번 "+ name + " " + gender + "학생의 " + "성적은 " + grade + "점 입니다." );
		
		
		
	}

}
