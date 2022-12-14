import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
/*

프로그램 : 컴퓨터가 인식할 수 있는 명령어의 나열(집합)

프로그래밍 : 프로그램을 작성하는 과정 = 코딩

프로그래머 : 프로그램을 작성하는 사람

프로그래밍 언어 : 프로그램을 작성하기 위한 언어체계, 사람이 컴퓨터와 소통하게 하는 요소
특징
1. 운영체제(OS)에 독립적
-> (OS 관계없이 동일 코드로 동작. 이식성이 높다고도 표현함.)
2. 객체 지향 프로그래밍(OOP) 언어
3. 사용하기 쉬운 언어
- 능률적이고 명확한 코드 작성 가능
- 다른 언어의 단점 보완(포인터, 메모리 관리)
4. 자동 메모리 관리(Garbage Collection)

JVM(Java Virtual Machine) : Java를 실행하기 위한 가상 기계로 OS(운영체제)에 관계없이 독립적으로 동작.





class     : 자바 코드가 작성되는 영역		
main 메소드 : 자바 애플리케이션(프로그램)을 실행하기 위해서 반드시 필요한 구문	


===변수===


변수 (Variable)
 - 메모리(RAM)에 값을 기록하는 공간(박스)
-> 공간(박스)에 기록되는 값(Data)이 변할 수 있어서 변수라고 함.
		
 - 값(Data)의 형태와 크기에 따라서 변수의 형태(자료형)는 달라져야 한다!

변수 사용의 장점
1. 재사용성의 증가 (한 번 만든 변수를 계속 사용)
2. 가독성 향상
3. 코드 길이 감소
4. 유지보수성 향상

변수 선언 : 메모리에 값을 저장할 공간을 할당

boolean booleanData;
논리 값(true/false)을 저장할 공간 1byte를 메모리에 할당하고, 그 공간을 booleanData라고 부르겠다.

int iNum;
정수 값을 저장할 공간 4byte를 메모리에 할당하고, 그 공간을 iNum 이라고 부르겠다.

long longNum;
정수 값을 저장할 공간 8byte를 메모리에 할당하고, 그 공간을 longNum 이라고 부르겠다.

byte bNum; 
bNum = 127;

short sNum;
sNum = 1000;
-> byte/short는 거의 사용되지 않는 자료형으로 별도 리터럴 표기법이 없음 -> int 표기법을 같이 사용

float fNum; // 실수형 변수 4byte 할당

double dNum; // 실수형 변수 8byte 할당

char ch1; // 문자형 변수 2byte 할당
char ch2; // 문자형 변수 2byte 할당

값 대입 : 선언된 변수에 값(리터럴)을 대입 하는 것
booleanData = false;
boolean 자료형 변수는 true / false 만 저장할 수 있다.
-> boolean의 리터럴 표기법은 true / false

iNum = 1000000; // 100만
-> int의 리터럴 표기법은 기본적인 정수 표기법

iNum = 100000000; // 100억

longNum = 100000000L;
100000000은 int 표기법이므로 int의 최대 크기를 넘어 설 수 없다.
-> long 자료형의 리터럴 표기법은 정수 뒤에 L 또는 l 작성.

fNum = 3.14f;
float의 리터럴 표기법은 F 또는 f를 뒤에 추가

dNum = 1.23;
double의 리터럴 표기법은 기본 실수 표기법

ch1 = 'A';
char의 리터럴 표기법은 '' (홑따옴표)

ch2 = 66; // 'B'
char 자료형은 숫자-문자 형태의 문자표에서 일치하는 문자나 숫자의 문자 부분만 출력

출력(print) 시 L , F 같은 리터럴 표기법은 생략된다.

리터럴 : 변수에 대입되는 값 자체

변수 명령 규칙
1. 대소문자가 구분되며 길이 제한이 없다. (단, 띄어쓰기 X)
2. 예약어를 사용하면 안 된다.
3. 숫자로 시작하면 안 된다.
4. 특수문자는 '_'와 '$'만을 허용한다. -> $는 내부클래스 사용 시 자동으로 붙는 기호 (직접 사용 X) -> _는 상수 단어 구분 외에는 사용 X
5. 여러 단어 이름은 단어의 첫 글자를 대문자로 한다. 단, 첫 시작 글자는 소문자로 하는 것이 관례이다. == 카멜 표기법(낙타등표기법) 오류는 발생하지 않음(개발자들 간의 약속/관례)
참고 : 변수명은 언어 제한이 없다. 단, 코드 공유시 글자 깨짐이 발생할 수 있어서 권장 X
변수는 한개의 데이터만 보관 가능

문자열 자료형 String 기본 자료형 X, 참조형 O
String의 리터럴 : 문자열 String의 리터럴 표기법 : "쌍따옴표"		

상수(final) : 항[상] 같은 [수] Java에서는 한번 값을 기록하면 값을 바꿀 수 없는 변수		
상수(대문자로 표기, 여러 단어면 _로 구분)	
마지막으로 값을 대입하는 변수 = 다시는 값을 대입 받지 않겠다 [변하지 않는 수(상수)]

형변환(Casting) : 값의 자료형을 변환하는 것		
형변환은 왜 필요한가? -> 컴퓨터의 값 처리 원칙을 위배하는 경우 이를 해결하기 위해

컴퓨터의 값 처리 원칙
-> 같은 자료형 끼리만 연산 O

자동 형변환		
- 자료형의 [값의 범위]가 서로 다른 두 값의 연산 시 [컴파일러(번역기)]가 자동으로 [값의 범위]가 작은 자료형을 큰 자료형으로 변환		

강제 형변환
- 강제 형변환은 값의 범위 관계 없이 원하는 자료형으로 변환 가능	

지역변수는 메모리 중 Stack 영역에 해당 됨

Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게 하는 역할


===연산자===


산술 연산자 (+ , - , * , / , %)
: 일반 수학과 동일한 연산 방법, 우선순위. 단, %는 나누기의 나머지 값을 구하는 연산

증감 연산자 (++ , --)
: 피연산자의 값에 1을 더하거나 빼는 연산자로 위치에 따라 결과 값이 다르게 나타남
전위 연산 : 먼저 연산 후 다른 연산 실행 (++a) / a를 먼저 1 증가/감소 시키고 다른 연산을 수행
후위 연산 : 다른 연산 우선 실행 후 연산 (a++) / 다른 연산을 먼저 다 수행한 후 마지막에 a를 1 증가/감소 시킴

비교 연산자 (== , !=)
: 데이터가 같은지, 다른지 비교할 때 쓰이며 항상 결과값은 논리 값(true, false)으로 나타남

: 두 피연산자의 값의 크기 비교
기본형 boolean과 참조형을 제외하고 나머지 자료형에 모두 사용 가능
복합 기호에서 '=' 기호가 항상 오른쪽


논리 연산자 (&& , ||)
: 논리 값 두 개를 비교하는 연산자
&& : 두 피연산자가 모두 true일 때 true 반환 (AND)
|| : 두 피연산자 중 하나만 true여도 true 반환 (OR)

논리 부정 연산자 (!)
: 논리 값을 부정하여 반대 값으로 변경
제어문을 활용할 때 많이 쓰임

복합 대입 연산자 (+=, -=, *=, /=, %=)
: 다른 연산자와 대입 연산자가 결합한 것으로 자기 자신과 연산 후 연산 결과를 자기 자신에게 누적 대입

삼항 연산자
: 조건식 ? 식1 : 식2;
조건식의 결과 값에 따라 연산을 처리하는 방식으로 결과 값이 참일 경우 식1, 거짓일 경우 식2 수행
삼항 연산자 안에 삼항 연산자를 중첩하여 쓰는 것도 가능		
: 조건식 ? true인 경우 : false인 경우
조건식 : 연산 결과가 true/false인 식 (비교, 논리, 논리 부정)







===제어문===


조건문 (if문 , switch문 , if~else문 , 중첩if문 , switch문)
: 프로그램 수행 흐름을 바꾸는 역할을 하는 제어문 중 하나로 "조건에 따라 다른 문장이 수행되도록 함"

if(만약에) : 조건식이 true 일때만 내부에 작성된 코드를 수행하는 구문

if(조건식) {
조건식이 true일 때 수행되는 코드
}

if - else : if문 조건식의 결과가 true이면 if문, false이면 else문을 수행하는 구문
if(조건식) {
true일 때 수행되는 코드
} else {
false일 때 수행되는 코드
}

switch : 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문 -> 식의 결과로 얻은 값과 같은 case 구문이 수행된다.

switch문의 식은 결과가 true/false가 아닌 식
switch(식){
case 결과값1 : 수행코드1; break;
case 결과값2 : 수행코드2; break;
case 결과값3 : 수행코드3; break;
...
default : 모든 case가 만족하지 않을 경우 수행하는 코드
}



반복문 (for문 , while문 , 중첩 반복문 , do ~ while문)
: 프로그램 수행 흐름을 바꾸는 역할을 하는 제어문 중 하나로 "특정 문장들을 반복해서 수행하도록 함"

for문
- 끝이 정해져 있는 경우 사용하는 반복문 (== 반복 횟수 지정되어 있는 경우)

for( 초기식 ; 조건식 ; 증감식 ){
조건식이 true일 때 반복 수행할 코드
}

초기식 : for문을 제어하는 용도의 변수 선언

조건식 : for문의 반복 여부를 지정하는 식
조건식이 true인 경우에 반복을 수행함
보통 초기식에 사용된 변수를 이용해서 조건식을 작성함.

증감식 : for문이 끝날 때 마다 특정 값을 변화 시키는 식
보통 초기식에 사용된 변수를 증가/감소 시켜 조건식의 결과를 변하게 만듦.

while문
- 별도의 초기식, 증감식이 존재하지 않고 반복 조건만을 설정하는 반복문
- 반복 횟수가 정해져 있진 않지만 언젠간 반복이 종료되는 경우에 사용

while(조건식){
조건식이 true인 경우 반복 수행할 구문
}

do - while
최소 1회 이상 반복 하는 while문

do {수행될 코드;
증감식 or 분기문;
} while(조건식);

do : { } 내부 코드를 일단 수행해라
while(조건식) : 조건식이 true이면 { } 내부 코드를 반복 수행



분기문 (break)
: 반복문에서는 break문 자신이 포함된 가장 가까운 반복문을 빠져나가는 구문
for(int i = 1; i++) {
System.out.println(i + " 출력");
if(i >= 10) {
break;
}
}

분기문 (continue)
: 반복문 내에서만 사용 가능하며 반복문 실행 시 continue 아래 부분은 실행하지 않고 반복문 다시 실행
for문의 경우 증감식으로 이동, while(do~while)문의 경우 조건식으로 이동
전체 반복 중에 특정 조건을 만족하는 경우를 제외하고자 할 때 유용
for(int i = 1; i <= 10; i++) {
if(i % 2 == 0) {
continue; // continue : 다음 반복으로 넘어감
}
System.out.println(i + " 출력");
}



===배열===

배열 : 같은 자료형의 변수를 하나의 묶음으로 다루는 것
묶여진 변수들은 하나의 이름(배열명)으로 불러지고 각 변수들은 index를 이용하여 구분함.
배열은 저장된 값마다 인덱스 번호가 0부터 시작하여 설정

변수 : 1개의 자료형, 1개의 값 저장
배열 : 1개의 자료형, n개의 값 저장

JVM 메모리 구조(참고)
Static : static예약어로 선정된 필드, 메소드가 저장되는 공간 클래스 변수 등
HEAP   : new연산자에 의해 동적으로 할당하고 저장되는 공간, 객체, 배열 등
STACK  : 메소드를 호출하면 자동생성 메소드가 끝나면 자동소멸 지역변수, 매개변수, 메소드 호출 스택 등

stack 영역은 컴파일러가 초기화 X
heap 영역은 컴파일러가 초기화 O


int[] arr = new int[4]; // [] : 배열기호
int형 변수 4개를 묶음으로 다룰 수 있는 배열을 생성하고 이를 arr이라고 부름
-> int[]을 참조하는 변수 arr(int[] 시작 주소를 저장) = Heap 영역에 int형 변수 4개짜리 배열 할당(생성)


얕은 복사 : 참조하는 주소만을 복사하여 서로 다른 참조 변수가 하나의 배열(또는 객체)를 참조하게 하는 복사 방법
특징 : 하나의 배열을 참조하기 떄문에 값을 공유하게 된다.

int[] arr = {99, 70, 80, 50, 40};
arr변수에 저장된 배열의 시작 주소를 copyArr에 대입(얕은 복사)
int[] copyArr = arr;



깊은 복사 : 원본과 같은 자료형, 크기의 새로운 배열을 만들어 원본의 데이터를 모두 복사하는 방법 == 복제
특징 : 원본 데이터를 보존하면서 복사본의 데이터 가공을 진행하는 경우 많이 사용

int[] arr = {99, 70, 80, 50, 40};		
깊은 복사를 위한 배열 선언 및 할당
int[] copyArr = new int[arr.length];



===2차원 배열===

2차원 배열 : 자료형이 같은 1차원 배열의 묶음(변수)으로 배열 안에 다른 배열이 존재
2차원 배열은 할당된 공간마다 인덱스 번호 두 개 부여 (앞 번호는 행, 뒷 번호는 열 ([0][0]) )




가변 배열 : 다차원 배열 생성 시 마지막 배열차수의 크기를 지정하지 않고 나중에 서로 크기가 다른 배열로 지정한 배열.


===객체 지향===

현실에서 객체(Object)란?
자신의 속성(값, data)과 기능(동작,행동)이 다른 것들 과 구분되어 식별 가능한 것

객체 지향 언어란? 
현실 세계는 사물이나 개념처럼 독립되고 구분되는 각각의 객체로 이루어져 있으며, 발생하는 모든 사건들은 객체간의 상호작용이다.
이 개념을 컴퓨터로 옮겨 놓아 만들어낸 것이 객체지향 언어이다.

자바에서 객체(Object)란?
클래스에 정의된 내용대로 new 연산자를 통해 메모리 영역에 생성된 것

객체 지향 언어 - 클래스(class)
객체의 특성(속성, 기능)에 대한 정의를 한 것 ex) 제품의 설계도, 빵 틀

객체 지향 언어 - 추상화
"유연성을 확보하기 위해 구체적인 것은 제거한다는 의미"
작성하려는 클래스의 속성과 기능 중 "프로그램에서 필요한 공통점을 추출하고, 불필요한 부분을 제거하는 과정"

객체 지향 언어 - 캡슐화
추상화를 통해 정리된 "데이터들과 기능을 하나로 묶어 관리하는 기법"
클래스의 가장 중요한 목적인 "데이터의 직접 접근제한을 원칙"으로 하여
클래스 외부에서 데이터의 직접적인 접근을 막고, 대신 간접적으로 데이터에 접근할 수 메소드를 클래스 내부에 작성하는 방법


*/

// *********************************************
		
		
/**

=== 클래스 ===

User u = new User(); // user라는 객체를 참조변수 u로 선언 후 new (heap영역에 저장)
클래스명(User) = class = 사용자 정의 자료형

클래스 선언
[접근제한자] [예약어] 자료형 변수명;
[접근제한자] [예약어] 자료형 변수명; // 속성값 설정

[접근제한자] 생성자명() { }

[접근제한자] 반환형 메소드명(매개변수) {
// 기능 정의
}                // 기능정의 설정

=== 필드(Field) ===

표현식 : [접근제한자] [예약어] 자료형 변수명 [= 초기값];

접근제한자 생략 시 (default)
캡슐화 원칙으로 private 사용

필드 접근제한자
public    : 전체 접근
protected : 해당 클래스 내부 + 같은 패키지 내 + 후손 클래스 내
(default) : 해당 클래스 내부 + 같은 패키지 내
private   : 해당 클래스 내부

필드 예약어 - static
같은 타입의 여러 객체가 공유할 목적의 필드에 사용하며,
프로그램 start시에 정적 메모리(static) 영역에 자동 할당되는 멤버에 적용

필드 예약어 - final
하나의 값만 계속 저장해야 하는 변수에 사용하는 예약어

필드 - 클래스 초기화 블럭
- 인스턴스 블럭 ( { } ) - 인스턴스 변수를 초기화 시키는 블럭으로 객체 생성시 마다 초기화
- static(클래스) 블럭 ( static{ } ) - static 필드를 초기화 시키는 블럭으로 프로그램 시작 시 한 번만 초기화

=== 생성자 ===
객체가 new 연산자를 통해 Heap 메모리 영역에 할당될 때
객체 안에서 만들어지는 필드 초기화 + 생성 시 필요한 기능 수행

생성자는 일종의 메소드로 전달된 초기값을 받아서 객체의 필드에 기록

생성자 규칙 : 생성자의 선언은 메소드 선언과 유사하나 반환 값이 없으며 생성자명을 클래스명과 똑같이 지정해주어야 함

기본 생성자 : 작성하지 않은 경우, 클래스 사용 시 컴파일러가 자동으로 기본 생성자 생성

매개변수 생성자
- 객체 생성 시 전달받은 값으로 객체를 초기화 하기 위해 사용
- 매개변수 생성자 작성 시 컴파일러가 기본 생성자를 자동으로 생성해주지 않음
- 상속에서 사용 시 반드시 기본 생성자를 작성
- 오버로딩을 이용하여 작성

오버로딩이란?
한 클래스 내에 동일한 이름의 메소드를 여러 개 작성하는 기법

오버로딩 조건
- 같은 메소드 이름
- 다른 매개변수의 개수 또는 다른 매개변수 타입, 순서

this란?
모든 인스턴스의 메소드에 숨겨진 채 존재하는 레퍼런스로, 할당된 객체를 가리킴
함수 실행 시 전달되는 객체의 주소를 자동으로 받음

this()란?
생성자, 같은 클래스의 다른 생성자를 호출할 때 사용, 반드시 첫 번째 줄에 선언해야 함

=== 메소드 ===

메소드란?
수학의 함수와 비슷하며 호출을 통해 사용, 전달 값이 없는 상태로 호출을 하거나
어떤 값을 전달하여 호출을 하며, 함수 내에 작성된 연산 수행
수행 후 반환 값 / 결과 값은 있거나 없을 수 있음

메소드 접근제한자
public    : 전체 접근
protected : 클래스 + 패키지 + 자손 클래스 (같은 패키지 + 상속)
(default) : 클래스 + 패키지 (같은 패키지)
private   : 클래스 (같은 클래스)

메소드 예약어
static       : static 영역에 할당하여 객체 생성 없이 사용
final        : 종단의 의미, 상속 시 오버라이딩 불가능
abstract     : 미완성된, 상속하여 오버라이딩으로 완성시켜 사용해야 함
synchronized : 동기화 처리, 공유 자원에 한 개의 스레드만 접근 가능함
static final : static과 final의 의미를 둘 다 가짐
(== final static)

메소드 반환형
void     : 반환형이 없음을 의미, 반환 값이 없을 경우 반드시 작성
기본 자료형 : 연산 수행 후 반환 값이 기본 자료형일 경우 사용
배열      : 연산 수행후 반환 값이 배열인 경우 배열의 주소값이 반환
클래스     : 연산 수행후 반환 값이 해당 클래스 타입의 객체일 경우 해당 객체의 주소값이 반환 (클래스 == 타입)

매개변수 : 두 개 이상의 변수 사이의 함수 관계를 간접적으로 표시할 때 사용하는 변수

메소드 매개변수 (* 매개변수의 수에 제한이 없다.)
()       : 매개변수가 없는 것을 의미
기본 자료형 : 기본형 매개변수 사용 시 값을 복사하여 전달 매개변수 값을 변경하여도 본래 값은 변경되지 않음
배열      : 배열, 클래스 등 참조형을 매개변수로 전달 시에는 데이터의 주소 값을
클래스     : 전달하기 때문에 매개변수를 수정하면 본래의 데이터가 수정됨(얕은 복사)
가변인자   : 매개변수의 개수를 유동적으로 설정하는 방법으로 가변 매개변수 외 다른 매개변수가 있으면 가변 매개변수를 마지막에 설정
* 방법 : (자료형 ... 변수명)

getter와 setter메소드
getter / setter  ( 필드에 직접접근을 할 수 없어서 간접접근을 하기 위해 사용)

getter 메소드 : 필드에 기록된 값을 읽어서 요청한 쪽으로 읽은 값을 넘기는 메소드 (return)
setter 메소드 : 필드에 변경할 값을 전달 받아서 필드 값을 변경하는 메소드 (this)

return : 해당 메소드를 종료하고 자신을 호출한 메소드로 돌아가는 예약어
반환 값이 있다면 반환 값을 가지고 자신을 호출한 메소드로 돌아감

=== 객체 배열 ===

객체배열이란?
객체 참조형 변수를 저장하는 배열로 배열의 자료형을 클래스명(사용자 정의 자료형)으로 지정하여 활용

객체배열 선언
클래스명[] 배열명;    ex) Academy[] arr;
클래스명 배열명[ ];  ex) Academy arr[];

객체배열 할당
배열명 = new 클래스명[배열크기]; ex) arr = new Academy[5];

객체배열 선언과 동시에 할당
클래스명 배열명[ ] = new 클래스명[배열크기]; ex) Academy[] arr = new Academy[5];


객체배열 초기화
인덱스를 이용한 초기화
배열명[i] = new 클래스명();
ex) arr[0] = new Academy(1, "KH정보교육원");
ex) arr[1] = new Academy(2, "케이에이치");

선언과 동시에 할당 및 초기화
클래스명 배열명[]
= {new 클래스명(), new 클래스명()};

ex) Academy arr[] = {
new Academy(1, "KH정보교육원"),
new Academy(2, "케이에이치") };

=== 상속 ===

상속이란?
다른 클래스(부모)가 가지고 있는 멤버(필드, 메소드)들을 새로 작성할 클래스(자식)에서 직접 만들지 않고
상속을 받음으로써 새 클래스(자식)가 자신의 멤버처럼 사용할 수 있는 기능

상속의 목적
클래스의 재사용, 연관된 일련의 클래스들에 대한 공통적인 규약 정의

상속의 장점
1. 보다 적은 양의 코드로 새로운 클래스 작성 가능 // 재사용성 증가
2. 코드를 공통적으로 관리하기 때문에 코드의 추가 및 변경 용이 // 중복 제거
3. 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여 // 유지보수성 향상(용이)

상속 방법
클래스 간의 상속 시에는 extends 키워드 사용

상속 표현식
[접근제한자] class 클래스명(자식) extends 클래스명(부모) {}
public class Academy extends Company {}

단일 상속
클래스간의 관계가 다중 상속보다 명확하고 신뢰성 있는 코드 작성
자바에서는 다중 상속 미지원 → 단일상속만 지원

다중 상속
C++에서 가능한 기능으로 여러 클래스로부터 상속을 받으며
복합적인 기능을 가진 클래스를 쉽게 작성 가능
서로 다른 클래스로부터 상속 받은 멤버 간의 이름이 같은 경우 문제 발생

상속의 특징
1. 모든 클래스는 Object클래스의 후손
2. 부모클래스의 생성자, 초기화 블록은 상속 안 됨
3. 부모의 private멤버는 상속은 되지만 직접 접근 불가

super()와 super.

super()
부모 객체의 생성자를 호출하는 메소드로 기본적으로 후손 생성자에 부모 생성자 포함
후손 객체 생성 시에는 부모부터 생성이 되기 때문에 후손 클래스 생성자 안에는
부모 생성자를 호출하는 super()가 첫 줄에 존재 (부모 생성자가 가장 먼저 실행되어야 하기
때문에 명시적으로 작성 시에도 반드시 첫 줄에만 작성)
매개변수 있는 부모 생성자 호출은 super(매개변수, 매개변수)를 넣으면 됨

super.
상속을 통한 자식 클래스 정의 시 해당 자식 클래스의 부모 객체를 가리키는 참조변수
자식 클래스 내에서 부모 클래스 객체에 접근하여 필드나 메소드 호출 시 사용

오버라이딩(Overriding)
자식 클래스가 상속 받은 부모 메소드를 재작성 하는 것
부모가 제공하는 기능을 후손이 일부 고쳐 사용하겠다는 의미로
자식 객체를 통한 실행 시 후손 것이 우선권을 가짐

특징 : 접근 제어자를 부모 것보다 같거나 넓은 범위로 변경 가능
(조건 : 
부모 클래스의 메소드와 자식 클래스의 메소드 비교
- 메소드 이름 동일
- 매개변수의 개수, 타입, 순서 동일
- 리턴 타입 동일
- private 메소드 오버라이딩 불가)

오버로딩(Overloading)
한 클래스 내에서 같은 이름의 메소드를 여러 개 정의하는 것
(조건 : 같은 메소드 이름 / 다른 매개변수 선언부(매개변수 타입, 개수, 순서))



=== 다형성 ===

다형성이란? // 하나의 객체가 다양한 형태를 지니는 성질
객체 지향 언어의 특징 중 하나로 ‘다양한 형태를 갖는다’라는 뜻으로
하나의 행동으로 여러 가지 일을 수행하는 개념.
"상속을 이용한 기술"로 "부모 클래스 타입 참조변수" 하나로
상속 관계에 있는 여러 타입의 "자식 객체를 참조"할 수 있는 기술


클래스 형변환
업 캐스팅  : 상속 관계에 있는 부모, 자식 클래스 간에 부모타입의 참조형 변수가
모든 자식 타입 객체의 주소를 참조할 수 있음

다운 캐스팅 : 자식 객체의 주소를 받은 부모 참조형 변수를 가지고 자식의 멤버를 참조해야 할 경우,
"부모 클래스 타입의 참조형 변수를 자식 클래스 타입으로 형변환 하는 것"
자동으로 처리되지 않기 때문에 반드시 자식 타입을 명시하여 형변환


바인딩     : 실제 실행할 메소드 코드와 호출하는 코드를 연결 시키는 것
정적 바인딩 : 프로그램이 실행되기 전 컴파일 단계에서 메소드와 메소드 호출부를 연결
동적 바인딩 : 컴파일 시 정적 바인딩된 메소드를 실행할 당시의 객체 타입을 기준으로 바인딩 되는 것

추상 클래스
"몸체 없는 메소드를 포함한 클래스 (미완성 설계도)"
추상 클래스일 경우 클래스 선언부에 abstract 키워드 사용

[접근제한자] abstract class 클래스명 {}
[public] abstract class 클래스명 {}

추상 메소드
"몸체 없는 메소드"
추상 메소드의 선언부에 abstract 키워드 사용
상속 시 반드시 구현해야 하는, 오버라이딩이 강제화되는 메소드

[접근제한자] abstract 반환형 메소드명(자료형 변수명);
[public] abstract void 메소드명(자료형 변수명);

추상클래스 특징
1. 미완성 클래스(abstract 키워드 사용)
자체적으로 객체 생성 불가 → 반드시 상속하여 객체 생성
2. abstract 메소드가 포함된 클래스는 반드시 abstract 클래스
abstract 메소드가 없어도 abstract 클래스 선언 가능 // 객체 생성 제한
3. 클래스 내에 일반 변수, 메소드 포함 가능
4. 객체 생성은 안되지만 참조형 변수 타입으로는 사용 가능 // 부모 참조 변수 = 자식 객체;

추상클래스 장점 (오버라이딩 강제화)
상속 받은 자식에게 공통된 멤버 제공.
일부 기능의 구현을 강제화(공통적이나 자식 클래스에 따라 재정의 되어야 하는 기능).

인터페이스란?
상수형 필드와 추상 메소드만을 작성할 수 있는 추상 클래스의 변형체
메소드의 통일성을 부여하기 위해 추상 메소드만 따로 모아놓은 것으로
상속 시 인터페이스 내에 정의된 모든 추상메소드 구현해야 함

인터페이스 특징
1. 모든 인터페이스의 메소드는 묵시적으로 public abstract
2. 변수는 묵시적으로 public static final
3. 객체 생성은 안되나 참조형 변수로는 가능(다형성)

인터페이스 장점
다형성을 이용하여 상위 타입 역할(자식 객체 연결)
인터페이스 구현 객체에 공통된 기능 구현 강제화 (== 구현 객체간의 일관성 제공)
공동 작업을 위한 인터페이스 제공

abstact class -> interface

class : 객체 만드는 용도
interface : 접점을 만드는 용도

추상클래스와 달리
- 접점 의미 추가
- 클래스 선언부 변경(class -> interface)
- 필드/메서드 작성법이 고정


=== 예외 처리 ===

프로그램 오류(Error)
프로그램 수행 시 치명적 상황이 발생하여 비정상 종료 상황이 발생한 것, 프로그램 에러라고도 함

오류의 종류
1. 컴파일 에러 : 프로그램의 실행을 막는 소스 코드상의 문법 에러. 소스 코드 수정으로 해결.
2. 런타임 에러 : 프로그램 실행 중 발생하는 에러. 주로 if문 사용으로 에러 처리
(ex. 배열의 인덱스 범위를 벗어났거나, 계산식의 오류)
3. 시스템 에러 : 컴퓨터 오작동으로 인한 에러, 소스 코드 수정으로 해결 불가

오류 해결 방법
소스 코드 수정으로 해결 가능한 에러를 예외(Exception)라고 하는데
이러한 예외 상황(예측 가능한 에러) 구문을 처리 하는 방법인 예외 처리를 통해 해결

예외 확인
Exception 확인하기
Java API Document에서 해당 클래스에 대한 생성자나 메소드를 검색하면
그 메소드가 어떤 Exception을 발생시킬 가능성이 있는지 확인 가능.
-> 발생하는 예외를 미리 확인하여 상황에 따른 예외 처리 코드를 작성할 수 있음

Unchecked Exception
RuntimeException 클래스
Unchecked Exception으로 주로 프로그래머의 부주의로 인한 오류인 경우가 많기 때문에
예외 처리보다는 코드를 수정해야 하는 경우가 많음


=== 컬렉션 ===
메모리상에서 자료를 구조적으로 처리하는 방법을 자료구조라 일컫는데
컬렉션(Collection)은 자바에서 제공하는 자료구조를 담당하는 프레임워크
추가, 삭제, 정렬 등의 기능처리가 간단하게 해결 되어 자료구조적 알고리즘을 구현할 필요 없음

자료구조 : 데이터(자료)를 메모리에서 구조적으로 처리하는 방법론이다.

배열의 문제점 & 컬렉션의 장점
1. 한 번 크기를 지정하면 변경할 수 없다.
- 공간 크기가 부족하면 에러가 발생 할당 시 넉넉한 크기로 할당하게 됨 (메모리 낭비)
- 필요에 따라 공간을 늘리거나 줄일 수 없음
2. 배열에 기록된 데이터에 대한 중간 위치의 추가, 삭제가 불편하다.
- 추가, 삭제할 데이터부터 마지막 기록된 데이터까지 하나씩 뒤로 밀어내고 추가해야 함
(복잡한 알고리즘)
3. 한 타입의 데이터만 저장 가능하다.


List : 자료들을 순차적으로 나열한 자료구조로 인덱스로 관리되며, 중복해서 객체 저장 가능

ArrayList
List의 후손으로 초기 저장 용량은 10으로 자동 설정되며 따로 지정도 가능
저장 용량을 초과한 객체들이 들어오면 자동으로 늘어나며 고정도 가능
동기화(Synchronized)를 제공하지 않음

Vector
List의 후손
ArrayList와 동등하지만 동기화(Synchronized)를 제공한다는 점이 ArrayList와 차이점
List 객체들 중에서 가장 성능이 좋지 않음

LinkedList
List의 후손으로, 인접 참조를 링크해 체인처럼 관리
특정 인덱스에서 객체를 제거하거나 추가하게 되면 바로 앞/뒤 링크만 변경하면 되기 때문에
객체 삭제와 삽입이 빈번하게 일어나는 곳에서는 ArrayList보다 성능이 좋음

Set
저장 순서가 유지되지 않고, 중복 객체도 저장하지 못하게 하는 자료 구조
null도 중복을 허용하지 않기 때문에 1개의 null만 저장
구현 클래스로 HashSet, LinkedHashSet, TreeSet이 있음

HashSet
Set에 객체를 저장할 때 hash함수를 사용하여 처리 속도가 빠름
동일 객체 뿐 아니라 동등 객체도 중복하여 저장하지 않음

LinkedHashSet
HashSet과 거의 동일하지만 Set에 추가되는 순서를 유지한다는 점이 다름

Collection : 자바의 자료구조 모음
List : 순서 유지(인덱스 O), 중복 데이터 O
Set : 순서 X(인덱스 X), 중복 데이터 X
	-> equals(), hashCode() 오버라이딩 필요
Map : 키(key)와 값(value)으로 구성되어 있으며, 키와 값은 모두 객체
int a (<-key) = 10; (<-value)
int b (<-key) = 20; (<-value)
int c (<-key) = 30; (<-value)
d = 40; (temp)
a~d (<-set)

temp.get("a") == 10
temp.put("d", 40);


향상된 for문 : for(참조변수 : 배열 또는 컬렉션)
			Iterator(반복자)


=== 입출력 ===

입출력이란?
Input과 Output의 약자, 컴퓨터 내부 또는 외부 장치와 프로그램 간의 데이터를 주고 받는 것
장치와 입출력을 위해서는 하드웨어 장치에 직접 접근이 필요한데 다양한 매체에 존재하는 데이터들을
사용하기 위해 입출력 데이터를 처리할 공통적인 방법으로 스트림 이용

스트림(Stream) 클래스
입출력 장치에서 데이터를 읽고 쓰기 위해서 자바에서 제공하는 클래스
모든 스트림은 단방향이며 각각의 장치마다 연결할 수 있는 스트림 존재
하나의 스트림으로 입출력을 동시에 수행할 수 없으므로 동시에 수행하려면 2개의 스트림 필요


=== 네트워크 ===
여러 대의 컴퓨터를 통신 회선으로 연결한 것(홈 네트워크, 지역 네트워크, 인터넷 등이 해당)
여러 통신기기들을 서로 연결하여 데이터를 손쉽게 주고받거나 자원 등을 공유하기 위해 사용

서버와 클라이언트
Server : 서비스를 제공하는 컴퓨터 또는 프로그램
Client : 서비스를 요청하는 컴퓨터 또는 프로그램

IP주소 : "네트워크 상에서 컴퓨터를 식별하는 번호"로 네트워크 어댑터(랜카드)마다 할당 되어 있음

포트 (Port) :
"같은 컴퓨터 내에서 프로그램을 식별하는 번호"로
클라이언트는 서버 연결 요청 시 IP주소와 포트 번호를 알아야 함

소켓 (Socket) : 프로세스 간의 통신에 사용되는 양쪽 끝 단

프로토콜 (Protocol) :
컴퓨터 간의 정보를 주고 받을 때의 통신방법에 대한 규약으로
접속이나, 전달방식, 데이터의 형식, 검증 방법 등을 맞추기 위한 약속

TCP(Transmission Control Protocol) :
데이터의 전달의 신뢰성을 최대한 보장하기 위한 방식으로 "연결지향형 통신"이다.
순차적으로 데이터를 전송하고 확인 및 오류 시 재전송을 한다.

UDP(User Datagram Protocol) :
데이터의 빠른 전달을 보장하기위한 방식으로 "비연결 지향형 통신"이다.
확인 및 재전송 작업이 없다.


--
final 클래스
class명 앞에 final이 붙은 class로서 상속이 불가능하다. 그렇다면 왜 final class를 사용하는 것일까?
이는 보안상의 이유때문인데, Java에서는 이론상으로는 중요한 class의 sub class를 만들어 sub class로 하여금 시스템을 파괴하도록 할 수 있기 때문에 Java 시스템은 중요한 class에 대해서는 final class로 선언하고 있다. 대표적인 것이 String class이다.
final class로 선언되면 상속받을 수 없기 때문에 당연히 내부의 모든 method는 overridding(재정의)될 수 없다.

final 메소드
그런데 final class가 아닌 일반 class에서 특정 method만 오버라이딩할 수 없게 할려면 어떻게 해야할까?
method명 앞에 final을 붙이면 된다. 그렇게하면 해당 method는 오버라이딩이 불가능하다. fanal method는 왜 사용할까?
부모 클래스에서 정의한 method 기능을 자식 클래스가 그대로 쓰게하고 싶을떄 사용한다.
예를들어 부모클래스에 speak()라는 메소드가 존재할때 해당메소드는 입으로 말하도록 기능이 정의되어 있다. 그런데 해당클래스를 상속받은 자식클래스가 speak()메소드를 재정의하여 손으로 말하도록 기능을 바꿀 수 있는데, 이러한 것을 원치않을때 사용할 수 있다.

final 필드
final 필드는 한번 초기화하면 더이상 그 값을 변경할 수 없도록한다. 즉, 상수가 되버린다. 그래서 상수화를 위해 사용한다. 상수는 모든 클래스에서 공통적으로 사용될 수 있고 여러개 생성하면 오히려 메모리 낭비이기 때문에 static키워드를 붙어 한번만 생성하고 모든 클래스가 공유하도록 한다.
(final static 변수명)
상수화가 필요한 경우는 언제일까? 변하는지 않는 값을 다같이 쓰고싶을떄이다. 예를들어 우리가 수학공식에서 자주사용하는 3.14(파이)같은 경우 변수에 저장한 후 변경할 필요가 없는 상수이다. 이러한 상수를 이용하고 싶을떄 static final 필드로 선언하면 편할것 이다.


*/
		
	}
	
	
	
	
	

}
