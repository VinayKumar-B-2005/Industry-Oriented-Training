public class p9 {
	int fact(int n) {
		if(n==1||n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		p9 factorial=new p9();
		System.out.println(factorial.fact(6));
		
	}

}
