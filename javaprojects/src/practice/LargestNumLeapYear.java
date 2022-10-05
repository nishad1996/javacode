package practice;

public class LargestNumLeapYear {
	static int LargetsOfThreeNumber(int x,int y,int z) 
	{
		
		if(x>=y && x>=z) {
			return x;
		}
		else if(y>=x && y>=z) {
			return y;
		}
		
		else {
			return z;
			
		}
	}
		static boolean LeapYear(int year) {
			if((year % 4==0) && (year%100 !=0) || (year%400==0)) {
		        System.out.println("leap year");
		        return true;
			}
		        else {
			        System.out.println("not aleap year");
			        return false;
			        
		        	
			}
		}
		
		static void PositiveNegativeNumber(int num) {
			if (num>0){ 
				System.out.println("positive number");
			}
			else{
				System.out.println("negavtive number");

			}
		}
	
	public static void main(String[] args) {
		int a,b,c, largest;
		a=10;
		b=20;
		c=30;
		largest = LargetsOfThreeNumber(a, b, c);
		 
        System.out.println(largest
                           + " is the largest number.");
		
        
        LeapYear(2000) ;
        LeapYear(2001) ;
        
        
        
        PositiveNegativeNumber(10);
        PositiveNegativeNumber(-10);
        }

}
