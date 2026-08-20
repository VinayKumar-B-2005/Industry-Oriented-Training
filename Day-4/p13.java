package day_4;

public class p13 {

	public static void main(String[] args) {
		int emp=5;
		int tot_sal=0;
		int[] sal= {10000,15000,12000,18000,20000};
		for(int i=0;i<emp;i++) {
			tot_sal=sal[i]+tot_sal;
		}
		System.out.println("Total Salary: "+tot_sal);


}}