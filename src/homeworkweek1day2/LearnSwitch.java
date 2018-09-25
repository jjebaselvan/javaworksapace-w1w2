package homeworkweek1day2;

import java.util.Scanner;

public class LearnSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		System.out.println("Enter the first 3 digits of mobile number to find its Network Provider");
		Scanner scr= new Scanner(System.in);
		String phonenumber=scr.next();
	
		switch (phonenumber) {

		case "944" :

			System.out.println ("the Network Provider of " + phonenumber +" is BSNL");

			break;

		case "900" :

			System.out.println("the Network Provider of " + phonenumber +" is Airtel");

			break;


		case "897" :

			System.out.println("the Network Provider of " + phonenumber +" is Idea");

			break;

		case "630" :

			System.out.println("the Network Provider of " + phonenumber +"is Jio");

			break;
		}

	}
}
