package String;

public class P1 {

	public static void main(String[] args) {
	String s1= "JAAVAAVV";int count =0;int count1=0;
    //System.out.println(s1.length());
    for(int i=0;i<s1.length();i++) {
    	if(s1.charAt(i)=='A') {
    		count++;
    	}
    	else if(s1.charAt(i)=='V') {
    		count1++;
    		
    	}
    		
	}
System.out.println(count);
System.out.println(count1);
}
}
