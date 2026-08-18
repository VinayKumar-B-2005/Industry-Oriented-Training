package day_2;

interface Atm
{
	abstract void depo();	
	abstract void with();
	abstract void check();
}
abstract class Abc implements Atm
{	
	public	void depo()
	{
		System.out.println("Depos");
	}
	}

abstract class arm extends Abc{

	public	void with()
	{
		System.out.println("With");
	}
}

public class p20 extends arm{

		public	void check()
		{
			System.out.println("Check");
		}
	
	
public static void main(String[] args) {
	p20 v = new p20();
	v.depo();
	v.with();
	v.check();
}
}