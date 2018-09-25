package Javapackage;

import java.util.Scanner;


public class code2 {

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner tl= new Scanner(System.in);
		
		System.out.println("Enter the value of A");
		
		int a = tl.nextInt();
		
		System.out.println("Enter the value of B");
		
		int b =tl.nextInt();
		
		if ( a>b )
			
			System.out.println( a + " is GREATER than" + b );
			
			else 
				System.out.println(a + " is LESSER than" + b);
		
					}
		
		
	/*	System.out.println("addition of " + a + "and" +b+ " is " +  (a+b));
		
		System.out.println(" Difference between " + a + "and" +b+ " is " +  (a-b));
		
		System.out.println(" Multiplication of " + a + "and" +b+ " is " +  (a*b));
		
		System.out.println("Division of " + a + "and" +b+ " is " +  (a/b));
		
		System.out.println(" Reminder between " + a + "and" +b+ " is " +  (a%b));
		
		*/

	}


