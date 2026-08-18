package day_2;

public class p6 {
	int a ;
	int b ;

	void m1(int c,int d ) {
	 a=c;
	 b=d;
	}
	void m2() {
	 System.out.println(a+b);
	}

	public static void main(String[] args) {
		p6 vv = new p6();
		vv.m1(4,3);
		vv.m2();
	}
}
