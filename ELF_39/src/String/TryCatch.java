package String;

public class TryCatch {

	public static void main(String[] args) {
		int a[]=null;
		try {
			a[1]=20;
			System.out.println(a[0]);
		}
		catch(ArithmeticException e) {
			System.out.println("Handeled");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("hi ");
		}
	}

}
