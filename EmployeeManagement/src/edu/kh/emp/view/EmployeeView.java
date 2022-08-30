package edu.kh.emp.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
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
			
			try {
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
			
				System.out.println("메뉴 선택 >> ");
				input = sc.nextInt();
				System.out.println();	
			
				switch(input) {
				case 1 : addEmp(); break;
				case 2 : selectAll(); break;
				case 3: selectEmpId(); break;
				case 4: updateEmployee(); break;
				case 5: deleteEmployee(); break;
				case 6: selectDepartment(); break;
				case 7: selectSalary(); break;
				case 8: departmentalSalay(); break;
				case 0 : System.out.println("0. 프로그램 종료"); break;
				default : System.out.println("번호만 입력해주세요.");
			
			}
			System.out.println();
			
			} catch(InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다.\n");
				
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
		
		Employee emp = new Employee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary);
		
		
		if(service.addEmp(emp)) {
			System.out.println("사원 정보가 추가되었습니다.");
		} else {
			System.out.println("[error] 사원 정보 추가 실패");
		}
		
	}
	
	/**
	 * 2. 전체 사원 정보 조회 메서드
	 */
	public void selectAll() {
		
		System.out.println("<전체 사원 정보 조회>");
		printAll(service.selectAll());
		
//		List<Employee> empList = service.getEmpList();
//		
//		// 일반 for문
//		for(int i = 0; i < empList.size(); i++) {
//			System.out.println(empList.get(i)/*.toString()*/);
//			// .toString() 사용하지 않아도 자동으로 사용됨
//		}
//		
//		System.out.println("---------------------");
//		
//		// 향상된 for문
//		// - 배열 또는 컬렉션의 모든 요소를
//		// 처음부터 끝까지 순차 접근할 때 사용하는 for문 (foreach 문)
//		
//		// for(요소 하나를 꺼내서 참조할 변수 : 배열 또는 컬렉션)
//		
//		for(Employee e : empList) {
//			System.out.println(e);
//		}
		
		
	}

	private void printAll(Object selectAll) {
		
	}
	
	/**
	 * 사원 번호가 일치하는 사원 정보 조회
	 */
	public void selectEmpId() {
		System.out.println("<사번이 일치하는 차원 정보 조회>");
		int empId = inputEmpId();
		
		printOne(service.selectEmpNo(empId));
	}

	private void printOne(Object selectEmpNo) {
		
	}

	private int inputEmpId() {
		return 0;
	}
	
	
	

	/**
	 * 사원 번호가 일치하는 사원 정보 수정
	 */
	public void updateEmployee() {
		System.out.println("<사번이 일치하는 사원 정보 수정>");
	
		int empId = inputEmpId();

		if( service.selectEmpNo(empId) == null ) {
			System.out.println("사번이 일치하는 사원이 존재하지 않습니다.");
	
		} else {
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

			Employee updateEmp = new Employee();
			updateEmp.setEmpId(empId);
			updateEmp.setEmail(email);
			updateEmp.setPhone(phone);
			updateEmp.setDepartmentTitle(departmentTitle);
			updateEmp.setJobName(jobName);
			updateEmp.setSalary(salary);

			service.updateEmployee(updateEmp);
			}
		}
	

	/**
	 * 사원 번호가 일치하는 사원 정보 삭제
	 */
	public void deleteEmployee() {
		System.out.println("<사번이 일치하는 사원 정보 삭제>");
		
		int empId = inputEmpId();
		
		if( service.selectEmpNo(empId) == null) {
			System.out.println("사번이 일치하는 사원이 존재하지 않습니다.");
		} else {
			
			System.out.print("정말로 삭제하시겠습니까? (Y/N) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				Employee deleteEmp = service.updateEmployee(empId);
				System.out.println(deleteEmp.getEmpName() + "의 정보가 삭제되었습니다.");
			} else {
				System.out.println("삭제 취소");
			}
			
		}
		
	}	
	
	

	/**
	 * 입력 받은 부서와 일치 모든 사원 정보 조회
	 */
	public void selectDepartment() {
		System.out.println("입력 받은 부서와 일치 모든 사원 정보 조회");
		System.out.print("부서명 입력 : ");
		String departmentTitle = sc.next();
		
		printAll( service.selectDepartment(departmentTitle) );
	}
	

	/**
	 * 입력 받은 급여 이상을 받는 모든 사원 정보 조회
	 */
	public void selectSalary() {
		System.out.println("입력 받은 급여 이상을 받는 모든 사원 정보 조회");
		System.out.print("급여 입력 : ");
		int salary = sc.nextInt();
		
		printAll( service.selectSalary(salary));
	}
	
	

	/**
	 * 부서별 급여 합 전체 조회
	 */
	public void departmentalSalay() {
		System.out.println("부서별 급여 합 전체 조회");
		Map<String, Integer> map = service.departmentalSalay();
		
		System.out.println("부서 / 급여 합계");
		System.out.println("--------------");
		for(String key : map.keySet()) {
			System.out.printf(" %4s | %d\n", key, map.get(key));
		}
		
	}

	/** 사원 정보 모두 출력
	 * @param empList
	 */
	public void printAll(List<Employee> empList) {
		if(empList.isEmpty()) {
			System.out.println("조회된 사원 정보가 없습니다.");
			
		} else {
			System.out.println("사번 |   이름  | 주민 등록 번호 |        이메일        |   전화 번호   | 부서 | 직책 | 급여" );
			System.out.println("------------------------------------------------------------------------------------------------");
			for(Employee emp : empList) { 
				System.out.printf(" %2d  | %4s | %s | %20s | %s | %s | %s | %d\n",
						emp.getEmpId(), emp.getEmpName(), emp.getEmpNo(), emp.getEmail(), 
						emp.getPhone(), emp.getDepartmentTitle(), emp.getJobName(), emp.getSalary());
			}
		}
		
	}


	/** 사원 정보 1명 출력
	 * @param emp
	 */
	public void printOne(Employee emp) {
		if(emp == null) {
			System.out.println("사번이 일치하는 사원이 존재하지 않습니다.");
			
		} else {
			System.out.println("사번 |   이름  | 주민 등록 번호 |        이메일        |   전화 번호   | 부서 | 직책 | 급여" );
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.printf(" %2d  | %4s | %s | %20s | %s | %s | %s | %d\n",
					emp.getEmpId(), emp.getEmpName(), emp.getEmpNo(), emp.getEmail(), 
					emp.getPhone(), emp.getDepartmentTitle(), emp.getJobName(), emp.getSalary());
		}
	}

	
	
	/** 사원 번호를 입력 받아 반환하는 메서드
	 * @return
	 */
	public int inputEmpId1() {
		System.out.print("사번 입력 : ");
		int empNo = sc.nextInt();
		sc.nextLine();
		return empNo;
	}	
	
	
	
	
	
	
	
	
}
