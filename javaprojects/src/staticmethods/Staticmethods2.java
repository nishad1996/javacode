package staticmethods;

public class Staticmethods2 {
	static void display()
	{
		System.out.println("I am display method");
	}
	
	static void print (char c)
	{
		System.out.println("i am print method :" +c);
	}
	
	static void call (int num)
	{
		System.out.println("i am call method :"+num);
	}
	
	public static void main(String[] args) {
		Staticmethods2.display();
		Staticmethods2.print('c');
		Staticmethods2.call(123);
		
		char abc='c';
		int num=125;
		
		Staticmethods2.print(abc);
		Staticmethods2.call(num);

		System.out.println("program ends");

	}

}
