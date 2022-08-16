package eud.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {
		
		// object(객체) : 게임 object(지형, 사물, 플레이어)
		
		// 사물(물건, 음식), 생물, 눈에 보이지 않는 것,개념적인 것 -> 공통점 : 인지 가능한 것 == 객체	
		
		// 객체와 객체의 상호 작용으로 세상이 돌아간다(사건이 발생한다)
		
		KMG kmg = new KMG();
		// heap 영역에 KMG 클래스에 정의된 내용을 이용하여 KMG 객체 생성(할당)
		
		// 객체가 가지고 있는 속성 출력
		System.out.println("이름 : " + kmg.name);
		System.out.println("나이 : " + kmg.age);
		System.out.println("생년월일 : " + kmg.birthday);
//		System.out.println("비밀번호 : " + kmg.password);
		
		// 비밀번호를 볼 수 있는 기능을 호출 == 간접 접근 방법
		kmg.showPassword();
		
		// 기능 수행
		kmg.study();
		kmg.eat();
		kmg.plus(50, 100);
		
		
		
		
	}
}
