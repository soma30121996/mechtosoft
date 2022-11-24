package array;

public class Min_Max {

	public static void main(String[] args) {
		
		int a[]= {2,1,3,6,8,7,9,4};
		
		for (int i=0;i<a.length;i++) {
			for(int j=1+i;j<a.length;j++) {
				if(a[i]>a[j]) {
				int b=a[i];
				a[i]=a[j];
				a[j]=b;
			}}}
		
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			
		int d=a[a.length-1];
		int c=a[1];
		int add=d+c;
		System.out.println("The addition is : "+add);
		
		}
	}



