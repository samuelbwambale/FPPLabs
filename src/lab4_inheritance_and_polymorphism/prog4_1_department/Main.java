package lab4_inheritance_and_polymorphism.prog4_1_department;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor prof1 = new Professor("John Doe", 6000, 2010, 3, 1, 10);
		Professor prof2 = new Professor("Allan Smith", 8000, 2012, 5, 1, 10);
		Professor prof3 = new Professor("Keith Samuel", 10000, 2014, 8, 1, 10);
		
		Secretary sec1 = new Secretary("Sarah Cobbs", 4000, 1998, 6, 20, 200);
		Secretary sec2 = new Secretary("Jane Ruth", 5000, 2005, 8, 30, 200);
		
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = prof1;
		department[1] = prof2;
		department[2] = prof3;
		department[3] = sec1;
		department[4] = sec2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("See the sum of all salaries in the department? (y/n) ");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			double sum = 0;
			for(DeptEmployee emp : department) {
				sum += emp.computeSalary();
			}
			System.out.println("The sum of salaries is: " + sum);
		} else {
			// do nothing..the application ends here
		}
	}
	

}
