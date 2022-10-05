package methodeoverloading1;

public class MethodOverloadingNonStatic1 {
	float res;
	
	public void square()
	{
		System.out.println("no parameter");
	}
	
	public void square(int number)
	{
		res=number*number;
		
		System.out.println("result:" +res);
	}
	public void square(float number,float number1)
	{
		res=number*number1;
		
		System.out.println("result:" +res);
	}
	
	
	public static void main(String[] args) {
//cant acceess direclty as uts non static method 
		MethodOverloadingNonStatic1 ref1= new MethodOverloadingNonStatic1();
		ref1.square();
		ref1.square(10);
		ref1.square(2.5f,2);

	}

}
