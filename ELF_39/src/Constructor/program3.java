package Constructor;

import java.util.Scanner;
public class program3 {
	
	program3(int a,int b){
		int c=a+b;
		System.out.println("The addition of two number is :"+c);
	}

	public static void main(String[] args) {
	
		Scanner soma = new Scanner (System.in);
		System.out.println("Enter the value 1 ");
		int a= soma.nextInt();
		System.out.println("Enter the value 2 ");
		int b= soma.nextInt();
		program3 a3 = new program3 (a,b);
		

	}

}
