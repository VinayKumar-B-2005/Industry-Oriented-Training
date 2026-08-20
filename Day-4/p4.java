package day_4;

//using one for loop

public class p4{

public static void main(String[] args) {
	int n=100000;
	int[] students=new int[n];
	int target=1000;
	boolean found=false;
	
	
	for(int i=0;i<n;i++) {
		students[i]=i+1;
		if(students[i]==target) {
			found=true;
			break;
		}
		if(found) {
			break;
		}
	}
	System.out.println("Student Found:"+found);
}
}