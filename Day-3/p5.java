package day_3;

class p5 {
	public static void main(String[] args) {
		System.out.println("anand");
		System.out.println("anand3");
		int a = 10 / 0;
		try {
			System.out.println("kishore");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("rest of the code");
	}
}

/*Output:

anand
anand3
Exception in thread "main" java.lang.ArithmeticException: / by zero
at day_3/day_3.p5.main(p5.java:7)
*/
