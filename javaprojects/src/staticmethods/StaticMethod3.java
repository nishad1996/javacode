package staticmethods;

public class StaticMethod3 {
	 static double a=10,b=20,c=30;

	    public static double average (double x, double y,double z)
	    {
	    	return (x+y+z)/3;
	    }
	public static void main(String[] args) {
		System.out.println("average of :" +a);	
		System.out.println("average of :" +b);	
		System.out.println("average of :" +c);	
	    System.out.println("average of :" +average(a,b,c));	
	
	    System.out.println("average of :" +average(10,20,40));	
	    System.out.println("average of :" +average(10,50,70));	
	    System.out.println("average of :" +average(10,80,10));	
	}
	
	    }
	
