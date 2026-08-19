package day_3;

	import java.util.Scanner;

	class p7 {
		static void validate(int age) {
			if (age < 18) {
			
				throw new ArithmeticException("not elgible for vote");
			} else {
				System.out.println("welcome to the voteing");
			}
		}

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("please enter your age ");
			int n = s.nextInt();
			validate(n);
			System.out.println("rest of the code");
		}
	}
	
	
/*Output:
	please enter your age 
	20
	welcome to the voteing
	rest of the code
	*/
