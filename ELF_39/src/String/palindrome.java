package String;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner soma = new Scanner(System.in);
		System.out.println("Enter the String value "+" & click on enter button");
		String s1= soma.nextLine();
		
		String s3=s1;
		String s2="";
	
		for(int i=(s1.length()-1);i>=0;i--){
			s2=s2+s1.charAt(i);
		
		}

		if(s3.equals(s2)) {
			System.out.println(s2+" It is a palindrome");
		}
		else if(s3.equalsIgnoreCase("KEERTHANA")) {
			System.out.println( "She is tuntun aunty");}
		
		else {
			System.out.println(s2+" It is not a palindrome");
		}
	}

}
