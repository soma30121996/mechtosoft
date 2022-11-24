package Patterns;

public class Alpha_triangle {
	public static void main(String[] args) {
		int a=65;
		for(int i=1;i<=4;i++) {
			
			for(int space=3;space>=i;space--) {
						System.out.print(" ");
							}
			for(int j=1;j<=i;j++) {
				System.out.print((char)a++ +" ");}
			
			//for(int j=2;j<=i;j++) {
				//System.out.print('*'+" ");}
			
				System.out.println();		
			}
		
	}
}
