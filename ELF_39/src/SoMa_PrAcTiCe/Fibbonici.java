package SoMa_PrAcTiCe;

public class Fibbonici {

	public static void main(String[] args) {
		 int a=0,b=1,sum=0;
		 
		 for(int i=0;i<=10;i++) {
			 if(i==0||i==1) {
				 System.out.print(i+" ");
			 }
			 else {
				 sum=a+b;
				 a=b;
				 b=sum;
				 System.out.print(sum+" ");
			 }
		 }

	}

}
