package lab4_inheritance_and_polymorphism.prog4_6_equals.case1;

import java.util.GregorianCalendar;

public class Test {
	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();
		date.set(GregorianCalendar.YEAR, 2009);
		date.set(GregorianCalendar.MONTH, 11);
		date.set(GregorianCalendar.DAY_OF_MONTH, 24);
		Person p = new Person("Joe", date);
		PersonWithJob withJob = new PersonWithJob("Joe", date, 100000);
		
		System.out.println(p.equals(withJob)); 

		System.out.println(withJob.equals(p)); 

	}

}
