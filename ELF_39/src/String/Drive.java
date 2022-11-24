package String;

import java.util.Scanner;

public class Drive {

	public static void main(String[] args) {
		Scanner soma = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = soma.nextInt();
		if(age<18) {
			throw new YoungerAgeException("You can't vote");
		}
		else {
			System.out.println("you can vote");
		}
		
	}

}
