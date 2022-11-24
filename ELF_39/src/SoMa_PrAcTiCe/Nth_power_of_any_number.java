package SoMa_PrAcTiCe;

public class Nth_power_of_any_number {

	public static void main(String[] args) {
		int a=5;
		int n=2;
		int power=1;
		for (int i=1;i<=n;i++) {
			power=power*a;
		}
		System.out.println(power);
	}

}
