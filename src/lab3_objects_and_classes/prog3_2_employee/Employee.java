package lab3_objects_and_classes.prog3_2_employee;

import java.time.LocalDate;

import lab3_objects_and_classes.prog3_1_account.AccountType;
import lab3_objects_and_classes.prog3_2_employee.Account;

public class Employee {
	// instance fields
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private String nickName;
	private LocalDate hireDay;

	// constructor
	public Employee(String aName, String aNickName, int aYear, int aMonth, int aDay) {
		name = aName;
		nickName = aNickName;
		hireDay = LocalDate.of(aYear, aMonth, aDay);
	}

	// instance methods
	public String getName() {
		return name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String aNickName) {
		nickName = aNickName;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void createNewChecking(double startAmount) {
		this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);

	}

	public void createNewSavings(double startAmount) {
		this.savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);

	}

	public void createNewRetirement(double startAmount) {
		this.retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);

	}

	public void deposit(AccountType acctType, double amt) {
		switch (acctType) {
		case CHECKING:
			this.getCheckingAcct().makeDeposit(amt);
			break;
		case SAVINGS:
			this.savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			this.retirementAcct.makeDeposit(amt);
			break;
		default:
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		switch (acctType) {
		case CHECKING:
			if (amt <= 0 || amt > getCheckingAcct().getBalance())
				return false;
			this.getCheckingAcct().makeWithdrawal(amt);
			return true;
		case SAVINGS:
			if (amt <= 0 || amt > savingsAcct.getBalance())
				return false;
			this.savingsAcct.makeWithdrawal(amt);
			return true;
		case RETIREMENT:
			if (amt <= 0 || amt > retirementAcct.getBalance())
				return false;
			this.retirementAcct.makeWithdrawal(amt);
			return true;
		default:
			return false;
		}
	}


	public Account getCheckingAcct() {
		return checkingAcct;
	}
	
	public Account getSavingsAcct() {
		return savingsAcct;
	}
	
	public Account getRetirementAcct() {
		return retirementAcct;
	}

}
