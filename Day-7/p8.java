package day_7;
import java.util.Scanner;
public class p8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter PASSWORD: ");
		String trypassword=sc.nextLine();
		String pattern="123";
		if(trypassword.equals(pattern)) {
			System.out.println("Password found: "+trypassword);
		}else {
			System.out.println("Wrong password. Go back andd try another. ");
		}

	}

}
