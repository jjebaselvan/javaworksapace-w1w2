package week1day1;

public class objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mobile jobject= new mobile();

		String contactbook=jobject.updatecontact();

		System.out.println(contactbook);
		
		

		boolean dualsimenabled=jobject.dualsimenabled;
		System.out.println("Dual sim enabled " + dualsimenabled);
	
	}

}











