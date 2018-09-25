package week2day2;

public  class Sonyericson implements interpractise, samartphone  {

	public static void main(String[] args) {
		



}

	
	public void addcontact(String Name, Long number) {
		System.out.println("contact has been added");
		
	}

	
	public void search(Long number) {
		System.out.println("found " + number);
		
	}


	public void search(String name) {
		System.out.println(name + "found");
		
	}

	
	public void dial(String name) {
		System.out.println("Dialling" + name);
		
	}

	
		
	

	
	public void camera(int megapixel) {
		System.out.println("camera Megapixel is "+ megapixel);
		
	}


	public void screensize(float size) {
		System.out.println("screen size is "+size);
		
	}

	
	public void fourGenabled(boolean flag)
	
	{
		
		if (flag=false)
		{ 
			System.out.println("4G Enabled");
		}
		else
		{
			System.out.println("4G not  Enabled");
		}
		
		
	}
}

	
