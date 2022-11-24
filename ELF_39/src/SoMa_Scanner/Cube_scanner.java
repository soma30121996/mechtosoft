package SoMa_Scanner;

import java.util.Scanner;

public class Cube_scanner {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to find the cube it");
		int a=sc.nextInt();
		int cube=1;
		for(int i=1;i<=3;i++) {
			cube=a*cube;
		}
		System.out.println("The cube root of number is : "+"\n"+cube);

	}

}




