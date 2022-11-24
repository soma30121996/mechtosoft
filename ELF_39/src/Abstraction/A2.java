package Abstraction;

abstract public class A2 extends A1 {
	
	A2(){
		super(10);
		System.out.println("Hi i'm sub class");
	}

	void un() {
		System.out.println("User name");
	}
	
	abstract void forgotpassword();
	
	

	}


