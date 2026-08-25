package day_6;

public class p10 {

	public static void main(String[] args) {
		int[] numbers = {100,200,300,140,150	};
		int windowSize = 3;
		int sum =0;
		for(int i = 0;i<windowSize;i++) {
			sum+=numbers[i];
		}
		System.out.println("sum="+sum);
		int maxsum=sum;
		int start = 0;
		for(int end = windowSize;end<numbers.length;end++) {
			sum -= numbers[start];
			sum += numbers[end];
			start++;
			System.out.println("sum="+sum);
			if(sum>maxsum) {
				maxsum=sum;
			}
		}
		System.out.println("MaxSum= "+maxsum);
		

	}

}
