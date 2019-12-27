package lab4_inheritance_and_polymorphism.prog4_3_improved_employee;

import java.time.LocalDate;

public class Employee {
	// instance fields
	private AccountList accounts;
	private String name;
	private LocalDate hireDay;

	// constructor
	public Employee(String aName, int aYear, int aMonth, int aDay) {
		accounts =  new AccountList();
		name = aName;
		hireDay = LocalDate.of(aYear, aMonth, aDay);
	}
	
	/** returns a list of account types in the order in which 
	 *  accounts are stored in the AccountList
	 */
	public MyStringList getNamesOfAccounts(){
		MyStringList names = new MyStringList();
		for(int i = 0; i < accounts.size(); ++i){
			names.add(accounts.get(i).getAcctType().toString().toLowerCase());
		}
		return names;
		
	}

	// instance methods
	public String getName() {
		return name;
	}


	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void createNewChecking(double startBalance) {
		Account acct = new CheckingAccount(this, startBalance);
		accounts.add(acct);
	}


	public void createNewSavings(double startBalance) {
		Account acct = new SavingsAccount(this, startBalance);
		accounts.add(acct);
	}
	
	public void createNewRetirement(double startBalance) {
		Account acct = new RetirementAccount(this, startBalance);
		accounts.add(acct);
	}

	public void deposit(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		selected.makeDeposit(amt);

	}

	
	public boolean withdraw(int acctIndex, double amt){
		Account selected = accounts.get(acctIndex);
		return selected.makeWithdrawal(amt);
	}	
	
	private String n = System.getProperty("line.separator");
	public String getFormattedAccountInfo(){
		String retVal = "ACCOUNT INFO FOR "+name+":"+n+n;
		for(int i = 0; i < accounts.size(); ++i){
			retVal += (accounts.get(i).toString()+n);
		}
		return retVal;
	}
	
	
	@Override
	public String toString() {
		return name + " : " + accounts.getLargest().getBalance();
	}
	

}
