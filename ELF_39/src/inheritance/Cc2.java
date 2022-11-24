package inheritance;

public class Cc2 extends Cc_static {
	Cc2(int a,int b){
		this(10);
		System.out.println(80);
	}
 Cc2(int a){
	 super(10);
	 System.out.println("78");
 }
 {
	 System.out.println(" kantara ivatte nodona");
 }
 static {
	 System.out.println(" soma hengide maiyge");
 }
 	public static void main (String[]args) {
 		Cc2 e1=new Cc2(10);
 	}
}
