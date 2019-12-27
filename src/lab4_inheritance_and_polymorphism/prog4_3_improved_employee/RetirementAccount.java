package lab4_inheritance_and_polymorphism.prog4_3_improved_employee;


public class RetirementAccount extends Account {
	
	private final double PENALTY_PERCENT = 0.2;
	
	public RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	
	public RetirementAccount(Employee emp){
		super(emp);
	}
	
	public boolean makeWithdrawal(double amount){
		double bal = getBalance();
		
		double penalty = bal * (PENALTY_PERCENT/100);
		bal = bal - amount - penalty;
		if(bal < 0){
			return false;
		}
		setBalance(bal);
		return true;
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}

}
