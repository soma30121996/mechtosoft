package CollectionFrameWorks;

import java.util.ArrayList;

public class AddAllMethod {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(10);
		a.add(2);
		a.add(3);
		a.add(10);
		a.add(150);
		ArrayList a1= new ArrayList();
		a1.add(120);
		a1.add(112);
		a1.add(1253);
		a1.add(1230);
		a1.add(12250);
		a1.add(a);
	System.out.println(a1);
		//System.out.println(a1.size());
		//System.out.println(a);
		//System.out.println(a.size());
		a1.addAll(a);
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a);
		System.out.println(a.size());
	}

}
