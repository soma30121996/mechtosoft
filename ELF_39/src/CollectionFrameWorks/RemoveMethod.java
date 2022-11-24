package CollectionFrameWorks;

import java.util.ArrayList;

public class RemoveMethod {

	public static void main(String[] args) {
		ArrayList  a= new ArrayList();
		a.add(10);
		a.add(2);
		a.add(3);
		a.add(10);
		a.add(true);
		System.out.println(a);
		a.remove(2);
		a.remove(new Integer(10));
		a.remove(new Integer(10));
		System.out.println(a);
		
	}

}
