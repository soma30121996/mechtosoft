package Patterns;

public class diamond {

	public static void main(String[] args) {
		
	for(int i=1;i<=3;i++) {
			for (int space =2;space>=i;space--) {
				System.out.print("  ");
			}
		for(int j=1;j<=i;j++) {
				System.out.print('*'+" ");
			
			
	
	}
			for(int j=2;j<=i;j++) {
				System.out.print('*'+" ");
			}
			System.out.println();}
		
		for(int i=1;i<=3;i++) {
		
			for(int space=1;space<=i;space++) {
			System.out.print("  ");
		}
		
			for (int j=2;j>=i;j--) {
			System.out.print('*'+" ");}
			
			for (int j=1;j>=i;j--) {
				System.out.print('*'+" ");}
			System.out.println();}
			
	}
}