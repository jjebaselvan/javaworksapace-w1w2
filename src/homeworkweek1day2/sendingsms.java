package homeworkweek1day2;

import java.util.Scanner;

public class sendingsms {
	
	static Scanner scan= new Scanner(System.in);
	
	public static String Message()
	
	{
	
	for (int i=1; i<=6; i=i+1)
	
	{
		
		System.out.println("enter the Mobile Number");
		
		long mobilenumber=scan.nextLong();
		
		System.out.println("Good Morning");
		
		
	}
	
	return "messagesent to six number successfully";
	
		
	}
	
	public static void main(String[] args) {
		
		String sendingsms=Message();
		System.out.println(sendingsms);
		
		
		
	}

}
