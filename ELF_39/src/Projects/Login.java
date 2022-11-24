package Projects;

public class Login {
	
	public String username( String a) {
		System.out.println("The user name is : ");
		return a;	
	}
	
	public int password(int b) {
		 System.out.println("The password is (only numbers)" );
		 return b;	
	}
	
	public void login() {
		System.out.println("click on login button");	
	}

	public static void main(String[] args) {
		Login l = new Login ();
		System.out.println(l.username("Soma"));
		System.out.println(l.password(1234));	
		l.login();
	}

}
