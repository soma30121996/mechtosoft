
public class pattern2 {

	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=5;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				if(i%2!=0) {
				System.out.print(num++);
			}
				else {
					System.out.print(ch++);
				}}
			System.out.println();
			
		}

	}

}
