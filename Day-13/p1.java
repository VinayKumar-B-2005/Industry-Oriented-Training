package day_13;

public class p1 {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3};
		System.out.print("Unique Elements: ");
		for(int i=0; i<arr.length; i++) {
		    boolean duplicate = false;
		    for(int j=0; j<i; j++) {
		        if(arr[i] == arr[j]) {
		            duplicate = true;
		        }
		    }
		    if(!duplicate) {
		        System.out.print(arr[i] + " ");
		    }
		}}
}
