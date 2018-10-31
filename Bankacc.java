package oct26;

public class Bankacc {
	private String accountName = "account", accountNum = "000001";
	private double balance = 0, overDraftSum = 0;
	private boolean isOverDraftAllowed = false;

//builder 
	public Bankacc(String accountName, String accountNum, double balance, double overDraftSum,
			boolean isOverDraftAllowed) {
		super();
		this.accountName = accountName;
		this.accountNum = accountNum;
		this.balance = balance;
		this.overDraftSum = overDraftSum;
		this.isOverDraftAllowed = isOverDraftAllowed;
	}

// gets&sets

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getOverDraftSum() {
		return overDraftSum;
	}

	public void setOverDraftSum(double overDraftSum) {
		this.overDraftSum = overDraftSum;
	}

	public boolean isOverDraftAllowed() {
		return isOverDraftAllowed;
	}

	public void setOverDraftAllowed(boolean isOverDraftAllowed) {
		this.isOverDraftAllowed = isOverDraftAllowed;
	}

	// methods.

	public double deposit(double depositsum) {
		if (depositsum >= 1) {
			System.out.println("The current balance is: " + " " + (balance += depositsum));
			return balance;
		} else {
			System.out.println("Try an higher number");
			return balance;
		}

	}

	public double withdrawal(double withdrawalsum) {
		if (balance >= withdrawalsum) {
			System.out.println("The current balance:" + (balance -= withdrawalsum));
			return balance;
		} else {
			if (withdrawalsum > balance && isOverDraftAllowed) {
				System.out.println("The current balance:" + (balance -= withdrawalsum));

			} else {
				System.out.println(
						"Cannot Withdrawal,Overdraft isnt allowed in this account,\n the amount availabe to withdrawl is "
								+ " " + balance);
			}

		}
		return balance;
	}

	public void print() {
		System.out.println("The accounts owner:" + " " + accountName);
		System.out.println("The accounts id " + " " + accountNum);
		System.out.println("The account balance " + " " + balance);
		System.out.println("The account is possible for overdraft: " + " " + isOverDraftAllowed);
	}

}
