package MMBankingApplication;

import MMBankingFrameWork.SavingAccount;

public class MMSavingAccount extends SavingAccount {
	private float minimumBalance;

	public MMSavingAccount(int accountNumber, String accountName, float accountBalance, boolean isSalaried,
			float minimumBalance) {
		super(accountNumber, accountName, accountBalance, isSalaried, minimumBalance);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public void withDraw(float withDraw) {
		// TODO Auto-generated method stub
		super.withDraw(withDraw);
		System.out.println("Dear SavingAccount User Account Balance=  " + getAccountBalance());
	}

	@Override
	public String toString() {
		return "MMSavingAccount [minimumBalance=" + minimumBalance + ", isSalaried()=" + isSalaried()
				+ ", getMinimumBalance()=" + getMinimumBalance() + ", toString()=" + super.toString()
				+ ", getAccountName()=" + getAccountName() + ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountBalance()=" + getAccountBalance() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
