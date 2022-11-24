package array;

public class sum_composite {

	public static void main(String[] args) {
		
		boolean soma=false;
		int sum=0;
		int num=30;
		
		for (int i=num;i<=60;i++) {
			 num =i;
			for(int j=30;j<=num;j++) {
				if (num%i==0) {
					soma=true;
					break;}}}
		
				if (soma==true) {
					sum=sum+num;
				}
				
				
		System.out.println("The sum of composite number is : "+sum);
		}
	
			}
		
	

