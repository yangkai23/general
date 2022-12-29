package employee_details_proj.exceptions;

public class DateOfJoiningShortException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Age of joinih=g date is less than 18 years";
	}
}
