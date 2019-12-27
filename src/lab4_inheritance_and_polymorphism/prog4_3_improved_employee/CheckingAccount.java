package lab4_inheritance_and_polymorphism.prog4_3_improved_employee;


public class CheckingAccount extends Account {
	private final double MONTHLY_SERVICE_CHARGE = 5.0;
	
	public CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	
	public CheckingAccount(Employee emp){
		super(emp);
	}
	
	
	public void updateBalance() {
		double baseBalance = super.getBalance();
		setBalance(baseBalance - MONTHLY_SERVICE_CHARGE);
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}

}
