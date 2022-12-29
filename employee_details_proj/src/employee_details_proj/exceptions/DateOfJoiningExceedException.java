package employee_details_proj.exceptions;

public class DateOfJoiningExceedException extends RuntimeException {
@Override
public String getMessage() {
	return "Age of joiing date is more than 58";
}
}
