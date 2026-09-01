package day_10;

public class p2{
	
	public static void main(String[] args) {

		int[] start = {1, 3, 0, 5, 8, 5};
		int[] end =   {2, 4, 6, 7, 9, 9};

		System.out.println("Patient 0 appointment selected");

		int lastEnd = end[0];

		for (int i = 1; i < start.length; i++) {

			if (start[i] >= lastEnd) {

				System.out.println("Patient " + i + " appointment selected");

				lastEnd = end[i];
        }
    }
}

}
