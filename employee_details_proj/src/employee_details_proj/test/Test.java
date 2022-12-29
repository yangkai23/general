package employee_details_proj.test;

import java.util.List;
import java.util.TreeSet;

import employee_details_proj.dto.Employee;
import employee_details_proj.service.EmployeeService;

public class Test {
public static void main(String[] args) {
	Employee employee=new Employee();
	employee.setFirstName("Revanth");
	employee.setLastName("Gaddamsetti");
	employee.setDob("27-10-2000");
	employee.setDoj("25-11-2021");
	employee.setExperience(1);
	employee.setDesignation("trainee");
	Employee employee2=new Employee();
	employee2.setFirstName("Anirudh");
	employee2.setLastName("Talluri");
	employee2.setDob("23-11-1999");
	employee2.setDoj("09-05-2022");
	employee2.setExperience(1);
	employee2.setDesignation("trainee");
	Employee employee3=new Employee();
	employee3.setFirstName("Vishnu");
	employee3.setLastName("Reddy");
	employee3.setDob("23-08-1995");
	employee3.setDoj("15-12-2021");
	employee3.setExperience(1);
	employee3.setDesignation("trainee");
	EmployeeService service=new EmployeeService();
	service.groupEmployees(employee);
	 service.groupEmployees(employee2);
	 List<TreeSet<Employee>> list = service.groupEmployees(employee3);
//	System.out.println(list.get(2));
	System.out.println(list.get(2));
}
}
