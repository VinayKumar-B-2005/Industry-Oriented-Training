package day_3;

class p6 {
	public static void main(String[] args) {
		try {
			System.out.println("kishore");
			System.exit(0);
		} finally {
			System.out.println("finally block");
		}
		System.out.println("rest of the code");
	}
}

//output:kishore