package day_4;

public class p18 {

	public static void main(String[] args) {
		int days=7;
		int total=0;
		System.out.println("The Units of 7 Days are: ");
		int[] units= {10,15,12,20,18,14,16};
		
		for(int i=0;i<days;i++) {
			System.out.println(units[i]);
			total=total+units[i];
		}
		System.out.println("The Total Units of 7 DAY's are: "+total);

	}

}
