package day_2;

//poly morphism
//method overriding
 class p {
	void property()
	   {
		   System.out.println("Property");
	   }
	   void marry()
	   {
		   System.out.println("famaily selected girl/boy");
	   }
	}
	public class p2 extends p {
		void marry()
		{
			System.out.println("campus selected girl/boy");
		}
		public static void main(String[] args) {
			p2 test = new p2();// object
			test.marry();
			test.property();
		
		}
}
