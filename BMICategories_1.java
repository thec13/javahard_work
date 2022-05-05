import java.util.Scanner;

public class BMICategories_1 {
	public static void main( String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double inches, pounds, bmi;

		System.out.print ( "Your height in inches: " );
		inches = keyboard.nextDouble();

		System.out.print ( "Your weight in pounds: " );
		pounds = keyboard.nextDouble();

		// Formula: weight (lb) / [height (in)]2 x 703
		bmi = pounds / (inches*inches) * 703;
		System.out.println ( "BMI: " + bmi );

		System.out.print( "BMI category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight");
		}
		else if ( bmi <= 16.0 ) {
			System.out.println( "severely underweight" );
		}
		else if ( bmi < 18.5 ) {
			System.out.println( "underweight" );
		}
		else if ( bmi < 25.0 ) {
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30.0 ) {
			System.out.println( "overweight" );
		}
		else if ( bmi < 35.0 ) {
			System.out.println( "moderately obese" );
		}
		else if ( bmi < 40.0 ) {
			System.out.println( "severely obese" );
		}
		else {
			System.out.println( "very severely/\"morbidly\" obese" );
		}
	}
}