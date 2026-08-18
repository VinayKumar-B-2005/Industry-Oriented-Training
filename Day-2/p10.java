package day_2;

class GrandParent
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Parent extends GrandParent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}

public class p10 extends Parent{

	public static void main(String[] args) {
 		p10 bb= new p10();
 		bb.bp();
 		bb.cancer();
	}
}