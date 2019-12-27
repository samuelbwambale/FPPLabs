package lab3_objects_and_classes.prog3_2_employee;

import lab3_objects_and_classes.prog3_1_account.AccountType;
import lab3_objects_and_classes.prog3_1_account.Util;
import lab3_objects_and_classes.prog3_2_employee.Employee;

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

	public void makeWithdrawal(double amount) {
			this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}

	public AccountType getAcctType() {
		return this.acctType;
	}
	

}
