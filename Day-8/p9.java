package day_8;
import java.util.Scanner;

public class p9 {

    int a = 10;

    static int b = 20;

    void display(int b) {
        System.out.println("b = " + b);
    }

    p9(int a) {
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        p9 obj = new p9(5);

        int n = sc.nextInt();

        obj.display(n);

        System.out.println(obj.a);

        System.out.println(b);

        System.out.println(p9.b);
    }
}