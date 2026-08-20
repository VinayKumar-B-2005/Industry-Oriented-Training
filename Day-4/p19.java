package day_4;

public class p19 {

	public static void main(String[] args) {
		int s=5;
		
		System.out.println("The Students Marks are: ");
		int[] marks= {78,65,89,92,71};
		int highest=marks[0];
		for(int i=0;i<s;i++) {
			System.out.println(marks[i]);
			if(marks[i]>highest) {
				highest=marks[i];
				
			}
		}
		System.out.println("The highest marks in 5 Students is :"+highest);
		

	}

}
