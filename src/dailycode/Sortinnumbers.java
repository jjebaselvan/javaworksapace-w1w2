package dailycode;

import java.util.Scanner;

public class Sortinnumbers {

	public static void main(String[] args) {
		
		
		{
	        int n, z;
	        Scanner js = new Scanner(System.in);
	        System.out.print("Enter the number of elements to be sorted:");
	        n = js.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter " + n + "elements:");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = js.nextInt();
	        }
	        for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    z = a[i];
	                    a[i] = a[j];
	                    a[j] = z;
	                }
	            }
	        }
	        System.out.println("Ascending Order as follows:");
	        for (int i = 0; i < n - 1; i++) 
	        {
	            System.out.println(a[i] + ",");
	        }
	        System.out.println(a[n - 1]);
	    
	
		{
			
			 for (int i = 0; i < n; i++) 
		        {
		            for (int j = i + 1; j < n; j++) 
		            {
		                if (a[i] < a[j]) 
		                {
		                    z = a[i];
		                    a[i] = a[j];
		                    a[j] = z;
		                }
		            }
		        }
		        System.out.println("Decending Order as follows:");
		        for (int i = 0; i < n - 1; i++) 
		        {
		            System.out.println(a[i] + ",");
		        }
		        System.out.println(a[n - 1]);
		        
		        
		        System.out.println("Largest number is "+a[0]);
		        System.out.println("Third Largest number is "+a[2]);
		}
	
	
	
	
	}

	}

}
