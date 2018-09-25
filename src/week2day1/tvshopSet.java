package week2day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class tvshopSet {

	public static void main(String[] args) {
		
		Set<String> jeba = new TreeSet<String>();
		
		jeba.add("Sony");
		jeba.add("Panasonic");
		jeba.add("LG");
		jeba.add("Videocon");
		jeba.add("Thompson");
		jeba.add("Apple");
		jeba.add("Panasonic");
		jeba.add("BPL");
		jeba.add("zBPL");
		System.out.println("List of Branded TV's AVailble");
		for (String js:jeba)
		{
			System.out.println(js);
		}
		
		List<String> jebas = new ArrayList<String>();
		
		jebas.addAll(jeba);
		int size = jeba.size();
		
		System.out.println("The number of brands available in TVSHOP is  " + size);
		
		String get = jebas.get(size-1);
		
		
		System.out.println("The Last Branded TV in the list is " + get);

	}

	

}
