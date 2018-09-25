package HWweek2day1;

import java.util.HashMap;
import java.util.Map;

public class trial {

	public static void main(String[] args) {
	
		Map<String,Integer> shop=new HashMap<String, Integer>();
		
		shop.put("apple", 4);
		shop.put("samsung", 8);
		shop.put("videocon", 3);
		shop.put("lava", 1);
		//shop.put(null, null);
		
		int a = shop.size();
		
		System.out.println(a);
		
	
		System.out.println();
		
		
		

	}

}
