package SoMa_PrAcTiCe;

public class Sum_of_Prime {
	public static void main(String[] args) {
	boolean prime;int sum=0;
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
			sum=sum+i;
			}
			
	}
	System.out.print(sum+" ");
}

}

