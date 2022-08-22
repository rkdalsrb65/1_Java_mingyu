package edu.kh.objectarray.model.service;

import edu.kh.objectarray.model.vo.Student;

// model : 비즈니스 로직(데이터 가공, 관리, DB 연결 등)
// service : 기능 제공용 클래스

public class StudentManagementService {

//	 Student 참조변수 5칸 짜리 객체 배열 생성
	private Student[] stdArr = new Student[5];
	
	public StudentManagementService() {
		stdArr[0] = new Student(3, 5, 17, "홍길동", 100, 30, 70);
		stdArr[1] = new Student(2, 3, 11, "박철수", 50, 100, 80);
		stdArr[2] = new Student(1, 7, 3, "김미영", 100, 100, 30);
		stdArr[3] = new Student(3, 8, 6, "장원영", 50, 70, 100);
	}
	
	/** 학생 추가 서비스 메서드
	 * @param grade
	 * @param classRoom
	 * @param number
	 * @param name
	 * @return 0 또는 1
	 */
	public int addStudent(int grade, int classRoom, int number, String name) {
		
		// 배열 요소 중 아무것도 참조하지 않는 (null)인덱스 찾기
		// 단, 모든 인덱스가 참조 중인 경우 0 반환
		
		// null인 인덱스 O -> 해당 인덱스에 객체 주소 대입 후 1 반환
		// null인 인덱스 X -> 0 반환
		
		// null 인덱스 찾기
		
		int idx = -1; // null인 인덱스가 몇 번째인지 저장하는 용도의 변수
		
		for(int i = 0; i < stdArr.length; i++) {
			if(stdArr[i] == null) { // 새로운 학생이 추가될 수 있는 자리가 있는 경우
				idx = i;
				break;
			}
		}
		
		if (idx == -1) { // null인 인덱스가 없는 경우
			return 0; // 현재 메서드를 종료하고 호출한 곳으로 0을 가지고 돌아감.
		}
		
		// null인 인덱스에 학생 객체를 생성해서 주소를 대입
		stdArr[idx] = new Student(grade, classRoom, number, name);
		
		
		return 1;
		
		
	}
	
	
	
}
