package day_2;

public class p3 {
	int a = 20;

	void m1(int b) {
		System.out.println("abc "+b);
		System.out.println("def "+a);
	}

	public static void main(String[] args) {
		p3 vv = new p3();
		vv.m1(4);
	}
}
