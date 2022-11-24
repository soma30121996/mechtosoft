package SoMa_PrAcTiCe;

	public class Composite_num {

		public static void main(String[] args) {
			int sum=0;
			for (int j=30;j<=60;j++) {
				
				if(j==1) {
					continue;}
				
				boolean soma= true;
				for (int i=2; i<j;i++) {
					if(j % i==0) {
						soma=false;
						break;}}
			
				if (soma==false) {
					System.out.print(j+" ");
					sum=sum+j;}
				
				else {
					continue;}}
			
			System.out.println("\n"+sum);
		}
	}