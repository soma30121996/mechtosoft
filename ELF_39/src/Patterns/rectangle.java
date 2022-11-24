package Patterns;

public class rectangle {
	public static void main(String[] args) {
	
	for (int i=1;i<=5;i++) {
		
		for (int j=1;j<=5;j++) {
			
			if (i==2 && j==2||i==2 && j==3 ||i==2 && j==4 ){
							System.out.print("  ");
			}
			else if (i==3 && j==2||i==3 && j==3 ||i==3 && j==4 ){
				System.out.print("  ");
}

			else if (i==4 && j==2||i==4 && j==3 ||i==4 && j==4 ){
				System.out.print("  ");
}
			else {
			System.out.print("*" +" ");}
		}
		System.out.println();
	}
	
	System.out.println("-------------------------------------------------------------");
	
	//optimized
	
	for (int i=1;i<=5;i++) {
		if(i==1||i==5) {
			for(int j=1;j<=5;j++) {
				System.out.print('*'+" ");
			}} 
			
			else {
				for(int j=1;j<=5;j++) {
					if(j==1 || j==5) {
						System.out.print('*'+" ");
					}
					else {
						System.out.print(' '+" ");
					}}}
		System.out.println();}
	
	
	}

}
