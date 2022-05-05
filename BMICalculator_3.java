import java.util.Scanner;

public class BMICalculator_3 {
	public static void main ( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double feet, inches, pounds, convert, m, kg, bmi;

		System.out.print ( "Your height (feet only): " );
		feet = keyboard.nextDouble();

		System.out.print ( "Your height (inches): " );
		inches = keyboard.nextDouble();

		System.out.print ( "Your weight in pounds: " );
		pounds = keyboard.nextDouble();

		convert = (feet * 12) + inches;

		// m = i * 0.0254
		m = convert * 0.0254;

		// kg = lb * 0.45359237
		kg = pounds * 0.45359237;

		bmi = kg / (m*m);

		System.out.println ( "Your BMI is " + bmi );
	}
}