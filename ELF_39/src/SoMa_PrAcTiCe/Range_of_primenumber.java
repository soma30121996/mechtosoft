package SoMa_PrAcTiCe;

public class Range_of_primenumber {
	public static void main(String[] args) {
		boolean prime;
		for(int i=1;i<=100;i++) {
			prime=true;
		
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					prime=false;
					break;
				}}
			
			if(i==1) {
				continue;
			}
				
			else if(prime==true) {
				System.out.print(i+" ");}
				
		}
	}

}
