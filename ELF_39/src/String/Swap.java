package String;

public class Swap {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="All";
		
		s2=s2+s1;
		s1=s2.substring(s1.length()-5);
		s2=s2.substring(3,8);
	
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
