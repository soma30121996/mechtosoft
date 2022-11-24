package String;

import java.io.IOException;
import java.sql.SQLException;

public class Throws {
	
	public static void m() throws Exception{
		
		System.out.println(1/0);
		System.out.println("Hi macha");
		
	}
		
	public static void m1() throws SQLException {
		System.out.println("Hi");
	}
	public static void main(String[] args) throws Exception{
		
		m1();
		m();

	}

}
