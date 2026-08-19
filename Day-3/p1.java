package day_3;

//Arithmatic Exception Handling Using Parent Exception

public class p1 {
	public static void main(String[] args) {
		

		try {
			System.out.println("Hello");
			System.out.println(10 / 0);

		
		} catch (Exception e) {
			System.out.println(" exception handle");
		}
		System.out.println("Hello sir");
	}
}

/*Output:

Hello
exception handle
Hello sir
*/
