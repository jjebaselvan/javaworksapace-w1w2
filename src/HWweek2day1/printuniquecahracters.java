package HWweek2day1;

import java.util.*;

public class printuniquecahracters {

	public static void main(String[] args) {
		
String a="cognizant india";
// to convert from 
char[] b=a.toCharArray();
System.out.println("Array output of "+a);

for (char js : b) {

System.out.println(" "+ js );
}

System.out.println("Unique character output in the entered format(ignoring duplicates)");

Set<Character> c=new LinkedHashSet<Character>();

for (int i=0 ; i<b.length ; i++)

{
	
	c.add(b[i]);
}

for(Character d : c)
System.out.print(d);

}
}





