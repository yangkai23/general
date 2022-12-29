package employee_details_proj.exceptions;

public class FieldEmptyException extends RuntimeException {
@Override
public String getMessage() {
	return  "Field is empty";
}
}
