package edu.kh.emp.run;

import edu.kh.emp.model.service.EmployeeService;
import edu.kh.emp.view.EmployeeView;

public class EmployeeRun {

	public static void main(String[] args) {
		
		
		EmployeeService service = new EmployeeService();

		new EmployeeView().displayMenu();
	}

}
