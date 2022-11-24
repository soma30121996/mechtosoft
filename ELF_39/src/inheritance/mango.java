package inheritance;

public class mango extends fruits {

	public static void main(String[] args) {
		
		mango m1 = new mango();
		m1.price=256.5;
		m1.name="mango";
		m1.kg=20.5;
		System.out.println("The name of fruit is :"+m1.name);
		System.out.println("The price of fruit is :"+m1.price);
		System.out.println("The kg of fruit is :"+m1.kg);
		m1.taste();
	}

}
