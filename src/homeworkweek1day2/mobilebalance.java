package homeworkweek1day2;
import java.util.Scanner;
public class mobilebalance {

	
	static int balance = 13;
	static boolean expiretoday=true;

	public static int call(String contacts,  long mobilenumber) {



		System.out.println("call connected");
		balance=balance-2;

		return balance;

	}

	public static int msg(String contacts,  long mobilenumber) {


		System.out.println("msg sent");
		balance=balance-1;

		return balance;

	}



	public static void main(String[] args) {
		
		
		
		do
			
		{
			
			
				int calling=call("jeba", 805655555l);
				System.out.println(calling);
				
				int callings=msg("jeba", 805655555l);
				System.out.println(callings);
		
		
		}
		
		while (balance >2 && expiretoday);
		
	}
	
}
		
		
		
	

/*
		// TODO Auto-generated method stub
		for (balance = 9; balance>=0; balance++)
			if (balance>=2) {
				int calling=call("jeba", 805655555l);
				System.out.println(calling);

				
			}
			

	else 

	{

		System.out.println("no sufficient balance");
		break;
*/
		
	







