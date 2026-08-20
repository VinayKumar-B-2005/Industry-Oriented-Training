package day_4;
import java.util.HashSet;
public class p6 {

	public static void main(String[] args) {
		HashSet<Integer> num=new HashSet<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(40);
		num.add(50);
		//it not stores duplicate values
		System.out.println(num);
		int target=40;
		boolean found=false;
		if(num.contains(target)) {
			found=true;
		}
		if(found) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
		

	}

}

/*Output:

[20, 40, 10, 30]
Found

*/