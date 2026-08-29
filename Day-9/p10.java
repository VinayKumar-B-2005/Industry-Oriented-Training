package day_9;

import java.util.ArrayList;
public class p10 {

	public static void main(String[] args) {
		String[] nums= {"8932473906","8977647898","9783664564","9374894864"};
		String search="89";
		ArrayList<String> result=new ArrayList<>();
		for(String num:nums) {
			if(num.contains(search)) {
				result.add(num);
				
			}
		}
		System.out.println("Search results:");
		for(String num:result) {
			System.out.println(num);
		}
		

	}

}
