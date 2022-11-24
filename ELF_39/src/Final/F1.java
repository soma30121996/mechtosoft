package Final;

public class F1 {
	final int a=10;
	static int b=20;
	public static void main(String[] args) {
		F1 f = new F1();
		f.a=25;//we can't reintialize the variable which is declared as final(Non Static)
		
		b=30;//we can't reintialize the variable which is declared as final (Static)
		System.out.println(b);
		
	}
		
	}

