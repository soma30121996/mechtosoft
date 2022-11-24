package String;

public class P2 {

	public static void main(String[] args) {
	String s1="SOMA";
	String s2="";
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)!='A') {
			s2=s2+s1.charAt(i);
		}
	}
	s1=s2;
System.out.println(s1);
	}

}
