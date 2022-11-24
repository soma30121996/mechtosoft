package Patterns;

import java.util.Scanner;

public class Sq2 {

	public static void main(String[] args) {
		Scanner soma = new Scanner(System.in);
		System.out.println("Enter the Row value");
		int row=soma.nextInt();
		System.out.println("Enter the Column value");
		int column=soma.nextInt();
	
		for(int i=1;i<=row;i++) {
			int num=i;
			for(int j=1;j<=column;j++) {
				if(num>=1&&num<=9) {
				System.out.print("0"+num+" ");}
				else {
					System.out.print(num+" ");
				}
				num=num+row;
				
			}
			
			System.out.println();
			
		}
		
	}

}
