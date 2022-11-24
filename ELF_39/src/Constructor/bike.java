package Constructor;

public class bike {
	static String name;
	 String brand;
	 String colour;

	 bike(String a,String b,String c){
		 bike.name=a;
		 this.brand=b;
		 colour=c;
		 
		 System.out.println("The name of bike is : "+a+"\n"+"The brand of bike is : "+b+"\n"+"The colour of bike is : "+c);
		 System.out.println("------------------------------------------");
	 }
	 
	public static void main(String[] args) {
		
		bike b1 = new bike("Hornet","Honda","Repsol");
		bike b2 = new bike("Hunter 350","Royal Enfield","Rebel Black");
		bike b3 = new bike("Ronin","TVS","Lighting Black");
		bike b4 = new bike("X pulse 200 4V","Hero","Trail Blue");
		bike b5 = new bike("Dominar 400","Bajaj","Aurora Green");
		

	}

}
