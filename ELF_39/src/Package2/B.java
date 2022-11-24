package Package2;


import Package1.*;//import 

public class B {
	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.a);
		System.out.println(a1.b+" "+a1.cc);
		a1.add();
		
	}

}
