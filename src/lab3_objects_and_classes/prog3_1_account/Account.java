package lab3_objects_and_classes.prog3_1_account;

public class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);

	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		if (deposit <= 0)
			throw new IllegalArgumentException("Deposit should be greater than 0");
		this.balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if (this.balance < amount || amount <= 0)
			return false;
		else {
			this.balance -= amount;
			return true;
		}
	}

	public double getBalance() {
		return this.balance;
	}

	public AccountType getAcctType() {
		return this.acctType;
	}

}
