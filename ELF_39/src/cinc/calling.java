package cinc;

public class calling {

	static int a=10;
	int b;
	String s="soma";
	
	public static void m1() {
		int a=10,b=30;
		int c=a+b;
		System.out.println("static method m1");
		System.out.println(c);
		calling a1 = new calling ();
		System.out.println(a1.s);
	}
	public int m2(int a,int b) {
		System.out.println("Non static method");
		b=this.b;
		int c=a+b;
		
		return c;
		
		
	}

}
