package edu.kh.oop.method.run;

import edu.kh.oop.method.view.UserView;

public class UserRun {

	public static void main(String[] args) {
		
		UserView view = new UserView(); // UserView 객체 생성
		
		view.displayMenu();
		
	}

}

/*
1차원 배열 : 같은 자료형의 변수를 하나의 묶음으로 다루는 것
2차원 배열 : 같은 1차원 배열 참조 변수를 하나의 묶음으로 다루는 것

User u = new User(); // user라는 객체를 참조변수 u로 선언 후 new (heap영역에 저장)

클래스명(User) = class = 사용자 정의 자료형


*/