package Encapsulation;

public class E2 {

	public static void main(String[] args) {
		E1 soma = new E1();
		
		System.out.println(soma.getBal());
		soma.setbal(10000);
		System.out.println(soma.getBal());
		
		System.out.println(soma.getName());
		soma.setName("Soma");
		System.out.println(soma.getName());
		
		

	}

}
