import java.util.Scanner;

public class BMICalculator_1 {
	public static void main ( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double inches, pounds, m, kg, bmi;

		System.out.print ( "Your height in inches: " );
		inches = keyboard.nextDouble();

		System.out.print ( "Your weight in pounds: " );
		pounds = keyboard.nextDouble();

		// m = i * 0.0254
		m = inches * 0.0254;

		// kg = lb * 0.45359237
		kg = pounds * 0.45359237;

		bmi = kg / (m*m);

		System.out.println ( "Your BMI is " + bmi );
	}
}