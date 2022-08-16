import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
		
/* ********* 연산자 실습문제1 **********		통과
모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
[실행화면]
인원 수 : 29
사탕 개수 : 100
		
1인당 사탕 개수 : 3
남는 사탕 개수 : 13	                                        */	
		
		
		
//Scanner sc = new Scanner(System.in);
//		
//System.out.print("인원 수 : ");		
//int input1 = sc.nextInt();
//
//System.out.print("사탕 개수 : ");		
//int input2 = sc.nextInt();
//		
//System.out.println("1인당 사탕 개수 : " + input2/input1);
//System.out.println("남는 사탕 개수 : " + input2%input1);
		
		
		
		
		
/* ********* 연산자 실습문제2 **********      통과
키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.

ex.
이름 : 홍길동
학년(정수) : 3
반(정수) : 4
번호(정수) : 15
성별(남학생/여학생) : 남학생
성적(소수점 아래 둘째 자리까지) : 85.75
3학년 4반 15번 홍길동 남학생의 성적은 85.75점 입니다. */
		

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름 : ");		
//		String name = sc.next();
//		
//		System.out.print("학년(정수) : ");		
//		int gkrsus = sc.nextInt();
//		
//		System.out.print("반(정수) : ");		
//		int qks  = sc.nextInt();
//		
//		System.out.print("번호(정수) : ");		
//		int number = sc.nextInt();
//		
//		System.out.print("성별(남학생/여학생) : ");		
//		String gender = sc.next();
//		
//		System.out.print("성적(소수점 아래 둘째 자리까지) : ");		
//		double tjdwjr = sc.nextDouble();
//		
//		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f점 입니다.", gkrsus, qks, number, name, gender, tjdwjr);
		
		
		
		
		
/* ********* 연산자 실습문제3 **********	                       통과
정수를 하나 입력 받아 양수/음수/0 을 구분하세요.

[실행화면]
정수 입력 : 3
양수 입니다.
정수 입력 : -5
음수 입니다.
정수 입력 : 0
0 입니다.                         */
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");		
//		int input = sc.nextInt();		
//		
//		if(input == 0) {
//			System.out.println("0 입니다.");
//		} else if(input > 0) {
//			System.out.println("양수 입니다.");
//			} else {
//				System.out.println("음수 입니다.");
//			}
		
		
		
		
// ********** 연산자 실습문제4 **********		               통과
//국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
//세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
//
//ex.
//국어 : 60
//영어 : 80
//수학 : 40
//합계 : 180
//평균 : 60.0
//합격		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int sum = 0;
//		
//		System.out.print("국어 : ");
//		int kor = sc.nextInt();
//		
//		System.out.print("영어 : ");
//		int eng = sc.nextInt();
//		
//		System.out.print("수학 : ");
//		int mat = sc.nextInt();
//		
//		sum = kor + eng + mat;
//		double avg = sum/3.0;		
//		
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + avg);
//		String result = kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60.0 ? "합격" : "불합격";
//		System.out.println(result);
		
		
//********** 조건문 실습문제1 **********       if문                통과
//키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
//짝수가 아니면 “홀수입니다.“를 출력하세요.
//양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
//[실행 화면 1]
//숫자를 한 개 입력하세요 : 8
//짝수입니다.

//[실행 화면 2]
//숫자를 한 개 입력하세요 : 17
//홀수입니다.

//[실행 화면 3]
//숫자를 한 개 입력하세요 : -3
//양수만 입력해주세요.

//Scanner sc = new Scanner(System.in);
//
//System.out.print("숫자를 한 개 입력하세요 : ");
//int input = sc.nextInt();
//
//if(input < 0) {
//	System.out.println("양수만 입력해주세요.");
//} else if(input %2 == 0) {
//	System.out.println("짝수입니다.");
//} else {
//	System.out.println("홀수입니다.");
//}











/* ********* 조건문 실습문제2 **********                   통과
국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
불합격인 경우에는 “불합격입니다.”를 출력하세요.

[실행화면 1]
국어점수 : 88
수학점수 : 50
영어점수 : 40
불합격입니다.

[실행화면 2]
국어점수 : 88
수학점수 : 50
영어점수 : 45
국어 : 88
수학 : 50
영어 : 45
합계 : 183
평균 : 61.0
축하합니다, 합격입니다!   */

//Scanner sc = new Scanner(System.in);
//
//System.out.print("국어점수 : ");
//int kor = sc.nextInt();
//
//System.out.print("수학점수 : ");
//int mat = sc.nextInt();
//
//System.out.print("영어점수 : ");
//int eng = sc.nextInt();
//
//int sum = kor + mat + eng;
//double avg = sum/3.0;
//
//if(kor < 40 || mat < 40 || eng < 40 || avg < 60) {
//	System.out.println("불합격입니다.");
//} else {
//	System.out.println("국어 : " + kor);
//	System.out.println("수학 : " + mat);
//	System.out.println("영어 : " + eng);
//	System.out.println("합계 : " + sum);
//	System.out.println("평균 : " + avg);
//	System.out.println("축하합니다, 합격입니다!");
//}


//********** 조건문 실습문제3 **********                     통과
//1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
//잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)

//[실행화면 1]
//1~12 사이의 정수 입력 : 8
//8월은 31일까지 있습니다.

//[실행화면 2]
//1~12 사이의 정수 입력 : 99
//99월은 잘못 입력된 달입니다.
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("1~12 사이의 정수 입력 : ");
//		int input = sc.nextInt();
//		
//		switch(input) {
//		
//		case 1 : System.out.println("1월은 31일까지 있습니다."); break;
//		case 2 : System.out.println("2월은 28일까지 있습니다."); break;
//		case 3 : System.out.println("3월은 31일까지 있습니다."); break;
//		case 4 : System.out.println("4월은 30일까지 있습니다."); break;
//		case 5 : System.out.println("5월은 31일까지 있습니다."); break;
//		case 6 : System.out.println("6월은 30일까지 있습니다."); break;
//		case 7 : System.out.println("7월은 31일까지 있습니다."); break;
//		case 8 : System.out.println("8월은 31일까지 있습니다."); break;
//		case 9 : System.out.println("9월은 30일까지 있습니다."); break;
//		case 10 : System.out.println("10월은 31일까지 있습니다."); break;
//		case 11 : System.out.println("11월은 30일까지 있습니다."); break;
//		case 12 : System.out.println("12월은 31일까지 있습니다."); break;
//
//		default : System.out.println(input + "월은 잘못 입력된 달입니다.");
//
//		}







/* ********* 조건문 실습문제4 **********                      통과
키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
저체중/정상체중/과체중/비만을 출력하세요.

BMI = 몸무게 / (키(m) * 키(m))
BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
BMI가 30이상일 경우 고도 비만

[실행 화면]
키(m)를 입력해 주세요 : 1.65
몸무게(kg)를 입력해 주세요 : 58.4
BMI 지수 : 21.45087235996327
정상체중 */
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("키(m)를 입력해 주세요 : ");
//		double zl = sc.nextDouble();
//		
//		System.out.print("몸무게(kg)를 입력해 주세요 : ");
//		double kg = sc.nextDouble();
//		
//		double bmi = kg / (zl*zl);
//		System.out.print("BMI 지수 : " + bmi);
//		
//		System.out.println();
//		if(bmi < 18.5) {
//			System.out.println("저체중");
//		} else if(bmi >= 18.5 && bmi < 23) {
//			System.out.println("정상체중");
//		} else if(bmi >= 23 && bmi < 25) {
//			System.out.println("과체중");
//		} else if(bmi >= 25 && bmi < 30) {
//			System.out.println("비만");
//		} else {
//			System.out.println("고도 비만");
//		}
		
		


//********** 조건문 실습문제5 **********
//메소드 명 : public void practice5(){}
//중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
//평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
//이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
//70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.

//[실행 화면 1]
//중간 고사 점수 : 80
//기말 고사 점수 : 30
//과제 점수 : 60
//출석 횟수 : 18
//================= 결과 =================
//중간 고사 점수(20) : 16.0
//기말 고사 점수(30) : 9.0
//과제 점수 (30) : 18.0
//출석 점수 (20) : 18.0
//총점 : 61.0
//Fail [점수 미달]

//[실행 화면 2]
//중간 고사 점수 : 80
//기말 고사 점수 : 90
//과제 점수 : 50
//출석 횟수 : 15
//================= 결과 =================
//중간 고사 점수(20) : 16.0
//기말 고사 점수(30) : 27.0
//과제 점수 (30) : 15.0
//출석 점수 (20) : 15.0
//총점 : 73.0
//PASS
		
//[실행 화면 3]
//중간 고사 점수 : 100
//기말 고사 점수 : 80
//과제 점수 : 40
//출석 횟수 : 10
//================= 결과 =================
//Fail [출석 횟수 부족 (10/20)]		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double wndrks = sc.nextDouble();
		
		System.out.print("기말 고사 점수 : ");
		double rlakf = sc.nextDouble();
		
		System.out.print("과제 점수 : ");
		double rhkwp = sc.nextDouble();
		
		System.out.print("출석 점수 : ");
		double cnftjr = sc.nextDouble();
		
		wndrks = wndrks*0.2;       // midTerm    *= 0.2;
		rlakf = rlakf*0.3;   // finalTerm  *= 0.3;
		rhkwp = rhkwp*0.3;         // report     *= 0.3;
		cnftjr = (cnftjr*5)*0.2; // attendance *= 5 * 0.2;
		
		
		double sum = wndrks + rlakf + rhkwp + cnftjr;
		
		if(cnftjr <= 20 * (1 - 0.3)) {
			System.out.println("Fail [출석 횟수 부족 (" + cnftjr + "/20)");
		} else if(sum < 70.0) {
			System.out.println("중간 고사 점수 : ");
			System.out.println("기말 고사 점수 : ");
			System.out.println("과제 점수 : ");
			System.out.println("출석 횟수 : ");
			System.out.println("총점 : " + sum);
			System.out.println("Fail [점수 미달]");
		} else {
			
			System.out.println("PASS");
		}
		
		
		
		







		
/* ********* 반복문 실습문제1 **********
사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
단, 입력한 수는 1보다 크거나 같아야 합니다.
만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
ex.
1이상의 숫자를 입력하세요 : 4        1이상의 숫자를 입력하세요 : 0
1 2 3 4                       1 이상의 숫자를 입력해주세요. */






/* ********* 반복문 실습문제2 **********		
사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
단, 입력한 수는 1보다 크거나 같아야 합니다.
ex.
1이상의 숫자를 입력하세요 : 4         1이상의 숫자를 입력하세요 : 0
4 3 2 1                        1 이상의 숫자를 입력해주세요. */



/* ********* 반복문 실습문제3 **********		
1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.

ex.
정수를 하나 입력하세요 : 8
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36      */






/* ********* 반복문 실습문제4 **********		
사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

ex.
첫 번째 숫자 : 8    첫 번째 숫자 : 4    첫 번째 숫자 : 9
두 번째 숫자 : 4    두 번째 숫자 : 8    두 번째 숫자 : 0
4 5 6 7 8        4 5 6 7 8       1 이상의 숫자를 입력해주세요. */






/* ********* 반복문 실습문제5 **********		
사용자로부터 입력 받은 숫자의 단을 출력하세요.

ex.
숫자 : 4
===== 4단 =====
4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
4 * 5 = 20
4 * 6 = 24
4 * 7 = 28
4 * 8 = 32
4 * 9 = 36     */
/* ********* 반복문 실습문제6 **********		
사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.

숫자 : 4                  숫자 : 10
===== 4단 =====          2~9 사이 숫자만 입력해주세요.
===== 5단 =====
===== 6단 =====
===== 7단 =====
===== 8단 =====
===== 9단 =====
(해당 단의 내용들은 길이 상 생략) */


/* ********* 반복문 실습문제7 **********		
다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 4
*
**
***
****                              */





/* ********* 반복문 실습문제8 **********		
다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 4
****
***
**
*                                */


/* ********* 반복문 실습문제9 **********		
다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 4
*
**
***
****                               */


/* ********* 반복문 실습문제10 **********		
다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 3
*
**
***
**
*                                  */


/* ********* 반복문 실습문제11 **********		
다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 4
*
***
*****                              */



/* ********* 반복문 실습문제12 **********		
다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 5
*****
* *
* *
* *
*****                             */



/* ********* 반복문 실습문제13 **********		
1부터 사용자에게 입력 받은 수까지 중에서
1) 2와 3의 배수를 모두 출력하고
2) 2와 3의 공배수의 개수를 출력하세요.

* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로
어떤 수를 해당 수들로 나눴을 때 모두 나머지가 0이 나오는 수

ex.
자연수 하나를 입력하세요 : 15
2 3 4 6 8 9 10 12 14 15
count : 2                           */		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
