package HWweek2day1;

import java.util.*;

public class findLastCharInAplhabetOrder {

	public static void main(String[] args) {
		
String a="amazon development center";
// to convert from string to array
char[] b=a.toCharArray();
System.out.println("Array output of "+a);

for (Character js : b) {

System.out.println(" "+ js );
}

System.out.println("Unique character output in the entered format");

List<Character> c=new ArrayList<Character>();

for (int i=0 ; i<b.length ; i++)

{
	
	c.add(b[i]);
}

Collections.sort(c);

for(char d : c) {
System.out.print(d);

}
System.out.print("\n");
List<Character> e=new ArrayList<Character>();
e.addAll(c);


int size = c.size();

Character ee= e.get(size-1);

System.out.println("The last character of the sorted string "+a+ "is " + ee);


	}
}



