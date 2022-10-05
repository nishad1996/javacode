package methodeoverloading1;

class DisplayOverloading
{
	public void display(char c) 
	{
		System.out.println(c);
	}
	
	public void display(char c, int a ) 
	{
		System.out.println(c+ "  " +a);
		
	}
}
public class MethodOverloadingNonstatic2 {

	public static void main(String[] args) {
		
		DisplayOverloading ref1 = new DisplayOverloading();
		ref1.display('c');
		ref1.display('a',10);
		
		MethodOverloadingNonstatic2 ref2 = new MethodOverloadingNonstatic2();
		ref2.call(12.5);
		
	}
	public void call(double d) {
		System.out.println("Calling....." +d);
}
}
