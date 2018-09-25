package week2day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class tvshopLIST {

	public static void main(String[] args) {
		
		// object creation for array list
		List<String> tv= new ArrayList<String>();
		tv.add("sony");
		tv.add("samsung");
		tv.add("LG");
		tv.add("Samsung");
		for (String js : tv) {
		
		System.out.println(js);
		
		}
		
		int size = tv.size();
		
		System.out.println(size);
		
		String remove = tv.remove(size-1);
		
		for (String js : tv) {
			
			System.out.println(js);
			
			}
			
			
		Collections.sort(tv);
		
for (String js : tv) {
			System.out.println("Sorted output");
			System.out.println(js);
			
			}
		
		
		
		

	}

}
