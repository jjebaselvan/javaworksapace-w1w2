package dailycode;

import java.util.Scanner;

public class cc1 {
	
	public static void largestnumber() {
	
	Scanner js=new Scanner(System.in);
	
	System.out.println(" enter 1st number");
	
	int a=js.nextInt();
	
	System.out.println(" enter 2nd number");
	int b=js.nextInt();
	
	System.out.println(" enter 3rd number");
	int c=js.nextInt();
	
	if (a>b && a>c)
	{
	
		System.out.println(a + " is the GREATEST number");
	}
	else if (b>c)
	{
		System.out.println(b + " is the GREATEST Number");
	}
	
	else {
		System.out.println(c + " is the GREATEST Number");
	}

	js.close();

	    
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			largestnumber();
		
}
}


	