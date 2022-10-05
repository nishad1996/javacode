package string;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		String str1="Nishu";
		char c=str1.charAt(0);
		int i ;
		System.out.println("zero index value of nishu is :"+c);
		//one by one char
		for(i=0;i<str1.length();i++)
		{
			System.out.println(str1.charAt(i));

		}
		
		//one by one reverse char
		System.out.println("******************");

		for (i=str1.length()-1; i>=0;i--) {
		System.out.println(str1.charAt(i));
		}
		
		//reevrse whole string
		String temp ="";
		for (i=str1.length()-1; i >=0; i--) {
		temp=temp+str1.charAt(i);
		}
		System.out.println("str1: " + str1);
		System.out.println("temp: " + temp);
		
		
		//scannerclass using palindrom methode
		Scanner scn=new Scanner(System.in);
		String s3;
		System.out.println("Enter string to check for palindrome");
		s3=scn.next();
		palindrom(s3);
		
		
	}
		//palindrome methode 
		public static void palindrom (String str) {
		String s1=str;
		int i;
		String temp1="";
		for (i=str.length()-1; i>=0; i--) {
			temp1=temp1+str.charAt(i);
		}
		if(temp1.equals(str))
		{
		System.out.println("palindrome:"+str);
		}
		else {
			System.out.println("not palindrome:"+str);
		}		
	}

}
