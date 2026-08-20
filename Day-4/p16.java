package day_4;
import java.util.Scanner;
public class p16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("----------MENU----------");
		System.out.println(" 1.Pizza\n 2.Burger\n 3.Sandwitch\n 4.Pasta\n 5.Taco\n");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Pizzo");
			break;
		case 2:
			System.out.println("Burger");
			break;
		case 3:
			System.out.println("Sandwitch");
			break;
		case 4:
			System.out.println("Pasta");
			break;
		case 5:
			System.out.println("Taco");
			break;
		default:
			System.out.println("Invalid");
			
		
		}

	}

}