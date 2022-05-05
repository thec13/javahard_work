//*************************************************************************
//	Topic: Exercise 8: Storing the Human’s Responses
//	File Name: RudeQuestions.java
//	Name: Chad Ramey
//	Description:  
//*************************************************************************

import java.util.Scanner;

public class RudeQuestions 
{
	public static void main (String[] args) 
	{

		String name, hair;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print ( "Hello. What is your name? " );
		name = keyboard.next();

		System.out.print ( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();

		System.out.println ( "So you're " + age + ", eh? That's not very old." );
		System.out.print ( "How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();

		System.out.println ( weight + "! Better keep that quiet!!" );
		System.out.print ("What's your income, " + name + "? " );
		income = keyboard.nextDouble();

		System.out.print ( "Hopefully that is " + income + " per hour" );
		System.out.println ( " and not per year!" );

		System.out.print ("Finally, What is your hair color? ");
		hair = keyboard.next();

		System.out.println ( "Thank you " + name + " and your " + hair +
			" hair." );

		System.out.print ( "Well, thanks for answering my rude questions, " );
		System.out.println ( name + "." );

	}
}