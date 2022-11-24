package String;

public class LastIndex {

	public static void main(String[] args) {
		String s1="ABCDABCDA";
		System.out.println(s1.lastIndexOf("A"));
		System.out.println(s1.lastIndexOf('A',7));
		System.out.println(s1.lastIndexOf("CDA", 8));
        System.out.println(s1.lastIndexOf("CDA", 5));
	}

}
