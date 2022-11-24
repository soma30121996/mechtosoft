package WrapperClass;

public class A {

	public static void main(String[] args) {
		int a=10;
		Integer b= Integer.valueOf(a);
		System.out.println(b);//non primitive
		System.out.println(a);//prirmitive
		
		char c='a';
		Character ch= Character.valueOf(c);
		System.out.println(ch);
		
		boolean b1=true;
		Boolean b2=Boolean.valueOf(b1);
		System.out.println(b2);

		
	}

}
