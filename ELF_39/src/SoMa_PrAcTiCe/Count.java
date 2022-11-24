package SoMa_PrAcTiCe;

public class Count {

	public static void main(String[] args) {
		int num = 12345;
		int count=0;int b=0;
		while(num>0) {
			count++;
			b=num%10;
			num=num/10;
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("The count of number is "+count);
		
	}

}
