package SoMa_Scanner;
	

import java.util.Scanner;
public class Count{
	public static void main(String[] args) {
			Scanner soma=new Scanner(System.in);
			System.out.println("Enter the value ");
			int a=soma.nextInt();
			int count=0;
				
			while(a!=0) {
				count++;
				a=a/10;
			}
				
		System.out.println(count);
		
	}

}
