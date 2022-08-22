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
protected : 클래스 + 패키지 + 자손 클래스
(default) : 클래스 + 패키지
private   : 클래스

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

getter 메소드 : 필드에 기록된 값을 읽어서 요청한 쪽으로 읽은 값을 넘기는 메소드
setter 메소드 : 필드에 변경할 값을 전달 받아서 필드 값을 변경하는 메소드

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






*/
		
	}
	
	
	
	
	

}
