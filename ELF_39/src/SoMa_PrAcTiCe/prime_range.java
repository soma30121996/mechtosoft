package SoMa_PrAcTiCe;

public class prime_range {

	public static void main(String[] args) {
		int sum=0;
		for (int j=1;j<=60;j++) {
			
			if(j==1) {
				continue;
			}
			
			boolean soma= true;
			for (int i=2; i<j;i++) {
				if(j % i==0) {
					soma=false;
					break;}
			}
		
			if (soma==false) {
					continue;	}
			
			else {
				System.out.print(j+" ");	}
			sum=sum+j;
		}
		System.out.println(sum);

	}

}
