package array;

public class Ascending {

	public static void main(String[] args) {
		
		int a[]= {2,8,99,45,21,15,1};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
	}
	
	for(int i=0;i<a.length;i++) {
		for(int j=1+i;j<a.length;j++) {
			if(a[i]>a[j]) {
				int b=0;
				b=a[i];
				a[i]=a[j];
				a[j]=b; } } }
	
	System.out.println();
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	}		
	}