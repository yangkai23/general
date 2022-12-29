package employee_details_proj.exceptions;

public class ExperienceNotMatchException extends RuntimeException {
@Override
public String getMessage() {
	return "Experience and esignation not matching organisation policies";
}
}
