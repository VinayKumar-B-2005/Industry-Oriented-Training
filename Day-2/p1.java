package day_2;

//poly morphism
//method overloading

public class p1 {
	void minbal() {
		System.out.println("abc");
	}
	void minbal(int a) {
		System.out.println("def "+a);
	}
	public static void main(String[] args) {
		p1 test = new p1();// object
		test.minbal();
		test.minbal(3);
	}
}
