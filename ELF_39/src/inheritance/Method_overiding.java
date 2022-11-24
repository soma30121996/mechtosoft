package inheritance;

public class Method_overiding {
	public void soma() {
		System.out.println("yako herona neenu");
	}
	public void  sanku(int a) {
		System.out.println(" sanku neen dodda janana");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Method_overiding m1=new Method_overiding();
			M1 m2=new M1();
			m1.soma();
			m1=m2;
			m1.soma();
			m1.sanku(18);
			m2.soma();
			
			
		}
}


