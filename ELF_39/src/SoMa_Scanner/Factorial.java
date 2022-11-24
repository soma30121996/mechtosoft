package SoMa_Scanner;
import java.util.Scanner;
public class Factorial{
	
	public static int fact(int a) {
	int	c=1;
		for (int i=1;i<=a;i++) {
			c= c*i;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner soma = new Scanner(System.in);
		System.out.println("Enter the value to find factorial of a given number");
		int a=soma.nextInt();
		System.out.println("The factorial of a given number is : "+fact(a));

	}

}
