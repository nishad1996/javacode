package methodeoverloading1;

public class MethodOverloading1 {

	public static void main(String[] args) {
		System.out.println("i am main method ()");
		main(10);
		main(12.5f);
		main(10,10);
		main (10.2f,2.2f);
		
	}
	
		public static void main (int a) 
		{
			System.out.println("type of parameters differ");

			System.out.println("i am overloaded method with one parameter :" +a);

	}

		
		public static void main (float b) 
		{
			System.out.println("i am overloaded method with one parameter :" +b);

	}
		public static void main (int a ,int b) 
		{

			System.out.println("i am overloaded method with one parameter :");

	}

		
		public static void main (float a, float b) 
		{
			System.out.println("i am overloaded method with one parameter :");

	}
		

}
