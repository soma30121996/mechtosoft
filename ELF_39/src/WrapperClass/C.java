package WrapperClass;

public class C {

	public static void main(String[] args) {
		Integer a=10;
		Integer a1= new Integer(a);
		System.out.println(a1);//non primitive
		int b=a.intValue();//NPDT to PDT
		System.out.println(b);
	
		
		Character c='a';
		Character d=c.charValue();
		System.out.println(d);
		
		

	}
}
