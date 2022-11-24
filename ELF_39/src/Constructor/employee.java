package Constructor;

public class employee {
	
	String name1;
	double sal1;
	int employeeId;
	
	employee(String name,double sal,int id){
		this.name1=name;
		this.sal1=sal;
		this.employeeId=id;
		
		System.out.println("The name of emoployee is : " +name+"\n"+"The salary of emoployee is : " +sal+"\n"+"The emoployee ID is : " +employeeId);
		System.out.println("---------------------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		
		employee e1 = new employee("Soma",2560.30,1001);
		employee e2 = new employee("Raj",28960.30,1002);
		employee e3 = new employee("chetu",287960.30,1004);
		employee e4 = new employee("Raghu",25560.30,1003);
		employee e5 = new employee("Sanku",256550.30,1005);

	}

}
