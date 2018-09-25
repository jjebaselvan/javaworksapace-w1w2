package homeworkweek1day2;
import java.util.Scanner;

public class findingodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan= new Scanner(System.in);
		
	   String next = scan.next();
	   char[] ch = next.toCharArray();
	   for (char eachNum : ch) {
		
		   if (eachNum%2!=0) {
			System.out.println("odd number "+eachNum);
		}
	}
	/*//	long contactnumber = js.nextLong();
		
//		int airtel=js.nextInt();
//		int vodafone=js.nextInt();
		
		System.out.println("enter the mobile number");
		int phonenumber=jjs.nextInt();
	switch (phonenumber) {
	
	case 9840 :
		System.out.println ("the entered number is Airtel");
		
		break;
		
	case 9176 :
		
		System.out.println("the entered number is vodafone");
		
		break;
		
		
	}*/
	}

}
