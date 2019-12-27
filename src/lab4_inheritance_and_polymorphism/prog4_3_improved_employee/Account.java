package lab4_inheritance_and_polymorphism.prog4_3_improved_employee;

public abstract class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;

	Account(Employee emp, double balance) {
		employee = emp;
		this.balance = balance;
	}

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);

	}
	
	abstract public AccountType getAcctType();

	public void makeDeposit(double deposit) {
		if (deposit <= 0)
			throw new IllegalArgumentException("Deposit should be greater than 0");
		this.balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(amount > balance){
			return false;
		}
		balance -= amount;
		return true;
	}

	public double getBalance() {
		return this.balance;
	}
	
	void setBalance(double bal){
		balance = bal;
	}
	
	public Employee getEmp(){
		return employee;
	}
	
	private String newline = System.getProperty("line.separator");
	public String toString(){
		String ret =
			"Account type: "+getAcctType().toString().toLowerCase()+newline+
			"Current bal:  "+balance;
		return ret;
	}
	

}
