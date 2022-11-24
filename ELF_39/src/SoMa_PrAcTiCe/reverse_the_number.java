package SoMa_PrAcTiCe;

public class reverse_the_number {

	public static void main(String[] args) {
		int number=6589;
		int reverse=0;
		while(number>0) {
			int rem =number%10;
			reverse=(reverse*10)+rem;
			number=number/10;
		}
		System.out.print(reverse);
	}

}
