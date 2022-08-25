package MMBankingApplication;

import MMBankingFrameWork.BankFactory;
import MMBankingFrameWork.CurrentAccount;
import MMBankingFrameWork.SavingAccount;

public abstract class MMBankFactory implements BankFactory {

	@Override
	public SavingAccount getNewSavingAccount(int accountNumber, String accountName, float accountBalance,
			boolean isSalaried, float minimumBalance) {
		// TODO Auto-generated method stub

		SavingAccount savingAccount = new MMSavingAccount(accountNumber, accountName, accountBalance, isSalaried,
				minimumBalance);

		return savingAccount;
	}

	@Override
	public CurrentAccount getNewCurrentAccount(int accountNumber, String accountName, float accountBalance,
			float creditLimit) {
		// TODO Auto-generated method stub
		CurrentAccount currentAccount = new MMCurrentAccount(accountNumber, accountName, accountBalance, creditLimit);
		return currentAccount;
	}

	@Override
	public String toString() {
		return "MMBankFactory [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
