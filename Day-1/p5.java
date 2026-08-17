import java.util.Scanner;
public class p5 {
	void fib(int a,int b,int n) {
		
		for(int i=0;i<n;i++) {
	    	System.out.println(a+"");
	    	int c=a+b;
	    	a=b;
	    	b=c;
	    }
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
	    int a=0;
	    int b=1;
	    p5 fibbonacci=new p5();
	    fibbonacci.fib(a, b, n);

	}

}
