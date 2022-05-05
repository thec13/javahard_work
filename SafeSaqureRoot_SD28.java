import java.util.Scanner;

public class SafeSaqureRoot_SD28 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		double x, y;
		
		System.out.print("Give me a number, and I'll find its square root. ");
		System.out.println("Are you reaady");
		String readyanswer = keyboard.nextLine();

		while( !readyanswer.equals("yes")){
			System.out.println("Let me ask that again, are you ready?");
			readyanswer = keyboard.nextLine();
		}
		
		System.out.print("(No negatives, please.) ");
		x = keyboard.nextDouble();
		
		while ( x < 0 ) {
			System.out.println("I won't take the square root of a negative."); System.out.print("\nNew number: ");
			x = keyboard.nextDouble();
		}
		Scanner keyboard = new Scanner(System.in);
		y = Math.sqrt(x);
		System.out.println("The square root of "+x+" is "+y);
	}
}