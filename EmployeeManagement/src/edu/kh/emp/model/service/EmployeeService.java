package edu.kh.emp.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.emp.model.vo.Employee;

public class EmployeeService implements EmployeeService2{

	/** addList에 사원 정보 추가 메서드
	 * @param empId
	 * @param empName
	 * @param empNo
	 * @param email
	 * @param phone
	 * @param departmentTitle
	 * @param jobName
	 * @param salary
	 * @return
	 */
	private int empIdCount = 1; // 사원 번호를 지정하기 위한 값 / 사원이 추가될 때 마다 1씩 증가
	private List<Employee> empList = new ArrayList<>(); // 사원 정보를 저장하기 위한 list
	
	public EmployeeService() {
		empList.add(new Employee(empIdCount++, "김김김", "550505-1111111", "rla@rla.com", "010-1111-1111", "대표", "회장", 10000000));
		empList.add(new Employee(empIdCount++, "나나나", "660606-1222222", "sk@sk.com",  "010-2222-2222", "경영", "사장", 9000000));
		empList.add(new Employee(empIdCount++, "박박박", "770707-1333333", "qkr@qkr.com",  "010-3333-3333", "운영", "부장", 8000000));
		empList.add(new Employee(empIdCount++, "이이이", "880808-1444444", "dl@dl.com", "010-4444-4444", "영업", "차장", 7000000));
		empList.add(new Employee(empIdCount++, "강강강", "990909-1555555", "rkd@rkd.com", "010-5555-5555", "회계", "과장", 6000000));
		empList.add(new Employee(empIdCount++, "최최최", "000101-1666666", "chl@chl.com", "010-6666-6666", "마케팅", "대리", 5000000));
		empList.add(new Employee(empIdCount++, "고고고", "010202-1777777", "rh@rh.com", "010-7777-7777", "마케팅", "사원", 4000000));
	}
	
	
//	public boolean addEmp(int empId, String empName, String empNo, String email, String phone, String departmentTitle,
//			String jobName, int salary) {
//		Employee emp = new Employee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary);
//		return empList.add(emp);
//	}

	
	// 새로운 사원 정보 추가 서비스 
		@Override
		public boolean addEmp(Employee emp) {
			emp.setEmpId(empIdCount++);
			return empList.add(emp);
		}

		// 사원 리스트 반환 서비스
		@Override
		public List<Employee> selectAll() {
			return empList;
		}

		// 사번이 일치하는 사원 정보 조회 서비스
		@Override
		public Employee selectEmpNo(int empId) {
			Employee emp = null;
			for(Employee e : empList) {
				if(e.getEmpId() == empId) {
					emp = e;
					break;
				}
			}
			
			return emp;
		}

		// 사번이 일치하는 사원 정보 수정 서비스
		@Override
		public void updateEmployee(Employee updateEmp) {
			
			Employee emp = selectEmpNo(updateEmp.getEmpId());
			
			emp.setEmail(updateEmp.getEmail());
			emp.setPhone(updateEmp.getPhone());
			emp.setDepartmentTitle(updateEmp.getDepartmentTitle());
			emp.setJobName(updateEmp.getJobName());
			emp.setSalary(updateEmp.getSalary());
		}

		// 사번이 일치하는 사원 정보 삭제 서비스
		@Override
		public Employee deleteEmployee(int empId) {
			Employee deleteEmp = null;
			
			for(int i=0 ; i<empList.size() ; i++) {
				if(empList.get(i).getEmpId() == empId) {
					deleteEmp = empList.remove(i);
					break;
				}
			}
			return deleteEmp;
		}

		// 입력 받은 부서와 일치 모든 사원 정보 조회 서비스
		@Override
		public List<Employee> selectDepartment(String departmentTitle) {
			List<Employee> searchList = new ArrayList<>();
			
			for(Employee emp : empList) {
				if(emp.getDepartmentTitle().equals(departmentTitle)) {
					searchList.add(emp);
				}
			}
			return searchList;
		}
		
		// 입력 받은 부서와 일치 모든 사원 정보 조회 서비스
		@Override
		public List<Employee> selectSalary(int salary) {
			List<Employee> searchList = new ArrayList<>();
			
			for(Employee emp : empList) {
				if(emp.getSalary() >= salary) {
					searchList.add(emp);
				}
			}
			return searchList;
		}

		// 부서별 급여 합 전체 조회
		@Override
		public Map<String, Integer> departmentalSalay() {
			
			Map<String, Integer> map = new HashMap<>();
			
			for(Employee emp : empList) {
				String key = emp.getDepartmentTitle();
				int value =  map.get(key) == null ? 0 : map.get(key); // 삼항 연산자
							// map에서 일치하는 key가 없으면 0, 있으면 해당 value 반환
				map.put(key, value + emp.getSalary());
			}
			
			return map;
		}
	
	
	
	
	
	
	
	
//	public void EmployeeService() {
//		
//	}

	
	
//	/** 사원 전체 조회 시 stdList 반환 메서드
//	 * @return
//	 */
//	public List<Employee> getEmpList() {
//		return empList;
//	}
//
//
//
//	public boolean addEmp(Employee emp) {
//		return false;
//	}
//
//	public Object selectAll() {
//		return null;
//	}
//
//	public Object selectEmpNo(int empId) {
//		return null;
//	}
//
//	public Employee updateEmployee(Employee updateEmp) {
//		return null;
//		
//	}
//
//	public Object selectDepartment(String departmentTitle) {
//		
//		return null;
//	}
//
//	public Object selectSalary(int salary) {
//		
//		return null;
//	}
//
//	public Map<String, Integer> departmentalSalay() {
//		
//		return null;
//	}
//
//	public Employee updateEmployee(int empId) {
//		
//		return null;
//	}
//	
//	
//	
//	
	
	
	
	/** 사원 전체 조회 시 stdList 반환 메서드
	 * @return
	 */
//	public List<Employee> getEmpList() {
//		return empList;
//	}
//
//
//
//	public boolean addEmp(Employee emp) {
//		return false;
//	}
//
//	public Object selectAll() {
//		return null;
//	}
//
//	public Object selectEmpNo(int empId) {
//		return null;
//	}
//
//	public Employee updateEmployee(Employee updateEmp) {
//		return updateEmp;
//		
//	}
//
//	public Object selectDepartment(String departmentTitle) {
//		
//		return departmentTitle;
//	}
//
//	public Object selectSalary(int salary) {
//		
//		return salary;
//	}
//
//	public Map<String, Integer> departmentalSalay() {
//		
//		return departmentalSalay();
//	}
//
//	public Employee updateEmployee(int empId) {
//		
//		return null;
//	}
//	
}
