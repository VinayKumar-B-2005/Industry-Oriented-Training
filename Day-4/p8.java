package day_4;

import java.util.HashSet;

public class p8{
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,40,50};

        HashSet<Integer> set = new HashSet<>();

      
        for (int number : numbers) {
       
      
        if (set.contains(number)) {
            System.out.println("Duplicate "+number);
        } else {
            set.add(number);
        }
    }
}
}