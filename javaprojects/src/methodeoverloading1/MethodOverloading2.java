package methodeoverloading1;

public class MethodOverloading2 {
	static double res; 
	static public void square ()
	{
		System.out.println("no parameter");
	}
	
	static public void square (double number)
	{
		res=number*number;
		System.out.println("res :" +res);
	}
	
	static public void square (int number)
	{
		res=number*number;
		System.out.println("res:" +res);
	}
	
	public static void main(String[] args) {
		square();
		square(10.5);
		square(10);
		
	}

}
