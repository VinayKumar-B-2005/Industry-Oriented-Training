import java.util.Scanner;

public class p6 {
	void palindrome(String s,String rev) {
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
		System.out.println("Palindrome of "+s+" is:"+rev);}
		else {
			System.out.println("No Palindrome");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		p6 pal=new p6();
		pal.palindrome(s, rev);
	}

}
