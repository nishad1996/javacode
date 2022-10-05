package methodeoverloading1;

class adder{
	static int add(int a , int b)
	{
		return a+b;
	}
	
	static int add(int a , int b, int c)
	{
		return a+b+c;
	}
	
}


public class MethodOverloading3 {

	public static void main(String[] args) {
		System.out.println("access throgh class name is not possible  ");
		adder.add(10,10);
		adder.add(10,10,10);
		
		System.out.println("access throgh println ");
		System.out.println("value is : " +adder.add(10,10));
		System.out.println("value is : " +adder.add(10,10,10));
		//can access other classses also 
		MethodOverloading2.square();
		MethodOverloading2.square(10.5);
		MethodOverloading2.square(10);
		
	}

}
