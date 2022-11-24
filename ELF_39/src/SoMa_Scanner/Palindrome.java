package SoMa_Scanner;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner soma = new Scanner(System.in);
		
		System.out.println("Enter the number to check whether it is palindrome or not");
		
		int a=soma.nextInt();
		
		int number=a;
		
		int reverse=0;
		
		while(number>0) {
			int rem =number%10;
			reverse=(reverse*10)+rem;
			number=number/10;
		}

		if(a==reverse) {
		System.out.println("Yes,The entered number is palindrome ");	
		}
		else {
			
			System.out.println("No,The entered number is not a palindrome");
		}
		
	}
	

}
