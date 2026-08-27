package day_7;

public class p4 {
	static void withdraw(int n) {
	if(n==0) {
		return;
	}
	if(n>=2000) {
		int m=n-2000;
		System.out.println("2K Withdraw Successfull, Remaining: "+m);
		withdraw(n-2000);
	}
	
	
	}
	
	public static void main(String[] args) {
		System.out.println("Total Balance= 10000 ");
		withdraw(10000);
		

	}

}
