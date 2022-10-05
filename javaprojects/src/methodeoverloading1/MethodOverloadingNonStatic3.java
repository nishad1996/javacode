package methodeoverloading1;

public class MethodOverloadingNonStatic3 {

	void disp() {
		System.out.println("disp without param");
	}
	void disp(int a, double b) {
		System.out.println("disp with int,double");
	}
	void disp(double b, double c) {
		System.out.println("disp with double,double");
	}	
	void disp(double a, int b) {
		System.out.println("disp with doble,int");
	}
	public static void main(String args[]) {
		MethodOverloadingNonStatic3 obj = new MethodOverloadingNonStatic3();
	
		obj.disp();
		//obj.disp(2, 5); compile time error, not possible
		obj.disp(25.5,15.5);
		obj.disp(15.6, 3);
		obj.disp(15, 3.5);

}
}
