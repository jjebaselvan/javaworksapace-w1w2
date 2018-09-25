package week2day1;

public class samsungtv implements Television, smartTv{


	public static void main(String[] args) {
		
		
	}
	@Override
	public void changeChannel(int number) {
		// TODO Auto-generated method stub
		
		System.out.println("channel changed to "+ number);
		
	}
	@Override
	public void changeChannel(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("channel changed to "+ name);
		
	}
	@Override
	public void tvInput(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("TV Input changed to "+ name);
		
	}
	@Override
	public void volume(int number) {
		// TODO Auto-generated method stub
		
		System.out.println("Voulme changed to "+ number);
		
	}
	@Override
	public void surf(String url) {
		// TODO Auto-generated method stub
		
		System.out.println("Opening the link "+ url);
		
	}
	@Override
	public void youtube(String search) {
		// TODO Auto-generated method stub
		System.out.println("enter the keyword "+ search);
		
	}
	@Override
	public String installapp(String appname) {
		// TODO Auto-generated method stub
		
		System.out.println("Application name "+ appname);
		return appname  + "installed successfully";
				
	}

}
