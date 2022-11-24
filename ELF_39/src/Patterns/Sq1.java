package Patterns;

import java.util.Scanner;

public class Sq1 {

	public static void main(String[] args) {
		Scanner soma = new Scanner(System.in);
		System.out.println("Enter the Row value");
		int row=soma.nextInt();
		System.out.println("Enter the Column value");
		int column=soma.nextInt();
		int num=1;int sum=0;
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=column;j++) {
				if(i%2==0) {
						sum=num+row;
						System.out.print(sum-- +" ");}
				
				else {
					System.out.print(num++ +" ");}
		}
				System.out.println();
			
	}
		
}
}

