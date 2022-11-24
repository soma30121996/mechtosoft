package array;

public class Duplicate {

	public static void main(String[] args) {
	
		int a[]= {1,1,2,2,2,3,3,4,4,5,5,6,6};
		int j=1;
		
		for(int i=0;i<a.length-1;i++) {
	
			if(a[i]!=a[j]) {
				System.out.print(a[i]+" ");	}
			j++;
		}
		
	}

}
