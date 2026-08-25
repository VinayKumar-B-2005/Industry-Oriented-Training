package day_6;

public class p15 {

    public static void main(String[] args) {

        String[] array1 = {"I","am"};
        String[] array2 = {"Vinay","Kumar","B"};

        String[] union = new String[array1.length + array2.length];
        int k = 0;

        
        for (int i = 0; i < array1.length; i++) {
            union[k++] = array1[i];
        }

        
        for (int i = 0; i < array2.length; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (union[j] == array2[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                union[k++] = array2[i];
            }
        }

        System.out.println("Union of arrays:");

        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
    }
}