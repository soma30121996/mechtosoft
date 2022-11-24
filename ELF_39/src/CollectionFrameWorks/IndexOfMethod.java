package CollectionFrameWorks;

import java.util.ArrayList;

public class IndexOfMethod {

	public static void main(String[] args) {
		ArrayList  a= new ArrayList();
		a.add(10);
		a.add(2);
		a.add(3);
		a.add(10);
		a.add(10);
		a.add(true);
		System.out.println(a);
		System.out.println(a.indexOf(10));
		System.out.println(a.lastIndexOf(10));

	}

}
