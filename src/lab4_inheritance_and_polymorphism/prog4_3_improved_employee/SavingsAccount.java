package lab4_inheritance_and_polymorphism.prog4_3_improved_employee;

public class SavingsAccount extends Account {

	private final double MONTHLY_INTEREST_RATE = 0.25;

	public SavingsAccount(Employee emp, double balance) {
		super(emp, balance);
	}

	public SavingsAccount(Employee e) {
		super(e);
	}

	
	public void updateBalance() {
		double baseBalance = super.getBalance();
		double interest = (MONTHLY_INTEREST_RATE/100) * baseBalance;
		setBalance(baseBalance + interest);
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}

}
