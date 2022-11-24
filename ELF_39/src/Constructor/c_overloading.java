package Constructor;

public class c_overloading {
	
	c_overloading(String a,int b){
		System.out.println(a+" "+b);
		}
	
	c_overloading(int a,int b){
		System.out.println(a+b);
		}
	
	c_overloading(int a,int b,int c){
		System.out.println(a*b*c);
		}
	
	c_overloading(double d){
		System.out.println("Hi i'm double");
		}
	
	c_overloading(float d){
		System.out.println("Hi i'm float");
		}
	public static void main(String[] args) {
		
		c_overloading soma = new c_overloading("Happy",205);
		c_overloading soma1 = new c_overloading(5,205);
		c_overloading soma2 = new c_overloading(5,205,56);
		c_overloading soma3 = new c_overloading(205.4499);
		c_overloading soma4 = new c_overloading(230);

	}

}
