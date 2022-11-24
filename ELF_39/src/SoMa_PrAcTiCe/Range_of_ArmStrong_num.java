package SoMa_PrAcTiCe;

public class Range_of_ArmStrong_num {

	public static void main(String[] args) {
		//int count=0; int rem=0; int split=0;int sum=0;//re-intialization should be done
		for(int i=1;i<=1000000;i++) {
			int a=i;int b=i;int count=0; int rem=0; int split=0;int sum=0;
			while(a>0) {
				count++;
				a/=10;
			}
			while(b!=0) {
				rem=b%10;
				split=(int) Math.pow(rem,count);
				sum=sum+split;
				b/=10;
			}
			if(sum==i) {
			System.out.print(sum+" ");}
			
			
		}
		

	}

}
