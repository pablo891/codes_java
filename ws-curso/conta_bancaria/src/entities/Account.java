package entities;

public class Account {
	
	private int accNumber;
	private String holder;
	private double balance;
	
	public Account(int accNumber, String holder, double balance) {
		this.accNumber = accNumber;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Account(int accNumber, String holder) {
		this.accNumber = accNumber;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public void verify(char verification, double balance) {
		if(verification == 'y') {
			this.balance = balance;
		}
		
		else {
			this.balance = 0;
		}

	}
	
	public String toString() {
		return "Account "
				+ accNumber
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
	
}
