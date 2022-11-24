package inheritance;

public class M2 {
	void gt(int a) {
		System.out.println(" continental GT");
	}
	void re(String a) {
		System.out.println("classic 350");
	}
	public static void main(String[] args) {
		
		M2 z1=new M2();//parent
		
		M3 z2=new M3();//child
		
		z1.gt(10);
		z1.re("baro");
		z1=z2;
		z2.re("hello");
		z2.gt(60);
		
		
	}

}
