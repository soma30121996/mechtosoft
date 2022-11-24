package String;
public class Sbuffer {

	public static void main(String[] args) {
		StringBuffer b= new StringBuffer("Hello");
		StringBuffer b1= new StringBuffer("Hello");
		System.out.println(b.append("all"));
		System.out.println(b==b1);
		System.out.println(b.equals(b1));
	}

}
