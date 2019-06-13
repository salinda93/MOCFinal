package exception.handle.q3;
import java.util.Scanner;

public class BankDemo2 {

	public static void main(String[] args) {

		Account account = new Account(123);
		System.out.println("Depositing Rs.10,000");
		account.deposit(10000.00);

		try {
			continueTransaction(account);

		} catch (InsufficientBalanceException e) {
			System.out.println("Sorry, your account remains only Rs." + e.getAmount());
			e.printStackTrace();
		} finally {
			System.out.println("Do you wish to continue? yes/no");
			Scanner scanner = new Scanner(System.in);
			if(scanner.next().equalsIgnoreCase("yes")){
				try {
					System.out.println("Depositing Rs.10,000");
					account.deposit(10000.00);
					continueTransaction(account);
				} catch (InsufficientBalanceException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("Good Bye");
			}
		}
	}

	public static void continueTransaction(Account account) throws InsufficientBalanceException {

		System.out.print("Please enter amount to be withdrawn = ");
		Scanner scanner = new Scanner(System.in);
		double amount;
		while (true) {
			amount = scanner.nextDouble();
			System.out.print("\nWithdrawing Rs." + amount + "/=");
			account.withdraw(amount);
			System.out.println(" existing amount = " + account.getBalance());
			System.out.print("Please enter amount to be withdrawn = ");
		}
	}
}
