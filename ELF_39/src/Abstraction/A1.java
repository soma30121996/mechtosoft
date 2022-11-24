package Abstraction;

abstract public class A1 {
	
	A1(int a){
		this(10,20);
		System.out.println("Hi i'm super class");
	}
	
	A1(int b,int c){
		System.out.println(b+c);
	}
		abstract void un();
		
		void password() {
			System.out.println("password");
		}
		void login() {
			System.out.println("login successful");
		}
	}

	


