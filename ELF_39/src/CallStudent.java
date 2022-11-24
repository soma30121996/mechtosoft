
public class CallStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Soma",5,01,'A');

		Student s2 = new Student("chetan",6,02,'B');
		
		Student s3 = new Student("mahesh",6,03,'C');
		
		Student s4 = new Student("Suresh",8,0053,'C');
		
		Student s5 = new Student("Sanku",9,553,'C');
		
		
		display(s1);
		display(s2);
		display(s3);
		display(s4);
		display(s5);
	}
		
		public static void display(Student s) {
		System.out.println("---------The Student details as follows----------");
		System.out.println(s.getName());
		System.out.println(s.getStd());
		System.out.println(s.getSection());
		System.out.println(s.getRollno());


	}

}
