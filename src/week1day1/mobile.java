package week1day1;

import java.util.Scanner;

public class mobile {

	static long mobilenumber;
	static String make;
	static int price;
	static float cameramegapixel=12.5f;
	static boolean dualsimenabled=true;
	static char fourgenabled;
	static boolean isactive;
	static boolean connected;

	static void createcontact(String contactname, long contactnumber) {

		
		System.out.println( contactname + " is saved successfully");

	}

	static String calling(long mobilenumber) {


		System.out.println("Dialling " + mobilenumber);

		return ("call connected");



	}


	static void lock() {

		System.out.println("Mobile is Locked");
	}

	static void message(long mobilenumber ,String messagecontent) {

		System.out.println("message sent successfully");
	}

	static long getcontactnumber(String contactname) {

		System.out.println("searching for " + contactname + " in contacts book");

		return 8056655998l;
	}

	static String Deletecontact(String contactname, long mobilenumber) {

		System.out.println(contactname + " is deleted successfully ");

		return "8056655998 Deleted";

	}

	static String updatecontact(){
		Scanner js= new Scanner(System.in);


		System.out.println("Enter the updated contact number"  );

		long contactnumber = js.nextLong();

		return contactnumber +" contact updated";
		
	}
		
/*		static void sendingsms(){
			Scanner js= new Scanner(System.in);
			System.out.println("Enter the updated contact number to send text message"  );
			
			long smsnumber = js.nextLong();
			
			System.out.println("Enter the text content"  );
			
			String textcontent = js.toString();
			
			System.out.println(textcontent + "sent to " + smsnumber);
			
			
		}
*/
	
	static void sendingtext(long messagenumber) {
		String messagetext= "Good morning! happy Sunday";
		
		
		
		System.out.println(messagetext + "sent successfully to " + messagenumber );
		
	}
	



	public static void main(String[] args) {

		// TODO Auto-generated method stub



		createcontact("jeba", 8056655998l);
		String dialling=calling(8056655998l);
		System.out.println(dialling);
		lock();
		message(9840707842l , "hello");
		long jebamobilenumber= getcontactnumber("jeba");
		System.out.println(jebamobilenumber);

		String deletingcontact=Deletecontact("jeba", 8056655998l);

		System.out.println(deletingcontact);


		String updatingcontacts=updatecontact();

		System.out.println(updatingcontacts);
		
		sendingtext(9000012341l);
	
		

	}
}