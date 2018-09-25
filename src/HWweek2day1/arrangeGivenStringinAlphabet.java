package HWweek2day1;

import java.util.*;

public class arrangeGivenStringinAlphabet {

	public static void main(String[] args) {
		
String a="amazon development center";
// to convert from String to Array
char[] b=a.toCharArray();
System.out.println("Array output of "+a);

for (char js : b) {

System.out.println(" "+ js );
}

System.out.println("Unique character output in the entered format");

List<Character> c=new ArrayList<Character>();

for (int i=0 ; i<b.length ; i++)

{
	
	c.add(b[i]);
}

Collections.sort(c);

for(Character d : c) {
System.out.print(d);

}



	}
}



