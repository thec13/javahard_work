import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class PasswordDigest {
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		String pw, hash;
		
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		
		System.out.print("Password: ");
		pw = keyboard.nextLine();
		
		digest.update(pw.getBytes("UTF-8"));
		hash = DatatypeConverter.printHexBinary(digest.digest());
		
		System.out.println(hash);
	}
}