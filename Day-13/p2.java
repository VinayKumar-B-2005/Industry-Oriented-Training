package day_13;

public class p2 {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3};
		int i = 0;
		while(i < arr.length-1) {
		    if(arr[i] == arr[i+1]) {
		        arr[i+1] = 0;
		    }
		    i++;
		}
		for(int x : arr) {
		    if(x != 0)
		        System.out.print(x + " ");
		}
	}
}