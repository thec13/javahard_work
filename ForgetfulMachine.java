//*************************************************************************
//	Topic: Exercise 7: Getting Input from a Human
//	File Name: ForgetfulMachine.java
//	Name: Chad Ramey
//	Description:  2nd question blows up by everything but interger 
//	input (no string; no double); 3rd with anything other than number
//*************************************************************************

import java.util.Scanner;

public class ForgetfulMachine {

	public static void main (String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println ("What city is the capital of France?");
		keyboard.next(); // String input

		System.out.println ("What is 6 multiplied by 7?");
		keyboard.nextInt(); // Interger input

		System.out.println ("Enter a number between 0.0 and 1.0.");
		keyboard.nextDouble(); // Decimal input

		System.out.println ("Is there anything else you would like to say?");
		keyboard.next(); // String default

	}
}