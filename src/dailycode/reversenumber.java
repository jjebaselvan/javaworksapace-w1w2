package dailycode;
import java.util.Scanner;
public class reversenumber {

	public static void main(String[] args) {

		int a, b=0;
		
		Scanner js=new Scanner(System.in);
		
		
		System.out.println("Enter the number to be reversed");
		a = js.nextInt();
		
		while (a!= 0) {
			
		b=b*10;
		b=b+ a%10;
		a=a/10;
		System.out.println("the output is "+b);
	
		}
			
		
		}
	
	
}
