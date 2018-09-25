package week2day2;

import java.util.*;
import java.util.Map.Entry;

public class tvShop {

	public static void main(String[] args) {
	
		
		Map<String, Integer> tv = new LinkedHashMap<String, Integer>();
		
		tv.put("Panasonic", 2);
		tv.put("Sony", 3);
		tv.put("LG", 5);
		tv.put("Samsung", 1);
		
		int size = tv.size();
		System.out.println(" total number of brands available :" + tv.size());
		/*
	
	int n=0;
		
		for (Entry<String, Integer> num : tv.entrySet()) {
			
			//System.out.println(num.getValue());
			 n=n+num.getValue();
			
			
						}
		System.out.println("The Total Number of TV's Available :"+n);
		
		

	}
		*/
	
	
 // to get the key value in single dimension we use  keyset
	Set<String> alltvs = tv.keySet();
	// in SET we cant use get method , so we use List
	
	List<String> tvnum = new ArrayList<String>();
	
	//adding  all the keys we stored from SET to LIST
	tvnum.addAll(alltvs);
	
	//printing  the last key in the list
	
	System.out.println(tvnum.get(tvnum.size()-1));
	
	// get last value from map, tvnum.get(tvnum.size()-1) is the key value which is samsung
	Integer count = tv.get(tvnum.get(tvnum.size()-1));
	//decrementing the last count
	System.out.println("output isn "+count);
		tv.put(tvnum.get(tvnum.size()-1), count-1);
		
		
		System.out.println(tv);
		
	}
	

}

		