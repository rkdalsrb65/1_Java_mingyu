package edu.kh.emp.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import edu.kh.emp.model.vo.Employee;

public class EmployeeService {

	private List<Employee> empList = new ArrayList<Employee>();
	
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
	private int empIdCount = 1;
	
	public EmployeeService() {
		empList.add(new Employee(empIdCount++, "김김김", "550505-1111111", "rla@rla.com", "010-1111-1111", "대표", "회장", 10000000));
		empList.add(new Employee(empIdCount++, "나나나", "660606-1222222", "sk@sk.com",  "010-2222-2222", "경영", "사장", 9000000));
		empList.add(new Employee(empIdCount++, "박박박", "770707-1333333", "qkr@qkr.com",  "010-3333-3333", "운영", "부장", 8000000));
		empList.add(new Employee(empIdCount++, "이이이", "880808-1444444", "dl@dl.com", "010-4444-4444", "영업", "차장", 7000000));
		empList.add(new Employee(empIdCount++, "강강강", "990909-1555555", "rkd@rkd.com", "010-5555-5555", "회계", "과장", 6000000));
		empList.add(new Employee(empIdCount++, "최최최", "000101-1666666", "chl@chl.com", "010-6666-6666", "마케팅", "대리", 5000000));
		empList.add(new Employee(empIdCount++, "고고고", "010202-1777777", "rh@rh.com", "010-7777-7777", "마케팅", "사원", 4000000));
	}
	
	
	public boolean addEmp(int empId, String empName, String empNo, String email, String phone, String departmentTitle,
			String jobName, int salary) {
		Employee emp = new Employee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary);
		return empList.add(emp);
	}

	public void EmployeeService() {
		
	}

	
	
	/** 사원 전체 조회 시 stdList 반환 메서드
	 * @return
	 */
	public List<Employee> getEmpList() {
		return empList;
	}



	public boolean addEmp(Employee emp) {
		return false;
	}

	public Object selectAll() {
		return null;
	}

	public Object selectEmpNo(int empId) {
		return null;
	}

	public Employee updateEmployee(Employee updateEmp) {
		return updateEmp;
		
	}

	public Object selectDepartment(String departmentTitle) {
		
		return departmentTitle;
	}

	public Object selectSalary(int salary) {
		
		return salary;
	}

	public Map<String, Integer> departmentalSalay() {
		
		return departmentalSalay();
	}

	public Employee updateEmployee(int empId) {
		
		return null;
	}
	
\
	
}
