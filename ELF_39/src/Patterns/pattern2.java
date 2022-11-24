package Patterns;

public class pattern2 {

	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=5;i++) {
			
			char ch='A';
			for (int p=4;p>=i;p--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i%2!=0) {
				System.out.print(num++ );
				System.out.print(" ");
			}
				else {
					System.out.print(ch++);
					System.out.print(" ");
				}}
			System.out.println(
					
					);
			
		}

	}

}
