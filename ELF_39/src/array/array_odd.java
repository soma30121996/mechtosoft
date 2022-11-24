package array;

import java.util.Scanner;

public class array_odd {

	public static void main(String[] args) {
		
		Scanner soma = new Scanner (System.in);
		System.out.println("Enter the Size of the array");
		int size = soma.nextInt();
		int a[] = new int[size];
		
		for (int i=0;i<a.length;i++) {
			System.out.println("Enter the values to array : ");
				
				int j=soma.nextInt();
				if(j%2!=0) {
					a[i]=j;
					}
				else {
					System.out.println("Error:"+"\n"+"The array will accepet only odd numbers");
					System.out.println();
					i--;
					continue;
				}
								}
		
		System.out.println("The odd values entered into array are :");
				
		for (int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		}
		}
		
		

	}


