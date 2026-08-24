package day_5;
import java.util.Iterator;
import java.util.HashSet;

public class p11 {

	public static void main(String[] args) {
		HashSet a=new HashSet();
		a.add("A");
		a.add("B");
		a.add("E");
		a.add("R");
		a.add("A");
		a.add("C");
		a.add("D");
		a.add("F");
		a.add("V");
		a.add("S");
		Iterator<String> it=a.iterator();
		while(it.hasNext()) {
			String b=it.next(); 
			System.out.println("The values in the HashSet are: "+b);
			if(b.equals("A")) {
				it.remove();
			}
			
			}
		System.out.println("After removing: "+a);
		

	}

}
