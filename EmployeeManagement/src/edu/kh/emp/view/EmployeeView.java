package edu.kh.emp.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.emp.model.service.EmployeeService;
import edu.kh.emp.model.vo.Employee;

public class EmployeeView {
	// 필드
	private Scanner sc = new Scanner(System.in);
	
	// 기능 제공용 클래스
	private EmployeeService service = new EmployeeService();
	
	public void displayMenu() {
		
		int input = 0;
		
		do {
			System.out.println("\n========== 사원 관리 프로그램 ==========\n");
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			try {
			System.out.println("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine();
			System.out.println();	
			
			switch(input) {
			case 1 : addEmp(); break;
			case 2 : selectAll(); break;
			case 3 : ; break;
			case 4 : ; break;
			case 5 : ; break;
			case 6 : ; break;
			case 7 : ; break;
			case 8 : ; break;
			case 0 : System.out.println("0. 프로그램 종료"); break;
			default : System.out.println("잘못 입력하셨습니다.");
			
			}
			System.out.println();
			
			} catch(InputMismatchException e) {
				System.out.println("[error] 입력 형식이 유효하지 않습니다.\n");
				
				input = -1; // 첫 반복 시 잘못 입력된 경우 while문이 종료되지 않도록 하는 값
				sc.nextLine(); // 입력 버퍼에 남아있는 잘못된 문자열을 꺼내와 제거
			
			
			}
			
			
			
		} while(input != 0);
		
		
		
		
		
		
		
		
	}
	
	/**
	 * 1. 사원 정보 추가 메서드
	 */
	public void addEmp() {
		System.out.println("===== 사원 정보 추가 =====");
		// 사원 번호, 사원 이름, 주민등록번호, 이메일, 전화번호, 부서명, 직급명, 급여
		
		System.out.print("사원 번호(사번) : ");
		int empId = sc.nextInt();
		
		System.out.print("사원 이름 : ");
		String empName = sc.next();
				
		System.out.print("주민등록번호 : ");
		String empNo = sc.next();
				
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("전화번호 : ");
		String phone = sc.next();
		
		System.out.print("부서명 : ");
		String departmentTitle = sc.next();
		
		System.out.print("직급명 : ");
		String jobName = sc.next();
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		
		
		
		
		if(service.addEmp(empId, empName, empNo, email, phone, departmentTitle, jobName, salary)) {
			System.out.println("[추가 완료]");
		} else {
			System.out.println("[error] 학생 정보 추가 실패");
		}
		
	}
	
	/**
	 * 2. 전체 사원 정보 조회 메서드
	 */
	public void selectAll() {
		
		List<Employee> empList = service.getEmpList();
		
		// 일반 for문
		for(int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i)/*.toString()*/);
			// .toString() 사용하지 않아도 자동으로 사용됨
		}
		
		System.out.println("---------------------");
		
		// 향상된 for문
		// - 배열 또는 컬렉션의 모든 요소를
		// 처음부터 끝까지 순차 접근할 때 사용하는 for문 (foreach 문)
		
		// for(요소 하나를 꺼내서 참조할 변수 : 배열 또는 컬렉션)
		
		for(Employee e : empList) {
			System.out.println(e);
		}
		
		
	}
	
}
