import java.util.Scanner;

public class BMICalculator_2 {
	public static void main ( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double inches, pounds, bmi;

		System.out.print ( "Your height in inches: " );
		inches = keyboard.nextDouble();

		System.out.print ( "Your weight in pounds: " );
		pounds = keyboard.nextDouble();

		// Formula: weight (lb) / [height (in)]2 x 703
		bmi = pounds / (inches*inches) * 703;

		System.out.println ( "Your BMI is " + bmi );
	}
}