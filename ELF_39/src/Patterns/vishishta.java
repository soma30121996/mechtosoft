package Patterns;

public class vishishta {

	public static void main(String[] args) {
	
		for (int i=1;i<=7;i++) {
				char ch='A';

				for(int j=1;j<=i;j++) {
						if (i%2!=0) {
							System.out.print(j+" ");}

						else{
							System.out.print(ch++ + " ");	}}
					
				System.out.println();
		
	
			}
		}
	}


