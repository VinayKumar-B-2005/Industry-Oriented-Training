
package day_2;

//Inheritance 
class Parent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	void bp()
	{
		System.out.println(" understain   bp");
	}
}

public class p9 extends Parent{

	public static void main(String[] args) {
 		p9 bb= new p9();
 		bb.bp();
 		bb.cancer();
	}
}
