package String;

public class Master {

	public static void main(String[] args) {
		
		//Declare && Intialization Statement
		String a=" Hi macha ";
		String a1="Hi macha";
		System.out.println(a);
		System.out.println();
		
		//String using new keyword
		String s1 = new String ("Hi macha");
		String s2 = new String ("Hi macha");
		System.out.println();
		
		//Comparison
		System.out.println(a==a1);
		System.out.println(s1==s2);
		System.out.println(a==s1);
		System.out.println();
		
		//Concat method
		System.out.println("Conact Method");
		System.out.println(s1.concat(s2));
		System.out.println();
		
		//length method
		System.out.println("Length method");
		System.out.println(s1.length());
		System.out.println();
		
		//equals method
		System.out.println("equals method");
		System.out.println(s1.equals(a));
		System.out.println();
		
		//equals ignore method
		System.out.println("equals ignore method");
		System.out.println(s1.equalsIgnoreCase(s1));
		System.out.println();
		
		//CharAt Method
		System.out.println("CharAt Method");
		System.out.println(s1.charAt(2));
		System.out.println();
		
		//trim method
		System.out.println("trim method");
		System.out.println(s1.trim());
		System.out.println();
		
		//compareTo Method
		System.out.println("compareTo Method");
		System.out.println(s1.compareTo(s2));
		System.out.println();
		
		//Substring Method
		System.out.println("Substring Method");
		System.out.println(s1.substring(2));
		System.out.println(s2.substring(1, 6));
		System.out.println();
		
		//toUppercase Method
		System.out.println("toUppercase Method");
		System.out.println(s1.toUpperCase());
		System.out.println();
		
		//toLowercase Method
		System.out.println("toLowercase Method");
		System.out.println(s2.toLowerCase());
		System.out.println();
		
		//contains Method
		System.out.println("Contains Method");
		System.out.println(s1.contains(s2));
		System.out.println();
		
		//startsWith Method
		System.out.println("startsWith Method");
		System.out.println(s1.startsWith("Hi"));
		System.out.println();
		
		//endsWith Method
		System.out.println("endsWith Method");
		System.out.println(s2.endsWith("maga"));
		System.out.println();
		
		//split Method
		System.out.println("Split Method");
		System.out.println(s1.split(""));
		System.out.println(s2.split("", 1));
		System.out.println();
		
		//indexOf Method
		System.out.println("indexOf Method");
		System.out.println(s1.indexOf(2));
		System.out.println();
		
		//indexOfchar Method
		System.out.println("indexOfchar Method");
		System.out.println(s2.indexOf('a'));
		System.out.println(s1.indexOf(1,'a'));
		System.out.println(s2.indexOf('a', 5));
		System.out.println();
		
		//indexOfString Method
		System.out.println("indexOfString Method");
		System.out.println(s1.indexOf("Hi"));
		System.out.println(s2.indexOf("maga", 1));
		System.out.println();
		
		//tocharArray Method
		System.out.println("tocharArray Method");
		System.out.println(s2.toCharArray());
		System.out.println();
		
		
		

	}

}
