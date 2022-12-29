package employee_details_proj.exceptions;

import employee_details_proj.dto.Employee;

public class InvalidDesignationException extends RuntimeException {
	
	
	@Override
	public String getMessage() {
		return "Designation does not match in DataBase";
	}
}
