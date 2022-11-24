package SoMa_Scanner;

import java.util.Scanner;

public class Fibonacci_scanner {
	public static void main(String[] args) {
		
		Scanner soma = new Scanner(System.in);
		
		System.out.println("Enter the range to print fabonacci series");
		
		int c = soma.nextInt(); 
		int a=0,b=1,sum=0;
		
		System.out.println("The fabonacci series are as follows : ");
		 for(int i=1;i<=c;i++) {
			 if(i==0||i==1) {
				 System.out.print(i+" ");
			 }
			 else {
				 sum=a+b;
				 a=b;
				 b=sum;
				 System.out.print(sum+" ");
			 }
		 }

	}

}
	
