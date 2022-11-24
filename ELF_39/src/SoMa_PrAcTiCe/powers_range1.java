package SoMa_PrAcTiCe;

public class powers_range1 {
	
		
	public static void main(String[] args) {
		int a=153;
		int c=a;
		int b=a;
		int count=0;
		int sum=0;
		while(b>0) {
			//a=a/10;
			b=b/10;
			count++;
			}
		System.out.println(count);
		
		while(a>0) {
			int rem =a%10;
			int d=(int)Math.pow(rem,count);
			sum=sum+d;
			a=a/10;
		}
		
		System.out.println(sum);
	}}
			