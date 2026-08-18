package day_2;

import java.util.Scanner;

public class p22 {
	void reverse(String s,String rev) {
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		p22 pal=new p22();
		pal.reverse(s, rev);
	}

}