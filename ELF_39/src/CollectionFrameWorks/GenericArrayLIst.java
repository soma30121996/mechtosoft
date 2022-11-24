package CollectionFrameWorks;

import java.util.ArrayList;

public class GenericArrayLIst {

	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList();
		a.add(10);
		a.add(2);
		a.add(3);
		a.add(10);
		a.add(10);
		for(Integer O:a) {
			System.out.println(O);
		}

	}

}
