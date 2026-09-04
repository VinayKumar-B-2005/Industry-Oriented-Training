package day_13;

public class p8 {

	public static void main(String[] args) {
		int[] sal= {50000,30000,70000,60000};
		int max_1=sal[0];
		int max_2=0;
		for(int i=0;i<sal.length;i++) {
			if(sal[i]>max_1) {
				max_1=sal[i];
			}
		}
		for(int i=0;i<sal.length;i++) {
			if(sal[i]>max_2&&sal[i]<max_1) {
				max_2=sal[i];
			}
		}
		System.out.println(max_2+" is the 2nd Highest Salary");
	}
}
