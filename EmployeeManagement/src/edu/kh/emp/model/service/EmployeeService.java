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
		empList.add(new Employee(empIdCount++, "김대표", "700509-1234567", "dp_hong@emp.com", "010-1111-1111", "대표", "대표", 10000000));
		empList.add(new Employee(empIdCount++, "나부장", "751103-2987654", "bj_kim@emp.com",  "010-3456-7890", "회계", "부장", 6000000));
		empList.add(new Employee(empIdCount++, "박과장", "800317-1122334", "kj_lee@emp.com",  "010-2684-9753", "총무", "과장", 5000000));
		empList.add(new Employee(empIdCount++, "이대리", "900931-2654321", "dr_choi@emp.com", "010-8888-6666", "회계", "대리", 4000000));
		empList.add(new Employee(empIdCount++, "강사원", "950224-1678423", "sw_park@emp.com", "010-2222-3333", "마케팅", "사원", 3000000));
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
		return null;
		
	}

	public Object selectDepartment(String departmentTitle) {
		
		return null;
	}

	public Object selectSalary(int salary) {
		
		return null;
	}

	public Map<String, Integer> departmentalSalay() {
		
		return null;
	}

	public Employee updateEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
}
