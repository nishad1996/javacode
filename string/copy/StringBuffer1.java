package string.copy;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("hey , nisha here");
		System.out.println("string is :"+sb);
		sb.replace(0,4,"hello");
		System.out.println("string is :"+sb);
		sb.append(" dongare");
		System.out.println("string is :"+sb);
		sb.delete(13,17);
		System.out.println("string is :"+sb);
	}

}
