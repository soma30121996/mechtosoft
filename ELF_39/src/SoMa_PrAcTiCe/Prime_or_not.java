package SoMa_PrAcTiCe;

public class Prime_or_not {

	public static void main(String[] args) {
	boolean prime=true;
	int a=60;
	for(int i=2;i<a;i++){
		prime=true;
		if(a%i==0) {
			prime=false;
			break;
		}}
	if(prime==true) {
		System.out.println("The number is prime number ");
			}
	else {
		System.out.println("It is not a prime number");
	}

	}

}
