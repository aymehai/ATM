import java.util.Scanner;
import java.lang.Math;

public class ATMApp {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello would you like to create an account? yes/no");
		String userInput = keyboard.nextLine();

		if (userInput.equals("yes")) {

			// prompts user for name
			System.out.println("What is your name?");
			String name = keyboard.nextLine();
			// prompts user for deposit amount
			System.out.println("How much would you like to deposit?");
			double deposit = keyboard.nextDouble();
			// rounds user deposit to two decimal places
			deposit = Math.round(deposit * 100.0) / 100.0;
			// prompts user for a user name
			System.out.println("Please enter a userName for your account.");
			String userName = keyboard.next();
			// creates object ATM
			ATM user1 = new ATM(name, deposit, userName);
			int userNumber = 0;
			System.out.println(user1.userInformation());
			do {
				// prompts user for number choices
				System.out.println("Please type 1 of the 4 options");
				System.out.println("1. Withdraw");
				System.out.println("2. Deposit");
				System.out.println("3. Check Balance");
				System.out.println("4. Quit");
				userNumber = keyboard.nextInt();
				if (userNumber < 4 && userNumber >= 1) {
					// prompts user for user name
					System.out.println("In order to continue please enter your user name");
					userInput = keyboard.next();
					if (userInput.equals(user1.getUserName())) {
						// prompts user for pin
						System.out.println("Now I need to ask you what is your pin");
						int userPin = keyboard.nextInt();
						if (userPin == user1.getPin()) {
							// checks user number choice
							if (userNumber == 1) {
								// prompts user how much to withdraw
								System.out.println("How much would you like to withdraw?");
								double money = keyboard.nextDouble();
								System.out.println(user1.withdraw(money));
								System.out.println("Thank you for using the ATM");
								break;

							} else if (userNumber == 2) {
								// prompts user how much to deposit
								System.out.println("How much would you like to deposit?");
								double money = keyboard.nextDouble();
								System.out.println(user1.deposit(money));
								System.out.println("Thank you for using the ATM");
								break;
							} else if (userNumber == 3) {
								// gets user balance
								System.out.println("Here is your balance: " + user1.getBalance());
								System.out.println("Thank you for using the ATM");
								break;
							}
						} else {
							System.out.println("sorry wrong pin");
						}
					} else {
						System.out.println("userName does not exist");
					}
				} else if (userNumber == 4) {
					System.out.println("Have a great day! Thank you for using ATM.");
				}

				else {
					System.out.println("please enter a valid pin.");
					userNumber = 5;
				}
			} while (userNumber > 4 && userNumber < 1);

		} else if (userInput.equals("no")) {
			System.out.println("ok have a great day...");
		}

		else {
			System.out.println("please restart program and enter a valid value.");
		}
	}
}
