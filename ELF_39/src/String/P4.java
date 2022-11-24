package String;

public class P4 {

	public static void main(String[] args) {
		String s1="java";String s2="";
		
		
		char c[]=s1.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			s2=s2+c[i];	
		}
		s1=s2;
		System.out.println(s1);
	}

}
