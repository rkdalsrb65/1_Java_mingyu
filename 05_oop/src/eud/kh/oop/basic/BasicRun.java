package eud.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {
		
		KMG kmg = new KMG();
		// heap 영역에 KMG 클래스에 정의된 내용을 이용하여 KMG 객체 생성(할당)
		
		// 객체가 가지고 있는 속성 출력
		System.out.println("이름 : " + kmg.name);
		System.out.println("나이 : " + kmg.age);
		System.out.println("생년월일 : " + kmg.birthday);
		
		// 기능 수행
		kmg.study();
		kmg.eat();
		kmg.plus(50, 100);
		
		
		
		
	}
}
