package lab4_inheritance_and_polymorphism.prog4_1_department;

import java.time.LocalDate;

public class DeptEmployee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	

	public DeptEmployee(String name, double salary, int aYear, int aMonth, int aDay) {
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(aYear, aMonth, aDay);
		
	}
	
	public double computeSalary () {
		return this.salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getHireDay() {
		return hireDay;
	}


	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}

}
