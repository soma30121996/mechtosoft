package CollectionFrameWorks;

import java.util.ArrayList;
import java.util.Iterator;

public class Itererator {

	public static void main(String[] args) {
		ArrayList  a= new ArrayList();
		a.add(10);
		a.add(2);
		a.add(3);
		a.add(10);
		a.add(10);
		a.add(true);
		System.out.println(a);
		
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
