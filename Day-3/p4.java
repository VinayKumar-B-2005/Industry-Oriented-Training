package day_3;
class p4 {
	public static void main(String[] args) {
		try {
			System.out.println("anand");
			System.out.println(10 / 0);
		} catch (NullPointerException ne) {
			System.out.println("u r getting ne" + ne);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code"); // this line not executed
	}
}

/*Output:

anand
finally block is always executed
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day_3/day_3.p4.main(p4.java:6)
	*/
