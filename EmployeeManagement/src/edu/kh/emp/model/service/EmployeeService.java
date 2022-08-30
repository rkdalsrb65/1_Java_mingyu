package edu.kh.emp.model.service;

import java.util.ArrayList;
import java.util.List;

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
