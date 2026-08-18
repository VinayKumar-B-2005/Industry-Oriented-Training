package day_2;

public class p17 {

	public static void main(String[] args) {
		int n = 3;

		for (int i = 0; i < n; i++) {

		    // spaces
		    for (int j = 0; j < i; j++) {
		        System.out.print(" ");
		    }

		    // stars
		    for (int j = 0; j < 2 * (n - i) - 1; j++) {
		        System.out.print("*");
		    }

		    System.out.println();
		}
	}

}
