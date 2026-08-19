package day_3;

//Array Index Out Of Bounds Exception Handling Using Parent Exception

public class p2 {
	public static void main(String[] args) {
		System.out.println("Hello");

		try {
			int[] a = { 10, 20, 30 };
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);

		}

		catch (Exception e) {
			System.out.println("Handled "+e);
		
		}
		System.out.println("Hello sir");
	}

}

/*Output:

Hello
10
20
30
Handled java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
Hello sir
*/
