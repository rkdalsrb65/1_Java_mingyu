package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

/*	메소드 명 : public void practice1(){}
	길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

	[실행 화면]
	1 2 3 4 5 6 7 8 9
	짝수 번째 인덱스 합 : 25	   
	                            */
	
	public void practice1() {
	
	int sum = 0;
	
	int[] arr = new int[9]; // 길이가 9인 배열을 선언 및 할당
	
	for(int i = 1; i <= 9; i++) { // 1부터 9까지의 값 
			System.out.print(i + " ");
			if(i % 2 != 0) {
			sum += i;
		}
	}
	
	
	
	System.out.print("\n짝수 번째 인덱스 합 : " + sum);
	
	System.out.println();
	}
	
	
/*	메소드 명 : public void practice2(){}
	길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

	[실행 화면]
	9 8 7 6 5 4 3 2 1
	홀수 번째 인덱스 합 : 20	                            */
	
	public void practice2() {
		
	int sum = 0;
	
	int[] arr = new int[9]; // 길이가 9인 배열을 선언 및 할당
	
	for(int i = 1; i <= 9; i++) { // 1부터 9까지의 값 
			System.out.print(i + " ");
			if(i % 2 == 0) {
			sum += i;
		}
	}
	System.out.print("\n홀수 번째 인덱스 합 : " + sum);
	System.out.println();
	}	
	
	
	
	
/*	메소드 명 : public void practice3(){}
    사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
    1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

[실행 화면]
양의 정수 : 5
1 2 3 4 5

[실행 화면]
양의 정수 : 8
1 2 3 4 5 6 7 8                       */
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수: ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 1; i <= input; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
/*	메소드 명 : public void practice4(){}
	정수 5개를 입력 받아 배열을 초기화 하고
	검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
	배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력 

	[실행 화면 1]
	입력 0 : 5
	입력 1 : 8
	입력 2 : 9
	입력 3 : 10
	입력 4 : 4
	검색할 값 : 8
	인덱스 : 1

	[실행 화면 2]
	입력 0 : 5
	입력 1 : 8
	입력 2 : 9
	입력 3 : 10
	입력 4 : 4
	검색할 값 : 1
	일치하는 값이 존재하지 않습니다.         */	
	
	public void practice4() {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("입력 0 : ");
	int input0 = sc.nextInt();
	
	System.out.print("입력 1 : ");
	int input1 = sc.nextInt();
	
	System.out.print("입력 2 : ");
	int input2 = sc.nextInt();
	
	System.out.print("입력 3 : ");
	int input3 = sc.nextInt();
	
	System.out.print("입력 4 : ");
	int input4 = sc.nextInt();
	
	System.out.print("검색할 값 : ");
	int search = sc.nextInt();
	
	boolean flag = true;
	
	int[] arr = {5, 8, 9, 10, 4};
	
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] == search) { // arr[i] 값이 입력 받은 값과 같다면
			System.out.print("인덱스 : " + i);
			flag = false; // flag 값을 변경
			break; // 중복 데이터가 없으면 추가 검색을 하지 않아도 됨
		}
	}
	
	if(flag) {
		System.out.println("일치하는 값이 존재하지 않습니다.");
	}
}
	
	
	
/*	메소드 명 : public void practice5(){}
	문자열을 입력 받아 문자 하나 하나를 char배열에 대입하고
	검색할 문자가 문자열에 몇 개 들어가 있는지, 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.	
	[실행 화면]
	문자열 : application
	문자 : i
	application에 i가 존재하는 위치(인덱스) : 4 8
	i 개수 : 2	                              */
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		char[] arr = {'a', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n'};
		
		System.out.print("문자열 : ");
		System.out.println(arr);
		
		int sum = 0;
		
		System.out.print("문자 : ");
		String search = sc.next();
		boolean flag = true;
		for(int i = 0; i <= 11; i++) {
			 // arr[i] 값이 입력 받은 값과 같다면
				System.out.print("application에 i가 존재하는 위치(인덱스) : " + i + "\n");
				sum += i;
				flag = false; // flag 값을 변경
				break;
			} System.out.print(search+ " 개수 : " + sum);
		
			if(flag) {
				System.out.println("존재하지 않습니다.");
			}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
/*	메소드 명 : public void practice6(){}
	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.

	[실행 화면]
	정수 : 5
	배열 0번째 인덱스에 넣을 값 : 4
	배열 1번째 인덱스에 넣을 값 : -4
	배열 2번째 인덱스에 넣을 값 : 3
	배열 3번째 인덱스에 넣을 값 : -3
	배열 4번째 인덱스에 넣을 값 : 2
	4 -4 3 -3 2
	총 합 : 2                     */	
	
	public void practice6() {
		
        int[] arr; // 배열 시작 주소를 저장하는 변수 (참조형, 4byte)
        arr = new int[5];
		arr[0] = 4;
		arr[1] = -4;
		arr[2] = 3;
		arr[3] = -3;
		arr[4] = 2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		System.out.print("배열 0번째 인덱스에 넣을 값 : " + arr[0]+"\n");
		System.out.print("배열 1번째 인덱스에 넣을 값 : " + arr[1]+"\n");
		System.out.print("배열 2번째 인덱스에 넣을 값 : " + arr[2]+"\n");
		System.out.print("배열 3번째 인덱스에 넣을 값 : " + arr[3]+"\n");
		System.out.print("배열 4번째 인덱스에 넣을 값 : " + arr[4]+"\n");
		
		sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		
		System.out.print(arr[0]+" "+ arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+"\n");
		System.out.print("총 합 : " + sum+"\n");
	}

	
	
/*	메소드 명 : public void practice7(){}
	주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
	단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.

	[실행 화면]
	주민등록번호(-포함) : 123456-1234567
	123456-1******                                  */
	
	public void practice7() {
		
	Scanner sc = new Scanner(System.in);
	
	char[] arr;
	arr = new char[14]
	char[0] = 1;
	
	
	
	
	
	System.out.print("주민등록번호(-포함) : ");
	String input = sc.next();
	
	System.out.println(input);
	
	
	
	
	
	}
	
	
	
	
	
	
	
/*	메소드 명 : public void practice8(){}
	3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
	다시 정수를 받도록 하세요.

	[실행 화면]
	정수 : 4
	다시 입력하세요.
	정수 : -6
	다시 입력하세요.
	정수 : 5
	1, 2, 3, 2, 1             */
	
/*	메소드 명 : public void practice9(){}
	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
	1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.

	[실행 화면]
	발생한 난수 : 9 7 6 2 5 10 7 2 9 6             */
	
/*	메소드 명 : public void practice10(){}
	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
	1~10 사이의 난수를 발생시켜 배열에 초기화 후
	배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.

	[실행 화면]
	발생한 난수 : 5 3 2 7 4 8 6 10 9 10
	최대값 : 10
	최소값 : 2	                         */
	
/*	메소드 명 : public void practice11(){}
	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.

	[실행 화면]
	4 1 3 6 9 5 8 10 7 2	         */
	
/*	메소드 명 : public void practice12(){}
	로또 번호 자동 생성기 프로그램을 만들기.
	(중복 값 없이 오름차순으로 정렬하여 출력하세요.)

	[실행 화면]
	3 4 15 17 28 40                   */
	
/*	메소드 명 : public void practice13(){}
	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
	문자의 개수와 함께 출력하세요. (중복 제거)

	[실행 화면]
	문자열 : application
	문자열에 있는 문자 : a, p, l, i, c, t, o, n
	문자 개수 : 8                           */
	
/*	메소드 명 : public void practice14(){}
	사용자가 입력한 배열의 길이만큼의 String 배열을 선언 및 할당하고
	배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
	단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
	늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
	사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
	(배열의 얕은 복사, 깊은 복사를 이용하는 문제)

	얕은 복사 : 배열의 시작 주소만을 복사하여 두 참조 변수가 하나의 배열을 참조.
	깊은 복사 : 원본 배열이 가지고 있는 데이터를 그대로 복사한 새로운 배열 (복제)

	 tip : 깊은 복사를 위한 새로운 배열은 꼭 원본 배열과 같은 크기일 필요는 없다!
	
	        [실행 화면]
			배열의 크기를 입력하세요 : 3
			1번째 문자열 : 자바의 정석
			2번째 문자열 : 알고리즘
			3번째 문자열 : C프로그래밍
			더 값을 입력하시겠습니까?(Y/N) : y
			더 입력하고 싶은 개수 : 2
			4번째 문자열 : 인간관계
			5번째 문자열 : 자기계발
			더 값을 입력하시겠습니까?(Y/N) : y
			더 입력하고 싶은 개수 : 1
			6번째 문자열 : 영단어600
			더 값을 입력하시겠습니까?(Y/N) : n
			[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600] */
	
/*	메소드 명 : public void practice15(){}
	3행 3열짜리 문자열 배열을 선언 및 할당하고
	인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.

	[실행 화면]
	(0, 0)(0, 1)(0, 2)
	(1, 0)(1, 1)(1, 2)
	(2, 0)(2, 1)(2, 2)	                */
	
	
	
/*	메소드 명 : public void practice16(){}
	4행 4열짜리 정수형 배열을 선언 및 할당하고
	1) 1 ~ 16까지 값을 차례대로 저장하세요.
	2) 저장된 값들을 차례대로 출력하세요.

	[실행 화면]
	1 2 3 4
	5 6 7 8
	9 10 11 12
	13 14 15 16                  */
	
	
/*	메소드 명 : public void practice17(){}
	4행 4열짜리 정수형 배열을 선언 및 할당하고
	1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
	2) 저장된 값들을 차례대로 출력하세요.

	[실행 화면]
	16 15 14 13
	12 11 10 9
	8 7 6 5
	4 3 2 1	              */
	
	
	
	
	
	
	
	
	
	
	
/* 2022/08/17 시험
package edu.kh.programing;

import java.util.Scanner;

public class Test1 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("가위 바위 보 게임을 시작합니다.");
while(true) {
System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
String input = sc.next();
int random = (int)(Math.random() * 3);
String com = null;
switch(random) {
case 0 : com = "가위"; break;
case 1 : com = "바위"; break;
case 2 : com = "보"; break;
}
System.out.println("당신은 " + input +"를 냈습니다.");
System.out.println("컴퓨터는 " + com +"를 냈습니다.");
if(input.equals(com)) {
System.out.println("비겼습니다. 다시 시작합니다.\n");
}else {
boolean win1 = input.equals("가위") && com.equals("보");
boolean win2 = input.equals("바위") && com.equals("가위");
boolean win3 = input.equals("보") && com.equals("바위");
if(win1 || win2 || win3) {
System.out.println("당신이 이겼습니다.");
}else{
System.out.println("당신이 졌습니다.");
}
break;
}
}
}
}

1. 사용자로 부터 가위 바위 보 중 하나의 문자열을 입력 받고, 난수를 발생시켜 랜덤하게 가위 바위 보 를 지정한다.
System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");

String input = sc.next();
int random = (int)(Math.random() * 3);
String com = null;
switch(random) {
case 0 : com = "가위"; break;
case 1 : com = "바위"; break;
case 2 : com = "보"; break;
}
System.out.println("당신은 " + input +"를 냈습니다.");
System.out.println("컴퓨터는 " + com +"를 냈습니다.");

2. 랜덤한 컴퓨터의 가위 바위 보 문자열과 입력한 문자열이 같으면 아래 실행 결과처럼 비겼다고 출력하고 가위 바위 보 게임을 반복한다.
- input의 String, ran은 int 자료형으로 정상적인 비교를 할 수 없음.
- 문자열 비교시 equals() 를 사용해야 함.
- 전체 코드와 작성 답안이 일치하지 않습니다.
if(input.equals(com)) {
System.out.println("비겼습니다. 다시 시작합니다.\n");
}
3. 입력한 가위 바위 보 문자열이 컴퓨터의 랜덤한 가위 바위 보 문자열과 비교하여 가위 바위 보 게임의 룰 대로 이긴 경우 이겼다고 출력, 진 경우 졌다고 출력 후 종료 종료
 input의 String, ran은 int 자료형으로 정상적인 비교를 할 수 없음.
​- 문자열 비교시 equals() 를 사용해야 함.
- 전체 코드와 작성 답안이 일치하지 않습니다
else {
boolean win1 = input.equals("가위") && com.equals("보");
boolean win2 = input.equals("바위") && com.equals("가위");
boolean win3 = input.equals("보") && com.equals("바위");
if(win1 || win2 || win3) {
System.out.println("당신이 이겼습니다.");
}else{
System.out.println("당신이 졌습니다.");
}
break;
}                                                            */
	
	

}