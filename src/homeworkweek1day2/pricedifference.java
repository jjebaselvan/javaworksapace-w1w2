package homeworkweek1day2;

import java.util.Scanner;

public class pricedifference {
	
	
public static void Pricecomparison(){
	
	Scanner js=new Scanner(System.in);
	
	 System.out.println("Enter the price of mobile1");
	
	long price1=js.nextLong();
	
	System.out.println("Enter the price of mobile");
	
	long price2=js.nextLong();
	
	if (price1>price2)
		
	{
		System.out.println("mobile1 is costlier  , price of mobile1 is " + price1);
		System.out.println("mobile2 is cheaper  , price of mobile2 is " + price2);
	
	}
	else {

		System.out.println("mobile2 is costlier  , price of mobile2 is " + price2);
		System.out.println("mobile1 is cheaper  , price of mobile1 is " + price1);
	}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Pricecomparison();

	}

}
