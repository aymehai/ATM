import java.security.SecureRandom;

public class Account {
	private int accountNumber;
	private String userName;
	private String name;
	private double balance;
	private int pin;
	private double amount;
	private String trasactionId;

	public Account(String name, double money, String userName) {
		SecureRandom randomHash = new SecureRandom();
		SecureRandom randomPin = new SecureRandom();
		this.pin = randomPin.nextInt(8999) + 1000;
		this.accountNumber = randomHash.hashCode();
		this.userName = userName;
		this.balance = money;
		this.setName(name);
	}

	//AccountNumber Methods
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	//UserName Methods
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	// Balance Methods
	public double getBalance() {
		this.trasactionId = "check balance";
		return balance;
	}

	public String deposit(double money) {
		this.trasactionId = "deposit";
		this.amount = money;
		this.balance = balance + money;
		return "" + balance;
	}

	public String withdraw(double money) {
		this.trasactionId = "withdraw";
		this.amount = money;
		this.balance = balance - money;
		return "" + balance;
	}

	//Pin Methods
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	//Name methods

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public String getTrasactionId(){
		return trasactionId;
	}

}
