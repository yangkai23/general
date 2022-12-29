package employee_details_proj.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import employee_details_proj.dto.Employee;
import employee_details_proj.exceptions.InvalidDesignationException;

public class EmployeeService {
	private final int trainee_exp = 1;
	private final int lead_exp = 5;
	private final int manager_exp = 10;
	private TreeSet<Employee> trainee = new TreeSet<>();
	private TreeSet<Employee> lead = new TreeSet<>();
	private TreeSet<Employee> manager = new TreeSet<>();

	public List<TreeSet<Employee>> groupEmployees(Employee employee) {

		ArrayList<TreeSet<Employee>> list = new ArrayList<>();
		if (employee.getDesignation().equalsIgnoreCase("trainee"))
			trainee.add(employee);
		else if (employee.getDesignation().equalsIgnoreCase("lead"))
			lead.add(employee);
		else if (employee.getDesignation().equalsIgnoreCase("manager"))
			manager.add(employee);
		else
			throw new InvalidDesignationException();
		list.add(manager);
		list.add(lead);
		list.add(trainee);
		return list;
	}

	private Comparator<Employee> com = (e1, e2) -> {
		String e1doj[] = e1.getDoj().split("-");
		String e2doj[] = e2.getDoj().split("-");
		int day = Integer.parseInt(e1doj[0]);
		int eday = Integer.parseInt(e2doj[0]);
		int mon = Integer.parseInt(e1doj[1]);
		int emon = Integer.parseInt(e2doj[1]);
		int year = Integer.parseInt(e1doj[2]);
		int eyear = Integer.parseInt(e2doj[2]);
		if (year < eyear)
			return -1;
		else if (year > eyear)
			return 1;
		else {
			if (mon < emon)
				return -1;
			else if (mon > emon)
				return 1;
			else {
				if (day < eday)
					return 1;
				else if (eday < day)
					return -1;
				else
					return 0;
			}
		}
	};

	public Comparator<Employee> getComparator() {
		return this.com;
	}

	public List<TreeSet<Employee>> groupByDoj() {
		TreeSet<Employee> trainee = new TreeSet<>(getComparator());
		TreeSet<Employee> lead = new TreeSet<>(getComparator());
		TreeSet<Employee> manager = new TreeSet<>(getComparator());
		trainee.addAll(this.trainee);
		lead.addAll(this.lead);
		manager.addAll(this.manager);
		ArrayList<TreeSet<Employee>> list = new ArrayList<>();
		list.add(manager);
		list.add(lead);
		list.add(trainee);
		return list;

	}

	public boolean checkExperience(String designation, int experience) {
		if (designation.equalsIgnoreCase("trainee")) {
			if (experience >= this.trainee_exp)
				return true;
			else
				return false;
		} else if (designation.equalsIgnoreCase("lead")) {
			if (experience >= this.lead_exp)
				return true;
			else
				return false;
		} else if (designation.equalsIgnoreCase("manager")) {
			if (experience >= this.manager_exp)
				return true;
			else
				return false;
		} else
			throw new InvalidDesignationException();
	}
}
