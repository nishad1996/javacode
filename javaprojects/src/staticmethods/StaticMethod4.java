package staticmethods;

public class StaticMethod4 {
	static double getROI()
	{
		int p=12500,t=4;
		float r=6.5f;
		 double roi = (p*r*t)/100;
		 System.out.println("Principle amount is: "+p);
		 System.out.println("Principle amount is: "+t);
		 System.out.println("Principle amount is: "+r);
		 return roi;
	}
	
	static double getROI(int p,int t,float r)
	{
	double roi=(p*r*t)/100;
	System.out.println("Principle amount is: "+p);
	System.out.println("ROI is: "+r);
	System.out.println("Duration is: "+t);
	System.out.println("Interest paid by you: "+roi);
	return roi;
	}
	
	public static void main(String[] args) {
		getROI();
		
		System.out.println("roi PRINTING THROGH SOP");
		System.out.println("roi:" +getROI());
		System.out.println("******DECLARING THROGH VARIABLE *****");
		double intrest = getROI ();
		double totalamountpaid= intrest+12500;
		System.out.println("totalamountpaid is :" +totalamountpaid);
		System.out.println("**********");

		System.out.println("roi:" +intrest);
		System.out.println("using parameter");
		
		int amount=15000;
		double interest = getROI(amount, 2 ,2.5f);
		

		
	}

}
