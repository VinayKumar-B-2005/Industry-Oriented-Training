package day_7;

public class p6 {

	public static void main(String[] args) {
		int n=10000;
		System.out.println("Total Balance: "+n);
		System.out.println("Withdrawing 2k for every loop: ");
		
		
		while(n>0) {
			n=n-2000;
			System.out.println("Withdraw Successfull, Remaining: "+n);
		}

	}

}
