package lab3_objects_and_classes.prog3_1_account;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("Allan", "John", 1000.0, 2010, 7, 1);
		Account acc1 = new Account(e1, AccountType.CHECKING, 300.0);
		Account acc3 = new Account(e1, AccountType.SAVINGS, 300.0);
		Account acc2 = new Account(e1, AccountType.RETIREMENT, 300.0);

		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		System.out.println(acc3.toString());

	}

}
