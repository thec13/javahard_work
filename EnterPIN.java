import java.util.Scanner;

public class EnterPIN {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String password, password_entry;
		int pin, pin_entry;
		
		password = "chilidog";
		pin = 12345;

		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.print("ENTER YOUR PASSWORD: ");
		password_entry = keyboard.next();
		
		
		while ( ! password_entry.equals(password)) {
			System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
			System.out.print("ENTER YOUR PASSWORD: ");
			password_entry = keyboard.next();
		}
		System.out.println("PASSWORD ACCEPTED.");
				
		System.out.print("\nENTER YOUR PIN: ");
		pin_entry = keyboard.nextInt();

		while (pin_entry != pin) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			pin_entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED.\nYOUR ACCOUNT BALANCE IS $425.17");
	}
}