package nonstaticvariable;

public class NonStaticVariable1 {
	int a ;
	float b;
	char c ;
	
	public static void main(String[] args) {
		//System.out.println(""); we cant access directly need to create object
		
		NonStaticVariable1 ref1 = new NonStaticVariable1 ();
		System.out.println("default value of a:" +ref1.a);
		System.out.println("default value of b:" +ref1.b);
		System.out.println("default value of c:" +ref1.c);
		
		//reinitialise the values 
		
		ref1.a= 10;
		ref1.b=20;
		ref1.c= 'c' ;
		
		System.out.println("default value of a:" +ref1.a);
		System.out.println("default value of b:" +ref1.b);
		System.out.println("default value of c:" +ref1.c);
		
		NonStaticVariable1 ref2 = new NonStaticVariable1 ();
		ref2.a= 111;
		ref2.b=10;
		ref2.c= 'N' ;
		
		System.out.println("default value of a:" +ref2.a);
		System.out.println("default value of b:" +ref2.b);
		System.out.println("default value of c:" +ref2.c);
		
		

	}

}
