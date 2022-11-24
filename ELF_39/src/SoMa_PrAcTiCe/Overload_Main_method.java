package SoMa_PrAcTiCe;

//can we over load a main method 
//yes 

public class Overload_Main_method {

	public static void main(String[] args) {
		main(20,10==10);
		
		main("today",10.5);
	}
	
	public static void main(int a,boolean b) {
		System.out.println(a+"  "+  b);
	}
	public static void main(String a,double b) {
		System.out.println(a);
		System.out.println(b);
	}
}
