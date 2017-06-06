
public class ATM implements IATM {

	private Account account;

	public ATM(String name, double money, String userName) {
		this.account = new Account(name, money, userName);
	}

	@Override
	public String withdraw(double money) {
		return account.withdraw(money);
	}

	@Override
	public String deposit(double money) {
		return account.deposit(money);
	}

	@Override
	public double getBalance() {
		return account.getBalance();
	}

	@Override
	public String inquiry() {
		// TODO Auto-generated method stub
		return null;
	}

	public String userInformation() {
		System.out.println("The default pin for your account it " + account.getPin());
		System.out.println("and the account number for your account is " + account.getAccountNumber());
		return " ";
	}

	public String getUserName() {
		return account.getUserName();
	}

	public int getPin() {
		return account.getPin();
	}
}
