package staticmethods;

public class StaticMethod1 {
	
	static void display() {
		System.out.println("I am display method");
	}
	static void print(char c1) //char c1='A'; | char c1=c='A'
	{
		System.out.println("I am print method and printing char as: "+c1);
	}
	static void call(int num) //int num =123;
	{
		System.out.println("I am call method and calling number is: "+num);
	}
	public static void main(String[] args) {	
		System.out.println("Program Starts");
		display();
		print('A');
		call(123);
		System.out.println("************passing parameter using variable**************");
		int num=123;
		char c='A';
		print(c);
		call(num);
		System.out.println("Program Ends");
	}
}