package dailycode;
import java.util.Scanner;
public class aosort {

    public static void main(String[] args)
	
	{
        int n, z;
        Scanner js = new Scanner(System.in);
        System.out.print("Enter the number of elements to be sorted:");
        n = js.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n+ " elements:");
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
            
          //  System.out.print("Ascending Order of the entered numbers:");
            System.out.print(a[i] + ",");
        }
       
      //  for (int i = 0; i < n - 1; i++) 
      //  {
      //      System.out.print(a[i] + ",");
     //  }
     //   System.out.print(a[n - 1]);
    }

}
