package day_6;

public class p8 {

	public static void main(String[] args) {
		System.out.println("The scores of the student throughout the YEAR is: ");
		int[] marks= {40,60,30,80,90};
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
			}
		int highest=0;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>highest) {
				highest=marks[i];
			}
		}
		System.out.println("The Highest Score Throughout The Year is: "+highest);

	}

}
