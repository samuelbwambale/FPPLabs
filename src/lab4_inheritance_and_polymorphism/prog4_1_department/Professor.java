package lab4_inheritance_and_polymorphism.prog4_1_department;

public class Professor extends DeptEmployee {
	
	private int numberOfPublications;

	public Professor(String name, double salary, int aYear, int aMonth, int aDay, int numberOfPublications) {
		super(name, salary, aYear, aMonth, aDay);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

}
