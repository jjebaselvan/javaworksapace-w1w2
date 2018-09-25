package homeworkweek1day2;

import java.util.Scanner;

public class findingmobilenetwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
//		int airtel=js.nextInt();
//		int vodafone=js.nextInt();
		
		System.out.println("enter the mobile number");
		Scanner scr = new Scanner(System.in);
		String phonenumber=scr.next();
	switch (phonenumber) {
	
	case "9840" :
		phonenumber.startsWith("9840");
		System.out.println ("the entered number is Airtel");
		
		break;
		
	case "9176" :
		
		System.out.println("the entered number is vodafone");
		
		break;
		
	}

}
}