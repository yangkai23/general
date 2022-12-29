package constructor_chaining;

public class Student {
	int student_id;
	char section;
	String name;
	String dob;

	public Student(int student_id, char section, String name, String dob) {
		this.student_id = student_id;
		this.section = section;
		this.name = name;
		this.dob = dob;
	}

	public Student(String name, String dob) {
		this.name = name;
		this.dob = dob;
	}

	public Student(int student_id, String name, String dob) {
		this.student_id = student_id;
		this.name = name;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", section=" + section + ", name=" + name + ", dob=" + dob + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student("Ani", "23/11/1999");
		System.out.println(s1);
		Student s2 = new Student(111, 'c', "Vishnu", "23/08/1999");
		System.out.println(s2);
		Student s3 = new Student(22, "Hrushi", "27/08/2000");
		System.out.println(s3);
	}
}