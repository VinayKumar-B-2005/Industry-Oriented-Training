package day_2;

//Hierarchical in
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

public class p11 extends GrandParent{

	public static void main(String[] args) {
		p11 bb= new p11();
		bb.bp();
		
	}
}
