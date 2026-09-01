package day_10;

public class p1{

    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end =   {2, 4, 6, 7, 9, 9};

        System.out.println("Selected Activity: 0");

        int lastEnd = end[0];

        for (int i = 1; i < start.length; i++) {

            if (start[i] >= lastEnd) {

                System.out.println("Selected Activity: " + i);

                lastEnd = end[i];
            }
        }
    }
}
