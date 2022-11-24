package SoMa_Scanner;

import java.util.Scanner;
public class Mul_bet_num{
	public int macha(int a) {
		int product=1;
		while(a!=0) {
			int lastnum = a%10;
			product = product*lastnum;
			a = a/10;
		}
		return product;
	}
	
	public static void main(String[] args) {
			Scanner soma = new Scanner(System.in);
			System.out.println("Enter the value to find multiplication b/w the number");
			int a = soma.nextInt();
			Mul_bet_num f1 = new Mul_bet_num();
			System.out.println(f1.macha(a));
	
		
	}

}
