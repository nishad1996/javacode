package staticvariable;

public class StaticVariable1 {
	static int a=10;
	static float b	;
	
	public static void main(String[] args) {
		System.out.println("outputis:" +a);
		System.out.println("outputis default value of float:" +b);
		//directly access static variable becase main is statc
		//standard fromat is classname.variablename
		
		System.out.println("outputis:" +StaticVariable1.a);
		System.out.println("outputis default value of float:" +StaticVariable1.b);

	}

}
