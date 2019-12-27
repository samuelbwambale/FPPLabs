package lab12_exceptions.prog12_2_employee.employeeinfo;

import lab12_exceptions.prog12_2_employee.exceptions.OverdrawnAccountException;

public class RetirementAccount extends Account {
	private final double PENALTY_PERCENT = 2.0;

	RetirementAccount(Employee e, double startBalance) {
		super(e, startBalance);
	}

	RetirementAccount(Employee e) {
		super(e);
	}

	public void makeWithdrawal(double amount) throws OverdrawnAccountException {
		double bal = getBalance();

		double penalty = bal * (PENALTY_PERCENT / 100);
		bal = bal - amount - penalty;
		if (bal < 0) {
			throw new OverdrawnAccountException("Withdrawal amount is too high");
		} else
			setBalance(bal);
	}

	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}

}
