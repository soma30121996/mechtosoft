package SoMa_PrAcTiCe;

public class C {
	
		public static void main(String[] args) {
			for(int i=1;i<=7;i++) {
				
				for(int space=7;space>i;space--) {
							System.out.print(" ");
								}
				for(int j=1;j<=i;j++) {
					System.out.print('*');
				}
				for(int j=2;j<=i;j++) {
					System.out.print('*');}
				
					System.out.println();		
				}
			
			
			//reverse triangle
			
for(int i=1;i<=7;i++) {
	for(int j=2;j<=i;j++) {
		System.out.print('*');}
	
	for(int space=i;space>6;space--) {
		System.out.print(" ");
			}
for(int j=1;j<=i;j++) {
System.out.print('*');
}
	
		System.out.println();		
	}

				
				
				
			
		}
}

	

