package Patterns;

public class Square {

	public static void main(String[] args) {
		
		char ch='A';int num=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==2||i==3) {
					if(j==2||j==3) {
						System.out.print(num++ +" ");}
					
					else{
						System.out.print(ch++ +" ");}}
			
				else {
					System.out.print(ch++ +" ");}	
			}
			System.out.println();
		}

	}

}
