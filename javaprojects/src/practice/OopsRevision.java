package practice;

interface Oops
{
	void display ();
	int print();
	static int abc () 
	{
		return 10;
	}
	default void xyz ()
	{
		System.out.println("i am default method");
	}
}

abstract class Birthday implements Oops{
	
	public void display ()
	{
		System.out.println("i am ovrrided displya method ");
	}
	abstract void Show ();
	private boolean a = true ;
	public boolean isA() {
		return a;
	}
	public void setA(boolean a) {
		this.a = a;
	}
	
}

class OopsRevision extends Birthday{
	
	public void Show () {
		System.out.println("i am ovrrided show method ");
	}
	public int print ()
	{
		System.out.println("i am ovrrided print method ");
		return 10;
	}
	

	public static void main(String[] args) {
	System.out.println("abc:" +Oops.abc());
	OopsRevision ref =	new OopsRevision ();
	ref.xyz();
	System.out.println("i am read only getter method :" +ref.isA ());
	ref.setA(false);
	ref.display();
	ref.Show();
	ref.print();
	
	Birthday Ref1 = new OopsRevision ();
	System.out.println("i am read only getter method :" +Ref1.isA ());
	Ref1.setA(false);
	System.out.println("i am read only getter method :" +Ref1.isA ());

	Ref1.display();
	Ref1.Show();
	Ref1.print();
	Ref1.xyz();
	
	Oops ref3 = new OopsRevision();
	ref3.display();
	ref3.xyz();
	ref3.print();
	
	Oops ref4 = new OopsRevision();
	OopsRevision ref5 = (OopsRevision) ref4; //downcasting explicit only . 

	ref5.xyz();
	ref5.Show();
	
	}
	

}
