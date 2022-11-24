
public class Student {
	
	private String name;
	private int std;
	private double rollno;
	private char section;
	
	Student(String name,int std,double rollno,char section){
		this.name=name;
		this.std=std;
		this.rollno=rollno;
		this.section=section;
	}
	
	//get
	public String getName() {
		return this.name;
	}
	
	public int getStd() {
		return this.std;
	}
	
	public double getRollno () {
		return this.rollno;
	}
	
	public char getSection () {
		return this.section;
	}

	//set
	public void setName(String name) {
		 this.name=name;
	}
	
	public void setStd(int std) {
		this.std=std;
	}
	
	public void setRollno (double rollno) {
		this.rollno=rollno;
	}
	
	public void setSection (char section) {
		this.section=section;
	}
		

	

}
