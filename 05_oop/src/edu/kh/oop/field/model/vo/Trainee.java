package edu.kh.oop.field.model.vo;

public class Trainee { // 훈련생

	public String name; // 이름
	public String phone; // 전화번호
	public String email; // 이메일(선택)
	public int salary; // 급여(훈련수당)
	
	public static char classRoom; // 강의장
	
	// 명시적 초기화 : 필드 선언 시 바로 값 초기화
	// ex) public String email = "없음";
	
	// 초기화 블록 : 객체(instance) 객체의 필드를 초기화 하는 블록
	// - instance block : static이 없는 필드 변수 값 초기화(생성 시 마다)
	// - static block   : static이 있는 필드 변수 값 초기화(프로그램 실행 시 1회)
	
	{ // instance block
		email = "없음";
		salary = 116000;
	}
	
	static { // static block
		classRoom = 'A';
	}
	
	
	
	
	/*  지역변수 : 필드를 제외하고, {} 내에서 선언된 변수
	    해당 {} 내에서 만 사용 가능하고, {} 종료 시 사용 불가
	    
	    public void ex(){
	    int num; // ex() 메서드의 지역 변수
	    for(int i=0; i<10; i++){ // 초기식 i는 for문의 지역 변수
	    num; // 사용 가능
	    }
	    }
	    
	    num; // 에러
	    
	    필드(field) == 멤버 변수 != 전역 변수(같은 것 아님)
	    
	    1. 인스턴스 변수 : static이 없는 변수
	    인스턴스 생성 시 heap 영역에 생성되는 변수
	    
	    2. 클래스 변수(static) : static이 있는 변수
	    프로그램 실행 시 static 영역에 생성될 때 클래스명,변수명 으로 생성되는 변수
	    
	    
	    
	    
	객체를 생성할 때 사용하는 기능(메서드)
	생성자 규칙 : 생성자명을 클래스명과 똑같이 지정해주어야 함
	    
	 */
	
	
	
	
	
	
	
	
	
	
	
}
