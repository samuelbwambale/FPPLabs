package lab12_exceptions.prog12_2_employee.employeeinfo;

import lab12_exceptions.prog12_2_employee.exceptions.OverdrawnAccountException;

abstract public class Account {
	private Employee emp;
	private double balance;

	Account(Employee e, double startBalance) {
		emp = e;
		balance = startBalance;
		
		
	}
	Account(Employee e) {
		this(e,0.0);
	}
	abstract public AccountType getAcctType();

	void makeDeposit(double amount){
		balance += amount;
	}
	void makeWithdrawal(double amount) throws OverdrawnAccountException{
		if(amount > balance){
			throw new OverdrawnAccountException("Withdrawal amount is too high");
		}
		else
			balance -= amount;
	}
	double getBalance(){
		return balance;
	}
	/** used by subclasses only */
	void setBalance(double bal){
		balance = bal;
	}
	
	public Employee getEmp(){
		return emp;
	}
	private String newline = System.getProperty("line.separator");
	public String toString(){
		String ret =
			"Account type: "+getAcctType().toString().toLowerCase()+newline+
			"Current bal:  "+balance;
		return ret;
	}
	
}
