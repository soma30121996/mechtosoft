package CollectionFrameWorks;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList<>();
		l.add(10);
		l.add(200);
		l.add(5);
		l.add(50);
		l.add(70);
		l.add(110);
		System.out.println(l);
		
		l.addFirst(402);
		System.out.println("Add first method "+l);
		System.out.println();
		
		l.addLast(86);
		System.out.println("Add last method "+l);
		System.out.println();
		
		System.out.println("get first method "+l.getFirst());
		System.out.println();
		System.out.println("get last method "+l.getLast());
		System.out.println();
		
		l.removeFirst();
		System.out.println("Remove first "+l);
		System.out.println();
		
		l.removeLast();
		System.out.println("Remove last "+l);
		System.out.println();
	}
	

}
