package CollectionFrameWorks;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		ArrayList  a= new ArrayList();
		a.add(10);
		a.add(2);
		a.add(3);
		a.add(10);
		a.add(10);
		a.add(true);
		System.out.println(a);
		 
		for(Object o :a) {
			System.out.println(o);
		}
			
		}
	

}
