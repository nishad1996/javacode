package practice;

public class EvenOddIfElse {

	public static void EvenOddint (int num) {
		
		if (num%2==0)
		{
			System.out.println("even number");
		}
		else {
			System.out.println("odd number ");
		}
	}
	public static void main(String[] args) {
		EvenOddint(10);
		EvenOddint(11);
		
	}

}
