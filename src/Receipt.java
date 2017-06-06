import java.util.Random;
public class Receipt {

	private Account account;

	public String transactionRecepit() {
		String name = account.getName();
		Random rnd = new Random();
		int month = rnd.nextInt(11) + 1;
		int day = rnd.nextInt(27) + 1;
		int year = 2017;
		String date = month + "/" + day + "/" + year;
		System.out.println("+--------------------------------------+");
		System.out.println("      Java Bank ATM Receipt           ");
		System.out.println("      " + date + "      ");
		System.out.println("      ATM Location # 123              ");
		System.out.println("                                      ");
		System.out.println("                                      ");
		System.out.println("      Account Number:      " + account.getAccountNumber() + "    ");
		System.out.println("      Customer:     " + account.getName() + "    ");
		System.out.println("      Transaction Type:    "+ account.getTrasactionId() +"    ");
		System.out.println("      Transaction Amount:  $" + account.getAmount() + "    ");
		System.out.println("      Account Balance:   $" + account.deposit(account.getAmount()) + "    ");
		System.out.println("                                      ");
		System.out.println("      Thank you for banking with us   ");
		System.out.println("            Have a coffee day         ");
		System.out.println("                                      ");
		System.out.println("+--------------------------------------+");
		return " ";
	}

	{

	}

}
