package day_6;

public class p4 {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50};
		int windowSize = 3;
		int sum1 =0;
		int sum2=0;
		int sum3=0;
		for(int i = 0;i<windowSize;i++) {
			sum1+=numbers[i];
		}
		System.out.println("sum="+sum1);
		for(int i = 1;i<4;i++) {
			sum2+=numbers[i];
		}
		System.out.println("sum="+sum2);
		
		for(int i = 2;i<5;i++) {
			sum3+=numbers[i];
		}
		System.out.println("sum="+sum3);
		
		
	}

}
