package practice;

class study {
	int m=20; //glabal 
	static boolean n=true ;
	
	void display ()
	{
		int m= 70;
		System.out.println("i am display method");
		System.out.println(+m);
		System.out.println(+this.m);

	}
	
	static int print(int a) 
	{
		System.out.println(":" +a);
		return 10;
		
	}
	
}



public class Revision extends study {
	
	void display ()
	{
		super.display();
		int m= 70;
		System.out.println("i am display method2");
	}
	
	Revision()
	{
		this(10,20);
		System.out.println("i am non para const");
	}

	Revision( int w, int f)
	{
		System.out.println("i am int para const");

	}

	boolean nisha(boolean c) 
	{
		System.out.println(":" +c);
		return true;
		
	}
	
	int nisha (int m,int n) 
	{
	int res=m+n;
	return res;
	}
	
	
	static int lokesh (int a) 
	{
	System.out.println(":" +a);
	return 10;
	}
	

	static void lokesh (float b) 
	{
	System.out.println( +b);
	}
	
	
	
	
	public static void main(String[] args) {
		int a =10;
		float b=10.1f;//loacal
		int m = 70;

		System.out.println(":" +a);
		System.out.println(":" +b);
		study f1= new study ();
		System.out.println("glabal variable is:" +f1.m);
		System.out.println(":" +study.n);
		
		f1.display();
		study.print(12);
		
		System.out.println(":" +study.print(a));
		
		Revision r1 = new Revision();
		r1.nisha(true);
		boolean c=false;
		r1.nisha(c);
		
		//System.out.println(+r1.nisha(10,15));
		int x = r1.nisha(10, 15);
		System.out.println(+x);
		 Revision.lokesh(97.2f);	
		 Revision.lokesh(55);
		 	System.out.println(+Revision.lokesh(34));
			f1.display();
			Revision g1 = new Revision ();
			g1.display();
			study s1=new Revision ();//only overriden methods to be called using this obejct 
			
	}

}
