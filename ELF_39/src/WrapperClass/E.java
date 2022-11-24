package WrapperClass;

public class E {

	public static void main(String[] args) {
		
		String s1="ELF 39 OCT 15 SATURDAY 2022";
		
	
		char c[]=s1.toCharArray();
		int sum=0;
		for(int i=0;i<s1.length();i++) {
			if(c[i]>='0' && c[i]<='9') {
				sum=sum+Integer.parseInt(c[i]+"");
			}
		
		}
		System.out.println(sum);
		
		

	}

}
