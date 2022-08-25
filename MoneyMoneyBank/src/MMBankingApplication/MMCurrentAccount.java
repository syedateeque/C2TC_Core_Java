package MMBankingApplication;

import MMBankingFrameWork.CurrentAccount;

public class MMCurrentAccount extends CurrentAccount {

	public MMCurrentAccount(int accountNumber, String accountName, float accountBalance, float creditLimit) {
		super(accountNumber, accountName, accountBalance, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withDraw(float withDraw) {
		// TODO Auto-generated method stub
		super.withDraw(withDraw);
		System.out.println("Dear Current Account User your Balance= " + getAccountBalance());
	}

	@Override
	public String toString() {
		return "MMCurrentAccount [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccountName()=" + getAccountName() + ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountBalance()=" + getAccountBalance() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
