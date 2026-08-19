package day_3;

public class p9 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("method"+i);
		}
	}
	public static void main(String[] args) {
		p9 bb=new p9();
		bb.start();
		for(int i=0;i<5;i++) {
			System.out.println("main method"+i);
		}
	}
}

/*Output:
		main method0
		method0
		method1
		main method1
		main method2
		main method3
		main method4
		method2
		method3
		method4
*/