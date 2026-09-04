package day_13;

public class p10 {

    public static void main(String[] args) {
        String name = "vinay";
        String vowels = "aeiou";
        int count = 0;
        
        for(int i=0; i<name.length(); i++) {
            for(int j=0; j<vowels.length(); j++) {
                if(name.charAt(i) == vowels.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println("The " + count + " vowels in the customer '" + name+"'");
    }
}