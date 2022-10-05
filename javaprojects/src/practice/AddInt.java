package practice;

public class AddInt {
	
	public static void addition(int a , int b) {
		int result= a+b;
		System.out.println("addition :"+result);	
	}
	
	public static double multi(float  x, float y) {
		double result1;
		result1 =x*y;
		return result1;
		
	}
	
	public static void quotient (int v, int w) {
	double quo = v/w;
	System.out.println("quotient is :"+quo);
	
	}
	public static void remainder (int d, int p) {
		double remain = d%p;
		System.out.println("quotient is :"+remain);
	}
	
	public static void main(String[] args) {
		
		addition(10,20);
		System.out.println("multiplication of two float num is :"+multi(10.5f,20.5f));
		quotient(50,5);
		remainder(50,2);

	}
}

