package week2day2;

public class myphone extends Sonyericson {

	public static void main(String[] args) {
		
		Sonyericson js=new Sonyericson();
		
		
		js.addcontact("jeba", 8056655998l);
		js.search(8056655998l);
		js.search("jeba");
		js.dial("jeba");
		js.camera(20);
		js.screensize(5.4f);
		js.fourGenabled(false);

	

}
}