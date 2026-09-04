package day_13;

public class p4 {

	public static void main(String[] args) {
		int[] sal= {25000,40000,30000,50000};
		int max=sal[0];
		for(int i=1;i<sal.length;i++) {
			if(sal[i]>max) {
				max=sal[i];
			}
		}
		System.out.println("The maximum salary is= " +max);
	}

}
