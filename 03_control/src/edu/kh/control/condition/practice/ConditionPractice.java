package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
/*      키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
		짝수가 아니면 “홀수입니다.“를 출력하세요.
		양수가 아니면 “양수만 입력해주세요.”를 출력하세요. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();

		if(input < 0) {
			System.out.println("양수만 입력해주세요.");
		} else if(input % 2 != 0) {
			System.out.println("홀수입니다.");}
			else {System.out.println("짝수입니다.");
			}
			
		}
	
	public void practice2() {
/*		메소드 명 : public void practice2(){}
        국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
        합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
        (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

        합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
        불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int Ko = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int Ma = sc.nextInt();		
		
		System.out.print("영어 점수 : ");
		int En = sc.nextInt();		
		
		int sum = Ko + Ma + En;            // 합계를 저장하기 위한 변수
		
		double avg = sum / 3.0;            // 평균을 저장하기 위한 변수
		
		if(Ko < 40 || Ma < 40 || En < 40 || avg < 60) {
			System.out.println("불합격입니다.");
		} else if(Ko >= 40 && Ma >= 40 && En >= 40 && avg >= 60){
			System.out.println("국어 점수 : " + Ko);
			System.out.println("수학 점수 : " + Ma);
			System.out.println("영어 점수 : " + En);
			System.out.println(" 합계 : " + sum);
			System.out.println(" 평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}
		
	}	
	
	public void practice3() {
/*		1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
		잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 수를 입력해주세요 : ");
		int month = sc.nextInt();
		
		String day; // 변수 선언
		
		switch(month) {
		case 1 : day = "1월은 31일까지 있습니다."; break;
		case 2 : day = "2월은 28일까지 있습니다."; break;
		case 3 : day = "3월은 31일까지 있습니다."; break;
		case 4 : day = "4월은 30일까지 있습니다."; break;		
		case 5 : day = "5월은 31일까지 있습니다."; break;
		case 6 : day = "6월은 30일까지 있습니다."; break;
		case 7 : day = "7월은 31일까지 있습니다."; break;
		case 8 : day = "8월은 31일까지 있습니다."; break;
		case 9 : day = "9월은 30일까지 있습니다."; break;
		case 10 : day = "10월은 31일까지 있습니다."; break;
		case 11 : day = "11월은 30일까지 있습니다."; break;
		case 12 : day = "12월은 31일까지 있습니다."; break;
		
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		
	}	
	
	public void practice4() {

/*		메소드 명 : public void practice4(){}
		키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		저체중/정상체중/과체중/비만을 출력하세요.

		BMI = 몸무게 / (키(m) * 키(m))
		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		BMI가 30이상일 경우 고도 비만		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();	
		
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();			
		
		double bmi = weight/(height*height);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if(bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if(bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		} else System.out.println("고도 비만");
		
		System.out.println(bmi);
	}	
	
	public void practice5() {
		
/*		메소드 명 : public void practice5(){}
		중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.	*/	
		
		Scanner sc = new Scanner(System.in);

		// 변수의 장점 : 재사용성
		
		System.out.print("중간 고사 점수 : ");
		double midTerm = sc.nextInt(); // int로 입력 받아도 대입 연산 시 double 자동 형변환
		
		System.out.print("기말 고사 점수 : ");
		double finalTerm = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		double report = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		double attendance = sc.nextInt();
		
		// 각각의 점수를 비율에 맞게 변경
		midTerm = midTerm*0.2;       // midTerm    *= 0.2;
		finalTerm = finalTerm*0.3;   // finalTerm  *= 0.3;
		report = report*0.3;         // report     *= 0.3;
		attendance = (attendance*5)*0.2; // attendance *= 5 * 0.2;
		
		System.out.println("=========결과=========");
		
		if(attendance <= 20 * (1 - 0.3) ) { // 14번 이하 출석 했을 경우
			System.out.println("Fail [출석 횟수 부족] (" + (int)attendance + "/20)");
			                                      // 소수점 버림 처리
		} else { // 출석 만족
			System.out.printf("중간 고사 점수(20) : %.1f \n" , midTerm);
			System.out.printf("기말 고사 점수(20) : %.1f \n" , finalTerm);
			System.out.printf("과제 점수(20) : %.1f \n" , report);
			System.out.printf("출석 점수(20) : %.1f \n" , attendance);
			
			double sum = midTerm + finalTerm + report + attendance;
			
			System.out.printf("총점 : %.1f \n" , sum);
			
			if(sum >= 70.0) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		}
	}
	
}