package encapsulation;

public class Test {
	public static void main(String[] args) {
			Employee employee=new Employee();
			employee.setEmployee_id(21);
			employee.setEmployee_name("anirudh");
			employee.setEmployee_salary(3.5);
			System.out.println(employee.getEmployee_id()+"     "+employee.getEmployee_name()+"     "+employee.getEmployee_salary());
	}
}
