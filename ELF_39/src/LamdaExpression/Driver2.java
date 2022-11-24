package LamdaExpression;

public class Driver2 {

	public static void main(String[] args) {
		I2 i= (int a,int b)->{
			
			int e=a+b;
			return e;
		};
		i.m(10, 20);
		System.out.println(i.m(10, 20));
		]

	}

}
