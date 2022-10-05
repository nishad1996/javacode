package practice;

public class Blocks {

			
			Blocks(){
				this(10);
				System.out.println("zero-param cons..");
			}
			Blocks(int i){
				System.out.println("int-param cons..");
			}
			
			/* static block or SIB*/
			static {		
				System.out.println("running static-block-1 of class Blocks2..");		
			}
			/* non-static block or IIB*/
			{
				System.out.println("running non-static-block-1 of class Blocks4..");
			}
			
			public static void main(String[] args) {
				System.out.println("main() Starts");
				Blocks b1=new Blocks();
				System.out.println("---------------------------------");
				Blocks b2=new Blocks();
				System.out.println("main() ends");
			}
			/* static block or SIB*/
			static {		
				System.out.println("running static-block-2 of class Blocks2..");		
			}
			/* non-static block or IIB*/
			{
				System.out.println("running non-static-block-2 of class Blocks4..");
			}
		}
