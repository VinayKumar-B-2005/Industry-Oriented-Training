package day_13;

public class p7 {

	public static void main(String[] args) {
		int[] id= {101,102,101
				,103,101};
		int target=101;
		int count=0;
		for(int i=0;i<id.length;i++) {
			if(id[i]==target) {
				count=count+1;
			}
		}
		System.out.println("ID ["+target+"] repeated "+count+" times");

	}

}
