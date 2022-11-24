package non_primitive_typecasting;

public class P1 {
	int a=10;
	int b=30;
	public static void main(String[] args) {
		Object o1=new P1();//upcasting
		P1 o2=(P1)o1;//downcasting
		System.out.println(o2.a);
		
		
	}

	
}
