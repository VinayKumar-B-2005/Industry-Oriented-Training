package day_13;

public class p5 {
	public static void main(String[] args) {
		int[] id= {10,15,20,25,30};
		int count=0;
		for(int i=0;i<id.length;i++) {
			if(id[i]%2==0) {
				count=count+1;
			}
		}
		System.out.println(count+" ID's are even");
	}
}
