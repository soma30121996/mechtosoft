package CollectionFrameWorks;

import java.util.ArrayList;
import java.util.Vector;

public class VectorV1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(10);
		v.add("Hello");
		v.addElement(25);
		System.out.println(v);
		for(Object o:v) {
			System.out.println(o);
		}
	}

}