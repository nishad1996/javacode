package practice;

public class Vowels {

	static  void Vowel1(char y)
	 {
		if(y == 'a' || y == 'e' || y == 'i' || y == 'o') {
			System.out.println("given char is vowel");
	}
		else {
			System.out.println("given char is consonent");

		}
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowel1('a');
		Vowel1('e');
		
		Vowel1('n');
	}

}
