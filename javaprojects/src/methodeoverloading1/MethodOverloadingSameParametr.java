package methodeoverloading1;

public class MethodOverloadingSameParametr {

		
		   public double myMethod(int num1, double num2)
		   {
		      System.out.println("First myMethod of class Demo");
		      return num1+num2;
		   }
		   public int myMethod(double var1, int var2)
		   {
		      System.out.println("Second myMethod of class Demo");
		      return (int) (var1+var2);
		   }
		   public static void main(String args[])
		   {
			   MethodOverloadingSameParametr obj2= new MethodOverloadingSameParametr();
		      obj2.myMethod(10,10.2);
		      obj2.myMethod(20.5f,12);
		   }
		}
	
