package day_4;

public class p20 {

	public static void main(String[] args) {
		int s=7;
		int pass=0;
		int[] marks= {35,67,89,22,45,30,76};
		System.out.println("The Marks are: ");
		for(int i=0;i<s;i++) {
			System.out.println(marks[i]);
			if(marks[i]>=40) {
				pass=pass+1;
			}
		}
		System.out.println("The Total Students Passed In The Class are: "+pass);

	}

}
