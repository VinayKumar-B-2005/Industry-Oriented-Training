package day_7;

public class p12 {

	public static void main(String[] args) {
		String[] arr= {"a","a","b","b","c","c","d","d"};
		String target="d";
		int first=-1;
		int last=-1;
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid].equals(target)) {
				first=mid;
				end=mid-1;
			}
			else if(target.compareTo(arr[mid])>0) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		start=0;
		end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				last=mid;
				start=mid+1;
			}
			else if(target.compareTo(arr[mid])>0) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		System.out.println("First= "+first);
		System.out.println("Last= "+last);

	}

}
