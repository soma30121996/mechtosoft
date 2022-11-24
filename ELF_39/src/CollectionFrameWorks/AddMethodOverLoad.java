package CollectionFrameWorks;

import java.util.ArrayList;

public class AddMethodOverLoad {

	public static void main(String[] args) {
		ArrayList  a= new ArrayList();
		a.add(10);
		a.add(2);
		a.add(3);
		a.add(10);
		a.add(10);
		a.add(true);
		System.out.println(a);
		a.add(1,402);//method overload
		System.out.println(a);
	}

}
