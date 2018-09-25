package HWweek2day2;

import java.util.*;

public class threeinputsarithmetic {

	public static void main(String[] args) {
		Scanner js=new Scanner(System.in);
		
		System.out.println("enter option to add or sub or mul or div");
		String arithmetic=js.next();
		System.out.println("Enter the input a to " + arithmetic);
		int a=js.nextInt();
		System.out.println("Enter the input b to " + arithmetic);
		int b =js.nextInt();

switch (arithmetic) {

case "add" :

	System.out.println ("The sum of "+ a +" and  "+ b+ " is "+ (a+b));

	break;
	
case "sub" :

	System.out.println ("The sub of "+ a +" and  "+ b+ " is "+ (a-b));

	break;
	
case "mul" :

	System.out.println ("The mul of "+ a +" and  "+ b+ " is "+ (a*b));

	break;
	
case "div" :

	System.out.println ("The div of "+ a +" and  "+ b+ " is "+ (a/b)+" and the reminder is " + (a%b));

	break;
}



	}

}
