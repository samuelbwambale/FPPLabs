package lab4_inheritance_and_polymorphism.prog4_6_equals.case3;

import java.util.GregorianCalendar;

public final class PersonWithJob {
	
	private Person person;
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		person = new Person(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public String getName() {
		return person.getName();
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar) person.getDateOfBirth().clone();
	}
	
	@Override
	public boolean equals(Object withJob) {
		if (withJob == null)
			return false;
		if (withJob.getClass() != this.getClass())
			return false;
		PersonWithJob p = (PersonWithJob) withJob;
		boolean isEqual = getName().equals(p.getName()) && getDateOfBirth().equals(p.getDateOfBirth()) && this.salary == p.salary;
		return isEqual;
	}
}
