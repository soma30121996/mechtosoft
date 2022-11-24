package Patterns;

public class pattern1 {

	public static void main(String[] args) {
		
		for (int i=1;i<=6;i++) {
			int num=1;char ch='A';
			for(int j=1;j<=i;j++) {
				if(i==j) {
					System.out.print("@"+" ");
				}
				else {
					System.out.print(num++ +" ");
				}}
			for(int p=5;p>=i;p--) {
			System.out.print(ch++ +" ");
		}
		System.out.println();}

	}

}
