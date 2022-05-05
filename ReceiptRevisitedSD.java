import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisitedSD {
	public static void main(String [] args) throws Exception {
		System.out.println("Gas costs $1.959 per gallon.");
		Scanner kb = new Scanner(System.in);
		System.out.print("How many gallons do you want? ");
		double gal = kb.nextDouble();
		double price = 3.459;
		double total = gal*price;
		System.out.println("Total cost: $" + total);
		System.out.println("\nWriting customized receipt to 'receipt.txt'... done.");
		
		PrintWriter fileOut = new PrintWriter("receipt.txt");

		fileOut.println("+------------------------+");
		fileOut.println("|                        |");
		fileOut.println("|       CORNER STORE     |");
		fileOut.println("|                        |");
		fileOut.println("|  2017-01-30  04:48PM   |");
		fileOut.println("|                        |");
		fileOut.println("|                        |");
		fileOut.println("|  Gallons: " + gal +"   |");
		fileOut.println("|                        |");
		fileOut.println("|  Fuel total: " + total + "|");
		fileOut.println("|                        |");
		fileOut.println("+------------------------+");
		fileOut.close();

	}
}