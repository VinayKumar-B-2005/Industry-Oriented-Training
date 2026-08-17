public class p10 {
	int a=66;
	static int c=99;
	void m1() {
		int a=10;
		System.out.println("abc"+a);
	}
	public p10() {
		int b=10;
		System.out.println("def"+b);
	}
	public static void main(String[] args) {
		p10 test=new p10();
		test.m1();
		System.out.println(test.a);
		System.out.println(c);
		System.out.println(p10.c);
	}

}
