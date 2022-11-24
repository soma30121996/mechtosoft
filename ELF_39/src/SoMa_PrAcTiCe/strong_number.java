
package SoMa_PrAcTiCe;

public class strong_number {

	public static void main(String[] args) {
		
		
	for (int b=1;b<=100000;b++)	{
		int rem=0;
		int sum=0; 
		
		int a=b;
		int temp=b;
		while (a>0) {
			int j=1;
			rem=a%10;
			for(int i=1 ;i<=rem;i++) {
				j=j*i;
			}
			 sum = sum+j;
			a=a/10;}
		if(sum==temp) {
			System.out.println(b);
		}
		
		}
	}}