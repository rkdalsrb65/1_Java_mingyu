package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.model.vo.Student;

public class StudentService {
	// 부모 타입 참조 변수 List
	private List<Student> stdList = new ArrayList<Student>();
							// Student 타입으로 제한된 ArrayList객체 생성

	/** stdList에 학생 정보 추가 메서드
	 * @param name
	 * @param age
	 * @param address
	 * @param gender
	 * @param score
	 * @return
	 * true : 학생 정보 추가 성공 시
	 * false : 학생 정보 추가 실패 시
	 */
	public boolean addStudent(String name, int age, String address, char gender, int score) {
		
		Student std = new Student(name, age, address, gender, score);
		

		
		// 제네릭 확인 테스트
//		List test1 = new ArrayList<String>();		
//		List<String> test2 = new ArrayList<String>();		
//		List<Integer> test3 = new ArrayList<Integer>();
		
		// List.add(E e) -> 제네릭 <E>에 작성되는 타입으로 모든 E가 변화함
		// test1.add(Object e) -> 타입 제한 X, 모든 참조 변수가 Object 타입
		// test2.add(String e) -> 타입 제한 O, 모든 참조 변수가 String 타입
		// test3.add(Integer e) -> 타입 제한 O, 모든 참조 변수가 Integer 타입

		// boolean add(Student e) : add() 결과로 boolean 반환
		return stdList.add(std);
		
	}	
	
	
	/** 학생 전체 조회 시 stdList 반환 메서드
	 * @return
	 */
	public List<Student> getStdList(){
		return stdList;
	}
	
	
	
}
