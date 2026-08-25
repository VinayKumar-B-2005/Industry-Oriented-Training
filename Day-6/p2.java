package day_6;
public class p2 {

	public static void main(String[] args) {
		int[] marks = {10,20,30,40,50};
		int target = 80;
		int left = 0;
		int right = marks.length-1;
		while(left < right) {
			int sum = marks[left] + marks[right];
			if(sum == target) {
				System.out.println("The Two Subjects Marks are "+marks[left]+" and "+marks[right]+":"+" The Student PASSED!");
				break;
			}
			else if(sum<target) {
				
				left++;
			}
			else {
				
				right--;
			}
		}
		

	}

}