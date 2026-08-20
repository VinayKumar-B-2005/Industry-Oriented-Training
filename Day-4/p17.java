package day_4;
import java.util.Scanner;
public class p17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=num;i>0;i--) {
			sum=sum+i;
		}
		System.out.println("The reverse sum of "+num+" is "+sum);
		

	}

}
