package edu.kh.inheritance.model.vo;

public class Person {
	
	private String name;
	private int age;
	
	// ctrl + space bar + enter : 기본 생성자
	public Person() {
		
	}
	
	// alt + s -> o  또는  alt + shift + s -> o
	// Generate Canstructor using Fields... 
	// 매개변수 생성자 
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* 
	상속
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





	*/
}
