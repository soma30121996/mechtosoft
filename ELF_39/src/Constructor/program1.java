package Constructor;

public class program1 {
	//Constructor creation class name & constructror name name should be same	
		program1(){
			
			System.out.println("hi Soma");
		}

	public static void main(String[] args) {
		
		//since constructor is a non static member we can call constructor using object creation statement
		program1 a1 = new program1();

	}

}
