package Javapackage;

import java.util.Scanner;


public class firstjavacode {


	public static void main(String[] args) 

	{
		// TODO Auto-generated method stub

		Scanner tl= new Scanner(System.in);

		System.out.println("Enter the value of A");

		int a = tl.nextInt();

		System.out.println("Enter the value of B");

		int b =tl.nextInt();

		System.out.println("addition of " + a + "and" +b+ " is " +  (a+b));

		System.out.println(" Difference between " + a + "and" +b+ " is " +  (a-b));

		System.out.println(" Multiplicaiton of " + a + "and" +b+ " is " +  (a*b));

		System.out.println("Division of " + a + "and" +b+ " is " +  (a/b));

		System.out.println(" Reminder between " + a + "and" +b+ " is " +  (a%b));

		if(a>b)

			System.out.println(+ a + "is Greater than" +b+ " is " + (a>b));

		else

			System.out.println(+ b + "is Greater than" +a+ " is " +  (a<b));

		if(a<b)

			System.out.println(+ a + "is lesser than" +b+ " is " +  (a<b));

		else

			System.out.println(+ b + "is lesser than" +a+ " is " +  (a<b));



		if(a==b)

			System.out.println(+ a + "is equal to" +b+ " is " +  (a==b));

		else

			System.out.println(+ a + "is not equal to" +b+ " is " +  (a==b));




	}

}
