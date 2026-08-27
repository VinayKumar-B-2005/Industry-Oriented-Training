package day_7;

public class p5 {

	public static void main(String[] args) {
		int n=10000;
		System.out.println("Total Balance: "+n);
		System.out.println("Withdrawing 2k for every loop: ");
		
		int minb=2000;
		for(int i=n-minb;i>=0;i=i-2000) {
			System.out.println("Withdraw Successfull, Remaining: "+i);
		}

	}

}
