package day_2;

public class p5 {
	int a = 20;
	int b = 10;

	void m1(int a,int b ) {
		System.out.println("asdfas "+(this.a+this.b));

		System.out.println("abc "+(a+b));
	}

	public static void main(String[] args) {
		p5 vv = new p5();
		vv.m1(4,3);
	}
}
